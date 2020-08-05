package com.baddragon;

import com.baddragon.Game.Exceptions.UnknownEnemyException;
import com.baddragon.Game.Factories.EasyLevelFactory;
import com.baddragon.Game.Factories.HardLevelFactory;
import com.baddragon.Game.Factories.IFactory;
import com.baddragon.Game.Factories.MediumLevelFactory;
import com.baddragon.Game.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnknownEnemyException {

        Scanner scanner = new Scanner(System.in);
        List<IFactory> factories = new ArrayList<>();
        factories.add(new EasyLevelFactory());
        factories.add(new MediumLevelFactory());
        factories.add(new HardLevelFactory());

        System.out.println("Enter difficulty:");
        for (int i = 0; i < factories.size(); i++) {
            System.out.println(i + 1 + ") " + factories.get(i).toString());
        }
        System.out.print("lvl>>");
        int level = scanner.nextInt() - 1;
        if (level > -1 && level < factories.size()) {
            Game game = new Game(factories.get(level));
            factories.clear();
            game.startGame();

        } else {
            System.out.println("Incorrect value");
        }
    }
}
