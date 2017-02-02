package com.epam.cxf.pathparam.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Path("/player")
public interface IPlayerService {


//------------------------------Path Param--------------------------------------------------

    // http://localhost:8081/rest1_PathParam_Annotation/services/player/welcome/David
    @GET
    @Path("/welcome/{name}")
    Response welcomePlayerPathParam(@PathParam("name") String playerName);

    // http://localhost:8081/rest1_PathParam_Annotation/services/player/playerinfo/Sachin/41/200
    @GET
    @Path("playerinfo/{name}/{age}/{matches}")
    Response getPlayerInfoPathParam(
            @PathParam("name") String playerName,
            @PathParam("age") int age,
            @PathParam("matches") int matches);


//------------------------------Query Param--------------------------------------------------


    // http://localhost:8081/restWS/services/player/welcome?name=Gilchrist

    @GET
    @Path("/welcome")
    Response welcomePlayerQueryPamam(@QueryParam("name") String playerName);

    // http://localhost:8081/restWS/services/player/playerinfo?name=Pietersen&age=33&matches=104
    @GET
    @Path("/playerinfo")
    Response getPlayerInfoQueryParam(
            @QueryParam("name") String playerName,
            @QueryParam("age") int age,
            @QueryParam("matches") int matches);



//------------------------------Matrix Param--------------------------------------------------

    // http://localhost:8081/restWS/services/player/welcome;name=McGrath
    @GET
    @Path("/welcome")
    public Response welcomePlayerMatrixParam(@MatrixParam("name") String playerName);

    // http://localhost:8081/restWS/services/player/playerinfo;name=Langer;age=44;matches=105
    @GET
    @Path("/playerinfo")
    public Response getPlayerInfoMatrixParam(
            @MatrixParam("name") String playerName,
            @MatrixParam("age") int age,
            @MatrixParam("matches") int matches);


//------------------------------Form Param--------------------------------------------------


    // http://localhost:8081/restWS/services/player/addinfo
    @POST
    @Path("/addinfo")
    public Response getPlayerInfo(
            @FormParam("name") String playerName,
            @FormParam("age") int age,
            @FormParam("matches") int matches);

//------------------------------Header Param, Context--------------------------------------------------

    // http://localhost:8081/restWS/services/player/getheader
    @GET
    @Path("getheader")
    public Response getHeaderDetails(
            @HeaderParam("User-Agent") String userAgent,
            @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept
    );

    // http://localhost:8081/restWS/services/player/getallheader
    @GET
    @Path("getallheader")
    public Response getAllHeader(@Context HttpHeaders httpHeaders);

}
