package com.swagger.boundary;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.enterprise.context.RequestScoped;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("customer")
@RequestScoped
@Api(value = "Example service")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @GET
    @Path("/{customerID}")
    @ApiOperation(value = "Retrieve some example content", notes = "This will return some json to the client", response = JsonObject.class)
    public Response customerResource() {
        return Response.ok("test").build();
    }
}