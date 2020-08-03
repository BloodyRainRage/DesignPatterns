package com.baddragon.Game.Factories;

import com.baddragon.Game.Enemies.IEnemy;
import com.baddragon.Game.Enemies.RogueEnemy;
import com.baddragon.Game.Enemies.TrollEnemy;
import com.baddragon.Game.Enemies.WildAnimalEnemy;
import com.baddragon.Game.Exceptions.UnknownEnemyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EasyLevelFactory implements IFactory {

    Random random = new Random();


    @Override
    public IEnemy create() throws UnknownEnemyException {

        List<String> enemiesList = new ArrayList<>();
        enemiesList.add("Rogue");
        enemiesList.add("Troll");
        enemiesList.add("Animal");

        switch (enemiesList.get(random.nextInt(enemiesList.size()))) {
            case "Rogue":
                return new RogueEnemy();
            case "Troll":
                return new TrollEnemy();
            case "Animal":
                return new WildAnimalEnemy();
            default:
                throw new UnknownEnemyException("Unknown enemy");

        }
    }

    @Override
    public String toString(){
        return "Easy level";
    }
}
