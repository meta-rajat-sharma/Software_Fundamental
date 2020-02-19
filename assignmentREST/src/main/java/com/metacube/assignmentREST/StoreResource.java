package com.metacube.assignmentREST;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("store")
public class StoreResource 
{
	StoreData book = new StoreData();
	
	@POST
	@Path("addbook")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Store createBook(Store b1) {
		
		book.create(b1);
		return b1;
	}
	
	@GET
	@Path("allbooks")
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public List<Store> retrieveBook() {
		
		return book.getItems();
	}
	
	@GET
	@Path("bookbytitle/{title}")
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public Store retrieveByTitle(@PathParam("title")String title) {
		
		return book.getItemByTitle(title);
	}
	
	@PUT
	@Path("updatebytandp")
	@Consumes({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public Store updateBy(Store b) {
		
		book.update(b);
		return b;
	}
	
	@DELETE
	@Path("deletebyid/{id}")
	public void deleteById(@PathParam("id")int id) {
		
		book.Delete(id);
	}
	
	@DELETE
	@Path("deleteall")
	public void deleteAll() {
		
		book.DeleteAll();
	}
	
}
