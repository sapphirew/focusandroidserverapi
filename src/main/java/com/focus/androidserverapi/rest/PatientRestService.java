package com.focus.androidserverapi.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.focus.androidserver.business.DatabaseService;
import com.focus.androidserver.model.PatientModel;
import com.focus.androidserverapi.model.PatientIdsViewModel;


@Path("patient")
public class PatientRestService {
	@Path("uid/{uid}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getPatientByUid(@PathParam("uid")int uid) {
				
		try {
			ArrayList<PatientModel> patients = DatabaseService.getPatientsByUid(uid);
			
			GenericEntity<ArrayList<PatientModel>> entity = new GenericEntity<ArrayList<PatientModel>>(patients) {};
			
			return Response.status(200).entity(entity).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	@Path("getPatientIds/{uid}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getPatientIdByUId(@PathParam("uid")int uid) {
				
		try {
			ArrayList<PatientModel> patientIds = DatabaseService.getPatientIdAndAgeByUId(uid);
			List<PatientIdsViewModel> patientIdsVM = convertPatientIdAndAgeToViewModel(patientIds);
			GenericEntity<List<PatientIdsViewModel>> entity = new GenericEntity<List<PatientIdsViewModel>>(patientIdsVM) {};
			
			return Response.status(200).entity(entity).build();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	private List<PatientIdsViewModel> convertPatientIdToViewModel(final ArrayList<Integer> patientIds) {
		List<PatientIdsViewModel> result = new ArrayList<PatientIdsViewModel>();
		for (Integer i : patientIds) {
			result.add(new PatientIdsViewModel(i));
			//System.out.println(result.get(result.size() - 1).getPatientId());
		}
		return result;
	}
	private List<PatientIdsViewModel> convertPatientIdAndAgeToViewModel(final ArrayList<PatientModel> patientIds) {
		List<PatientIdsViewModel> result = new ArrayList<PatientIdsViewModel>();
		for (PatientModel i : patientIds) {
			result.add(new PatientIdsViewModel(i.getPatientId(),i.getAge()));
		}
		return result;
	}
}
