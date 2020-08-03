package com.baddragon.Game.Enemies;

public class TrollEnemy implements IEnemy {
    @Override
    public void battleRoar() {
        System.out.println("Gimme ur money!!1");
    }

    @Override
    public String toString() {
        return "Troll";
    }
}
