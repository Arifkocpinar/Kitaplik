package com.rest;
import com.kitap.*;

import java.net.UnknownHostException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/kitapUygulama")
public class restIslemler {
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Path("/gelenData")
public Response gelenDataDeger(kitapBilgiler kitap)throws UnknownHostException {
	System.out.println("postgeldi");
	veriTabani veri=new veriTabani();
	veri.kitapEkle(kitap);
	return Response.status(200).build();
	
}

@PUT
@Consumes(MediaType.APPLICATION_JSON)
@Path("/putGelen")
public Response gelenPutDeger(kitapBilgiler kitap)throws UnknownHostException{
	System.out.println("put geldi");
	veriTabani veri=new veriTabani();
	veri.kitapGuncelle(kitap);
	return Response.status(200).build();
}

@DELETE
@Consumes(MediaType.APPLICATION_JSON)
@Path("/deleteGelen")
public Response gelenDeleteDeger(kitapBilgiler kitap)throws UnknownHostException{
	System.out.println("Delete Geldi");
	veriTabani veri= new veriTabani();
	veri.kitapSil(kitap);
	veri.kitapListele();
	return Response.status(200).build();
}


}
