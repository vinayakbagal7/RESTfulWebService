package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ConversionService")
public class Conversion {

	@GET
	@Path("/InchToFeet/{i}")
	@Produces(MediaType.TEXT_XML)
	public String convertInchToFeet(@PathParam("i") int i) {
		int inch = i;
		double feet = inch/12;
		return "<InchToFeetService>" 
				+ "<Inch>" + inch + "</Inch>" 
				+ "<Feet>" + feet + "</Feet>" 
			+ "</InchToFeetService>";
	}
	
	@Path("/FeetToInch/{f}")
	@GET @Produces(MediaType.TEXT_XML)
	public String convertFeetToInch(@PathParam("f") int f) {
		int feet=f;
		int inch = 12*feet;
		return "<FeetToInchService>"
				+ "<Feet>" + feet + "</Feet>"
				+ "<Inch>" + inch + "</Inch>"
			+ "</FeetToInchService>";
	}
	
	
}
