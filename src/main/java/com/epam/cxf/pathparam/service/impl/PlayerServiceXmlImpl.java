package com.epam.cxf.pathparam.service.impl;

import com.epam.cxf.pathparam.service.IPlayerServiceXml;
import com.epam.restws.model.player.PlayerListType;
import com.epam.restws.model.player.PlayerType;
import org.springframework.stereotype.Service;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Service("playerServiceXml")
public class PlayerServiceXmlImpl implements IPlayerServiceXml {


    /**
     * returns a String value with SUCCESS message after adding a player
     */
    @Override
    public String createOrSaveNewPLayerInfo(PlayerType playerType) {

        // get the player information from formal arguments and inserts into database & return playerId (primary_key)
        return "Player information saved successfully with PLAYER_ID " + playerType.getPlayerId();
    }

    /**
     * retrieves a player object based on the playerId supplied in the formal argument using @PathParam
     */
    @Override
    public PlayerType getPlayerInfo(int playerId) {

        // retrieve player based on the id supplied in the formal argument
        PlayerType getplayer = new PlayerType();
        getplayer.setPlayerId(239);
        getplayer.setName("Virender Sehwag");
        getplayer.setAge(35);
        getplayer.setMatches(102);
        return getplayer;
    }

    /**
     * returns a String value with SUCCESS message after updating a player
     */
    @Override
    public String updatePlayerInfo(PlayerType playerType) {

        // update player info & return SUCCESS message
        return "Player information updated successfully";
    }

    /**
     * returns a String value with SUCCESS message after deleting a player
     */
    @Override
    public String deletePlayerInfo(PlayerType playerType) {

        // delete player info & return SUCCESS message
        return "Player information deleted successfully";
    }

    /**
     * retrieves all players stored
     */
    @Override
    public PlayerListType getAllPlayerInfo() {

        // create a object of type PlayerType which takes player objects in its list
        PlayerListType playerListType = new PlayerListType();

        // player 1 info
        PlayerType playerOne = new PlayerType();
        playerOne.setPlayerId(346);
        playerOne.setName("Mark Taylor");
        playerOne.setAge(49);
        playerOne.setMatches(104);
        playerListType.getPlayerType().add(playerOne); // add to playerListType

        // player 2 info
        PlayerType playerTwo = new PlayerType();
        playerTwo.setPlayerId(356);
        playerTwo.setName("Michael Slater");
        playerTwo.setAge(44);
        playerTwo.setMatches(74);
        playerListType.getPlayerType().add(playerTwo); // add to playerListType

        return playerListType;
    }
}
