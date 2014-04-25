package com.idserver.server.domain;

import java.io.Serializable;

public class ClientId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String sNum;
	private int status;
	private String deviceNum;
	
	public String getDeviceNum() {
		return deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientid() {
		return sNum;
	}
	public void setClientId(String sNum) {
		this.sNum = sNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
