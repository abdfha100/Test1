package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	
	@GET
	@Produce(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resouce= "<? xml version = '1.0'?>" +
		"<hello> Hi Neel, This is Hello frm XML </hello>";
		return resouce;
	}
	@Produce(MediaType.APPLICATION_JSON_)
	public String sayHelloJASON()
	{
		String resouce= null;
		return resouce;
	}
	@GET
	@Produce(MediaType.TEXT_HTML_)
	public String sayHelloHTML()
	{
		String resouce= null;
		return resouce;
		
		
	}

}
