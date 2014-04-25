package com.idserver.server.service;

import java.util.List;
import com.idserver.server.domain.ClientId;
import com.idserver.server.persistence.ClientIdMapper;

public class ClientIdService extends BaseService{
	
	private ClientIdMapper mapper;
	
	public ClientIdService()
	{
		this.mapper = AC.getBean(ClientIdMapper.class);
	}
	
	public List<ClientId> getClientIdSelected(String sNum,int status)
	{
		return this.mapper.getClientIdSelected(sNum,status);
	}
	
	public int getRegisterClientId(String deviceNum)
	{
		return this.mapper.getRegisterClientId(deviceNum);
	}
	
	public int getIdCount()
	{
		return this.mapper.getIdCount();
	}
	
	public void setClientIdEnable(String sNum,String deviceNum)
	{
		this.mapper.setClientIdEnable(sNum,deviceNum);
	}
	
	public void addNewClientId(String sNum,int status)
	{
		this.mapper.addNewClientId(sNum, status);
	}

}
