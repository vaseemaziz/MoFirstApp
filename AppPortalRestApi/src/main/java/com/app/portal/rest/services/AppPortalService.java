package com.app.portal.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.portal.rest.businessobjects.JsonResponseBO;
import com.app.portal.rest.businessobjects.Status;
import com.app.portal.rest.validation.RequestValidation;
import com.google.gson.Gson;

@Path("/api/")
@Consumes("application/json")
public class AppPortalService {

	@Autowired
	private RequestValidation requestValidation;
	@GET
	@Path("/getAccess/")
	@Produces("application/json")
	public String getAccess(@QueryParam("type") String type ,@QueryParam("language") String language, @QueryParam("hardwareId") String hardwareId){
		Gson gson = new Gson();
		JsonResponseBO jsonResponseBO = new JsonResponseBO();
		String resposeString = null;
		Status validationStatus = requestValidation.validateAccess(type, language, hardwareId);
		
		if(validationStatus.getCode() == 0){
			Status status = new Status();
			status.setCode(200);
			status.setMessage("Registration successfully completed");
			jsonResponseBO = new JsonResponseBO();
			jsonResponseBO.setStatus(status);
			resposeString = gson.toJson(jsonResponseBO);
		}else{
			jsonResponseBO.setStatus(validationStatus);
			resposeString = gson.toJson(jsonResponseBO);
		}
		return resposeString;
	}
}
