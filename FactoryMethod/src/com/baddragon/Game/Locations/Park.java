package com.baddragon.Game.Locations;

import com.baddragon.Game.Enemies.IEnemy;

import java.util.ArrayList;
import java.util.List;

public class Park {

    List<IEnemy> enemies;

    public Park(List<IEnemy> enemies){
        this.enemies = enemies;
    }

    public void buildInfo(){

        int troll = 0;
        int rogue = 0;
        int animal = 0;

        for (IEnemy enemy: enemies) {
            if(enemy.toString().equals("Troll")) troll++;
            if(enemy.toString().equals("Rogue")) rogue++;
            if(enemy.toString().equals("Animal")) animal++;

        }

        System.out.println("Trolls: " + troll);
        System.out.println("Rogues: " + rogue);
        System.out.println("Animals: " + animal);
    }


}
