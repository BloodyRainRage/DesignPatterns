package com.baddragon.Game.Factories;

import com.baddragon.Game.Enemies.IEnemy;
import com.baddragon.Game.Enemies.RogueEnemy;
import com.baddragon.Game.Exceptions.UnknownEnemyException;

public class MediumLevelFactory implements IFactory {

    private static int counter = 0; //counts how many rogues were spawned

    @Override
    public IEnemy create() throws UnknownEnemyException {

        if(counter <= 10){
            counter++;
            return new RogueEnemy(); //spawning rogues while total amount of them are <= 10
        } else{
            return new EasyLevelFactory().create(); //spawning a random enemy
        }
    }

    @Override
    public String toString(){
        return "Medium level";
    }

}
