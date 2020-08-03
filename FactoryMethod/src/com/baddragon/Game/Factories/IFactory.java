package com.baddragon.Game.Factories;

import com.baddragon.Game.Enemies.IEnemy;
import com.baddragon.Game.Exceptions.UnknownEnemyException;

public interface IFactory {

    IEnemy create() throws UnknownEnemyException;

}
