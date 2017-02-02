package com.epam.cxf.pathparam.service;

import com.epam.restws.model.player.PlayerListType;
import com.epam.restws.model.player.PlayerType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Path("/playerservicejson")
public interface IPlayerServiceJson {

    // Basic CRUD operations for Player Service

    // http://localhost:8081/restWS/services/json/playerservicejson/addplayer
    @POST
    @Path("addplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String createOrSaveNewPLayerInfo(PlayerType playerType);

    // http://localhost:8081/restWS/services/json/playerservicejson/getplayer/564
    @GET
    @Path("getplayer/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerType getPlayerInfo(@PathParam("id") int playerId);

    // http://localhost:8081/restWS/services/json/playerservicejson/updateplayer
    @PUT
    @Path("updateplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String updatePlayerInfo(PlayerType playerType);

    // http://localhost:8081/restWS/services/json/playerservicejson/deleteplayer
    @DELETE
    @Path("deleteplayer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String deletePlayerInfo(PlayerType playerType);

    // http://localhost:8081/restWS/services/json/playerservicejson/getallplayer
    @GET
    @Path("getallplayer")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerListType getAllPlayerInfo();
}
