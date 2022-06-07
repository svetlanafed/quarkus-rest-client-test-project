package com.svetlanafedorova.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.svetlanafedorova.model.TvSeries;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/singlesearch/")
@Produces(MediaType.APPLICATION_JSON)
public interface TvSeriesProxy {

    @GET
    @Path("/shows")
    TvSeries get(@QueryParam("q") String title);
}
