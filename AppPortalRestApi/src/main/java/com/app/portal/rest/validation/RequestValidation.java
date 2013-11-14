package com.app.portal.rest.validation;

import org.apache.cxf.wsdl.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.portal.rest.businessobjects.ConfigurationBO;
import com.app.portal.rest.businessobjects.Status;

@Component
public class RequestValidation {

	@Autowired
	private ConfigurationBO configurationBO;
	
	public Status validateAccess(String type, String language, String hardwareId){
		Status status = new Status();
		String message = "";
		if(isEmptyString(type) || isEmptyString(language) || isEmptyString(hardwareId)){
			status.setCode(400);
			message = "Parameters Should Not Be Empty,";
		}else{
			if(!configurationBO.getTypeList().contains(type)){
				status.setCode(401);
				status.setMessage("Invalid Configuration");
				message = "Invalid Type,";
			}
			if(!configurationBO.getLanguageList().contains(language)){
				status.setCode(401);
				message = "Invalid Configuration,";
			}
		}
		if(!message.trim().equalsIgnoreCase("")){
			status.setMessage(message);
		}
		return status;
	}
	public boolean isEmptyString(String value) {
		
		if (value == null || value.trim() == "" || value.isEmpty() || value.trim().equalsIgnoreCase("")) {
			return true;
		} else {
			return false;
		}
	}
}
