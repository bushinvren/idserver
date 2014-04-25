package com.idserver.server.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idserver.server.service.ClientIdService;


@Controller
public class IdCreatorController {
	private static final Logger logger = LoggerFactory
			.getLogger(IdCreatorController.class);
	
	@RequestMapping(value = "/installId", method = RequestMethod.GET)
	@ResponseBody
	boolean installId(@RequestParam(value = "num") int num,@RequestParam(value = "length") int length)
	{
		logger.info("you have request for installId");
		if(length < 37)
		{
			ClientIdService service = new ClientIdService();
			//存储字符串图谱，标记该位置是否已被用过
			//final boolean idmap[][] = new boolean[36][length];
			
			//可用的字符
			final char ids[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','P','Q','R','S','T','U','V','W','X','Y','Z'};
			
			//存储当前生成的字符串所在id中的位置
			//final int state[][] = new int[length][2];
			
			//存储id字符串
			char id[] = new char[length];
			
			int index = 0;
			//int count = 0;
			Random random_num = new Random();
			
			for(int i=0;i<num;i++)
			{
				for(int j=0;j<length;j++)
				{
					//获取一个随机数，36以内
					index = (Math.abs(random_num.nextInt()))%34;
					
					//暂存这个随机数对应的ids中的字符
					id[j] = ids[index];
					/*
					//存储下这个字符在最终的id中出现的位置
					state[j][0] = index;
					state[j][1] = j;

					//如果这个位置已经被用过就让count加一
					if(idmap[index][j] == true)
					{
						count += 1;
					}
					*/
				}
				service.addNewClientId(String.valueOf(id), 0);
				/*
				//如果count小于10，此次产生的随机id以前没有产生过
				if(count < length)
				{
					//在这里插入数据库这个随机id
					service.addNewClientId(String.valueOf(id), 0);
					//将相应文职的state至为true
					for(int x=0;x<length;x++)
					{
						idmap[state[x][0]][state[x][1]] = true;
					}
					
				}
				else//count=10，此次产生的随机id以前产生过，需重新差生。
				{
					System.out.println("error");
					i--;
				}

				//count归零
				count=0;
				*/
				if(i == num-1)
				{
					//获取到数据库中的数据离要求的id数还差多少，然后在继续插入
					num = num - service.getIdCount();
					i = -1;
				}
			}
			return true;
		}
		else
			return false;
		
	}
	
}
