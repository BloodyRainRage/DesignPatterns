package com.baddragon.Game.Factories;

import com.baddragon.Game.Enemies.IEnemy;
import com.baddragon.Game.Enemies.RogueEnemy;
import com.baddragon.Game.Enemies.TrollEnemy;
import com.baddragon.Game.Exceptions.UnknownEnemyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HardLevelFactory implements IFactory {
    Random random = new Random();
    List<String> enemiesList = new ArrayList<>();

    @Override
    public IEnemy create() throws UnknownEnemyException {

        enemiesList.add("Troll");
        enemiesList.add("Rogue");

        switch (enemiesList.get(random.nextInt(enemiesList.size()))){

            case "Troll":
                return new TrollEnemy();
            case "Rogue":
                return new RogueEnemy();
            default:
                throw new UnknownEnemyException("Unknown enemy");

        }

    }

    @Override
    public String toString(){
        return "Hard level";
    }

}
