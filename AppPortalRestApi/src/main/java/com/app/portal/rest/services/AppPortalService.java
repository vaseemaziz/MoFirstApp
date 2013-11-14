package com.app.portal.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.app.portal.rest.businessobjects.Status;

@Path("/appPortalService/")
@Consumes("application/json")
public class AppPortalService {

	@GET
	@Path("/getAccess/")
	@Produces("application/json")
	public Status getAccess(@QueryParam("type") String type ,@QueryParam("language") String language, @QueryParam("hardwareId") String hardwareId){
		Status status = new Status();
		status.setCode(200);
		status.setMessage("Registration successfully completed");
		return status;
	}
}
