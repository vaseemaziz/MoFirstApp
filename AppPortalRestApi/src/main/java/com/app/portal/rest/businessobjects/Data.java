package com.app.portal.rest.businessobjects;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( 
	    name = "DataType"
	 	    
		) 
	@XmlRootElement( 
	    name = "Data")
public class Data {
	private String registrationId;
	private String token;
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
