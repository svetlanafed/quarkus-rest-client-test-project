package com.svetlanafedorova.controller;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.svetlanafedorova.model.Episode;
import com.svetlanafedorova.model.TvSeries;
import com.svetlanafedorova.proxy.EpisodeProxy;
import com.svetlanafedorova.proxy.TvSeriesProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/tvseries")
public class TvSeriesController {

    @RestClient
    TvSeriesProxy tvSeriesProxy;

    @RestClient
    EpisodeProxy episodeProxy;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("title") String title) {
        TvSeries movie = tvSeriesProxy.get(title);
        List<Episode> episodes = episodeProxy.get(movie.getId());
        return Response.ok(episodes).build();
    }
}
