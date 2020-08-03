package com.baddragon.Game.Enemies;

public class WildAnimalEnemy implements IEnemy {

    @Override
    public void battleRoar() {
        System.out.println("Roarrrr");
    }

    @Override
    public String toString() {
        return "Animal";
    }
}
