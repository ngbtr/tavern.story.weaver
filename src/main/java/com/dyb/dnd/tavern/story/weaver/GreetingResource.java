package com.dyb.dnd.tavern.story.weaver;

import com.dyb.dnd.tavern.story.weaver.core.Weaver;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.apache.commons.lang3.StringUtils;

@Path("/weaver")
public class GreetingResource {
    @Inject
    Weaver weaver;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/chat")
    public String chat(@QueryParam("message") String message) {
        if (StringUtils.isEmpty(message)) {
            throw new WebApplicationException("Query param 'message' is required", 400);
        }

        return weaver.weave(message);
    }
}
