package com.rest;

import java.net.UnknownHostException;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kitap.veriTabani;
import com.mongodb.BasicDBList;

@Path("/getExample")
public class restIslemlerGet {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/kitaps")
	public BasicDBList getAValue() throws UnknownHostException {
		
		veriTabani kitap=new veriTabani();		
		return  kitap.kitapListele();
		
	}
	
}
