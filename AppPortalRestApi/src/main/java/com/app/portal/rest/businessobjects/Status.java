package com.app.portal.rest.businessobjects;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( 
	    name = "StatusType"
	 	    
		) 
	@XmlRootElement( 
	    name = "Status")
public class Status {

	private int code;
	private String message;
	private Data data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}	
}
