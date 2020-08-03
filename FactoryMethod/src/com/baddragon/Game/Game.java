package com.baddragon.Game;

import com.baddragon.Game.Enemies.IEnemy;
import com.baddragon.Game.Exceptions.UnknownEnemyException;
import com.baddragon.Game.Factories.IFactory;
import com.baddragon.Game.Locations.Park;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Park location;

    public Game(IFactory factory) throws UnknownEnemyException {
        int initCapacity = 100;
        List<IEnemy> enemies = new ArrayList<>(initCapacity);//setting amount of enemies

        for (int i = 0; i < initCapacity; i++) {
            enemies.add(factory.create());
        }

        location = new Park(enemies);

    }

    public void startGame(){

        System.out.println("Game is loaded");
        location.buildInfo();

    }

}
