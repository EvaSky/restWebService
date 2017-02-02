package com.epam.cxf.pathparam.service;

import com.epam.restws.model.player.PlayerListType;
import com.epam.restws.model.player.PlayerType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Path("/playerservice")
public interface IPlayerServiceXml {

    // Basic CRUD operations for Player Service

    // http://localhost:8081/restWS/services/ws/playerservice/addplayer
    @POST
    @Path("addplayer")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    String createOrSaveNewPLayerInfo(PlayerType playerType);

    // http://localhost:8081/restWS/services/ws/playerservice/getplayer/239
    @GET
    @Path("getplayer/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_XML)
    PlayerType getPlayerInfo(@PathParam("id") int playerId);

    // http://localhost:8081/restWS/services/ws/playerservice/updateplayer
    @PUT
    @Path("updateplayer")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    String updatePlayerInfo(PlayerType player);

    // http://localhost:8081/restWS/services/ws/playerservice/deleteplayer
    @DELETE
    @Path("deleteplayer")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    String deletePlayerInfo(PlayerType player);

    // http://localhost:8081/restWS/services/ws/playerservice/getallplayer
    @GET
    @Path("getallplayer")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_XML)
    PlayerListType getAllPlayerInfo();
}


