package com.idserver.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idserver.server.domain.ClientId;
import com.idserver.server.domain.Results;
import com.idserver.server.service.ClientIdService;

@Controller
public class ClientIdController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ClientIdController.class);
	
	@RequestMapping(value = "/checkSNUM", method = RequestMethod.GET)
	@ResponseBody
	boolean checkSNUM(@RequestParam(value = "sNum") String sNum,@RequestParam(value = "deviceNum") String deviceNum)
	{
		if(sNum.endsWith("00000000"))
		{
			return true;
		}
		
		logger.info("/you have request for getClientIdSelected");
		ClientIdService service = new ClientIdService();
		String temp_data = sNum.toUpperCase();
		
		//判断该手机是否被注册过
		int register=service.getRegisterClientId(deviceNum);
		if(register>0)
		{
			return true;
		}
		
		List<ClientId> ids = service.getClientIdSelected(temp_data,0);
		Results<ClientId> results = new Results<ClientId>();
		results.setResults(ids);
		if(results.getCount()>0)
		{
			service.setClientIdEnable(temp_data,deviceNum);
			/*
			List<ClientId> ids_final = service.getClientIdSelected(temp_data,1);
			results.setResults(ids_final);
			*/
			return true;
		}
		else
		{
			//return results;
			return false;
		}
	}

}
