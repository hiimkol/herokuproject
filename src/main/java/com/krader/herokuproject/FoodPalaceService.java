package com.krader.herokuproject;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foods")
public class FoodPalaceService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ArrayList<FoodPalace> getFoods_JSON() {
		ArrayList<FoodPalace> listOfFoods = FoodPalaceDAO.getAllFoodPalaces();
		return listOfFoods;
	}

	@GET
	@Path("/{foodid}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FoodPalace getFood(@PathParam("foodid") String id) {
		return FoodPalaceDAO.getFoodPalace(id);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FoodPalace addEmployee(FoodPalace fp) {
		return FoodPalaceDAO.addFoodPalace(fp);
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FoodPalace updateEmployee(FoodPalace fp) {
		return FoodPalaceDAO.updateFoodPalace(fp);
	}

	@DELETE
	@Path("/{foodid}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteFood(@PathParam("foodid") String id) {
		FoodPalaceDAO.deleteFoodPalace(id);
	}

}
