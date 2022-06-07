package com.svetlanafedorova.proxy;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.svetlanafedorova.model.Episode;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/shows")
@Produces(MediaType.APPLICATION_JSON)
public interface EpisodeProxy {

    @GET
    @Path("/{id}/episodes")
    List<Episode> get(@PathParam("id") Long id);
}
