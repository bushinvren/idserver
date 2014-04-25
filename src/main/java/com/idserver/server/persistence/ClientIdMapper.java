package com.idserver.server.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.idserver.server.domain.ClientId;

public interface ClientIdMapper {
	
	public List<ClientId> getClientIdSelected(@Param("sNum") String sNum,@Param("status") int status);
	public int getIdCount();
	public void setClientIdEnable(@Param("sNum") String sNum, @Param("deviceNum") String deviceNum);
	public void addNewClientId(@Param("sNum") String sNum,@Param("status") int status);
	
	public int getRegisterClientId(@Param("deviceNum") String deviceNum);

}
