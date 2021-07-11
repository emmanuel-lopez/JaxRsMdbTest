package com.company.abc.test;

import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("rest")
public class RestResource {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response get(){
        
        JsonObject jo = Json.createObjectBuilder()
                .add("key", "value")
                .build();
        
        return Response.ok(jo)
                .build();
    }
}
