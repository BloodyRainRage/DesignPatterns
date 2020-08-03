package com.baddragon.Game.Enemies;

public class RogueEnemy implements IEnemy {

    @Override
    public void battleRoar(){
        System.out.println("Your wallet or your life");
    }

    @Override
    public String toString() {
        return "Rogue";
    }

}
