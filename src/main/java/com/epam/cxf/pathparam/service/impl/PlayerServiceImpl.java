package com.epam.cxf.pathparam.service.impl;

import com.epam.cxf.pathparam.service.IPlayerService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Service("playerService")
public class PlayerServiceImpl implements IPlayerService {

//------------------------------Path Param--------------------------------------------------
    /**
     * this method takes one argument from PathParam and returns a Response
     */
    @Override
    public Response welcomePlayerPathParam(String playerName) {

        String greetMessage = "Welcome " + playerName + " to Lords - the home of cricket";
        return Response.status(200).entity(greetMessage).build();
    }

    /**
     * this method takes three argument from PathParam and returns a Response
     */
    @Override
    public Response getPlayerInfoPathParam(String playerName, int age, int matches) {

        String playerInfo = "[name=" + playerName +  ", age=" + age + ", matches=" + matches + "]";
        return Response.status(200).entity(playerInfo).build();
    }


//------------------------------Query Param--------------------------------------------------

    @Override
    public Response welcomePlayerQueryPamam(String playerName) {
        String greetMessage = "Query param. Welcome " + playerName + " to Lords - the home of cricket";
        return Response.status(200).entity(greetMessage).build();
    }

    @Override
    public Response getPlayerInfoQueryParam(String playerName, int age, int matches) {

        String playerInfo = "Query param. [name=" + playerName +  ", age=" + age + ", matches=" + matches + "]";
        return Response.status(200).entity(playerInfo).build();
    }

//------------------------------Matrix Param--------------------------------------------------


    @Override
    public Response welcomePlayerMatrixParam(String playerName) {
        String greetMessage = "Matrix param. Welcome " + playerName + " to Lords - the home of cricket";
        return Response.status(200).entity(greetMessage).build();
    }

    @Override
    public Response getPlayerInfoMatrixParam(String playerName, int age, int matches) {
        String playerInfo = "Matrix param. [name=" + playerName +  ", age=" + age + ", matches=" + matches + "]";
        return Response.status(200).entity(playerInfo).build();
    }

//------------------------------Form Param--------------------------------------------------

    @Override
    public Response getPlayerInfo(String playerName, int age, int matches) {
        String playerInfo = "Form param. Player with information " + "[name=" + playerName +  ", age=" + age + ", matches=" + matches + "]" + " added to the database";
        return Response.status(200).entity(playerInfo).build();
    }

//------------------------------Header Param, Context------------------------------------------


    @Override
    public Response getHeaderDetails(String userAgent, String contentType, String accept) {
        String header = "User-Agent: " + userAgent +
                "\nContent-Type: " + contentType +
                "\nAccept: " + accept;
        return Response.status(200).entity(header).build();
    }

    @Override
    public Response getAllHeader(HttpHeaders httpHeaders) {
        // local variables
        StringBuffer stringBuffer = new StringBuffer();
        String headerValue = "";

        for(String header : httpHeaders.getRequestHeaders().keySet()) {
            headerValue = httpHeaders.getRequestHeader(header).get(0);
            stringBuffer.append(header + ": " + headerValue + "\n");
        }
        return Response.status(200).entity(stringBuffer.toString()).build();
    }
}
