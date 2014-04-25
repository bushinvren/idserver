package com.idserver.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class BaseService {
	public static final Logger logger = LoggerFactory.getLogger(BaseService.class);
	public ApplicationContext AC;

	protected String filterString = "";
	
	protected boolean isReadAll = false;
	
	private final static String basepath="http://oss.aliyuncs.com/everycontrol/";
	
	public void setIsReadAll(boolean isReadAllFlag){
		this.isReadAll = isReadAllFlag;
	}
	
	public BaseService() {
		this.AC = new ClassPathXmlApplicationContext("datasource-context.xml");
	}

	/**
	 * 
	 * @param filterStr
	 * 
	 */
	public String getBasepath() {
		return basepath;
	}
		
}
