package it.ads.adslab.carsharing.rest;

import it.ads.adslab.carsharing.domain.Car;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("cars")
public class CarsREST {
	
	
	
	
	@GET
	@Path("{carId}")
	@Produces("text/plain")
	public Response getCar(@PathParam("carId") int carId){
		
		Car car = new Car();
		car.setModel("Ibiza");
		
		
		
		Response r = Response.status(200).entity(car).build();
		
		return r;
		
		
		
		
	}
	
	
	
	
    

	
	
}
