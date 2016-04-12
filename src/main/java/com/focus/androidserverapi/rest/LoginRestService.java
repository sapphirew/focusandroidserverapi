package com.focus.androidserverapi.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.focus.androidserver.business.DatabaseService;
import com.focus.androidserverapi.model.SinglePassViewModel;
import com.focus.androidserverapi.model.UserExistsViewModel;
import com.focus.androidserverapi.model.UserIdViewModel;

@Path("login/")
public class LoginRestService {
	@Path("singlePass/{userName}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getSinglePass(@PathParam("userName")String userName) {
				
		try {
			String username = DatabaseService.getSinglePass(userName);
			SinglePassViewModel un = convertSinglePassToViewModel(username);
			
			GenericEntity<SinglePassViewModel> entity = new GenericEntity<SinglePassViewModel>(un) {};
			
			return Response.status(200).entity(entity).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	@Path("userExists/{userName}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response userExists(@PathParam("userName")String userName) {
				
		try {
			String username = DatabaseService.userExists(userName);
			UserExistsViewModel ue = convertUserExistsToViewModel(username);
			
			GenericEntity<UserExistsViewModel> entity = new GenericEntity<UserExistsViewModel>(ue) {};
			
			return Response.status(200).entity(entity).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	@Path("getUid/{userName}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getUidByUsername(@PathParam("userName")String userName) {
				
		try {
			int uid = DatabaseService.getIdByUsername(userName);
			UserIdViewModel view = convertUidToViewModel(uid);
			
			GenericEntity<UserIdViewModel> entity = new GenericEntity<UserIdViewModel>(view) {};
			
			return Response.status(200).entity(entity).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	private UserIdViewModel convertUidToViewModel(final int uid) {
		// TODO Auto-generated method stub
		return new UserIdViewModel(uid);
	}
	private SinglePassViewModel convertSinglePassToViewModel(final String pass) {
		return new SinglePassViewModel(pass);
	}
	private UserExistsViewModel convertUserExistsToViewModel(final String pass) {
		return new UserExistsViewModel(pass);
	}
}
