package com.focus.androidserverapi.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.focus.androidserver.business.DatabaseService;
import com.focus.androidserver.model.AnswerModel;

@Path("answer/")
public class AnswerRestService {
	
	@Path("saveAnswer/{uid}/{qid}/{answer}/{updateTime}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response addAnswer(@PathParam("uid")int uid, @PathParam("qid")int qid, @PathParam("answer")String answer,
			@PathParam("updateTime")String updateTime) {
		try {
			AnswerModel answerModel = new AnswerModel(uid, qid, answer, updateTime);	
			DatabaseService.saveAnswer(answerModel);
			return Response.status(200).entity(answerModel).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
		
	}
	
	public Response updateAnswer(@PathParam("uid")int uid, @PathParam("qid")int qid, @PathParam("answer")String answer,
			@PathParam("updateTime")String updateTime) {
		try {
			AnswerModel answerModel = new AnswerModel(uid, qid, answer, updateTime);	
			DatabaseService.updateAnswer(answerModel);
			return Response.status(200).entity(answerModel).build();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return Response.status(500).build();
		}
		
	}
}
