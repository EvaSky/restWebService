package com.epam.cxf.pathparam.service.impl;

import com.epam.cxf.pathparam.service.IPlayerServiceJson;
import com.epam.restws.model.player.PlayerListType;
import com.epam.restws.model.player.PlayerType;
import org.springframework.stereotype.Service;

/**
 * Created by Volha_Shakhrai on 2/2/2017.
 */
@Service("playerServiceJson")
public class PlayerServiceJsonImpl implements IPlayerServiceJson {

    /**
     * returns a String value with SUCCESS message after adding a player
     */
    @Override
    public String createOrSaveNewPLayerInfo(PlayerType playerType) {

        // get the player information from formal arguments and inserts into database & return playerId (primary_key)
        return "Player information saved successfully with PLAYER_ID " + 564;
    }

    /**
     * retrieves a player object based on the playerId supplied in the formal argument using @PathParam
     */
    @Override
    public PlayerType getPlayerInfo(int playerId) {

        // retrieve player based on the id supplied in the formal argument
        PlayerType getplayer = new PlayerType();
        getplayer.setPlayerId(playerId);
        getplayer.setName("Graham Thorpe");
        getplayer.setAge(45);
        getplayer.setMatches(100);
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
        playerOne.setPlayerId(543);
        playerOne.setName("Alec Stewart");
        playerOne.setAge(51);
        playerOne.setMatches(133);
        playerListType.getPlayerType().add(playerOne); // add to playerListType

        // player 2 info
        PlayerType playerTwo = new PlayerType();
        playerTwo.setPlayerId(542);
        playerTwo.setName("Nasser Hussain");
        playerTwo.setAge(46);
        playerTwo.setMatches(96);
        playerListType.getPlayerType().add(playerTwo); // add to playerListType

        return playerListType;
    }
}
