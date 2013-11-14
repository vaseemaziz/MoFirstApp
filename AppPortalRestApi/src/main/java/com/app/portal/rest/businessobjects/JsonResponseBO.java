package com.app.portal.rest.businessobjects;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( 
	    name = "JsonResponseBOType"
	 	    
		) 
	@XmlRootElement( 
	    name = "JsonResponseBO")
public class JsonResponseBO {
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
