package com.andremanuelbarbosa.soq47676034;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class SOQ47676034Api {

    @POST
    public SOQ47676034Resource get(SOQ47676034Resource soq47676034Resource) {

        return soq47676034Resource;
    }
}
