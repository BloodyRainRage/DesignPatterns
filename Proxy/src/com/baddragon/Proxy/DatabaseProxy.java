package com.baddragon.Proxy;

import javax.xml.crypto.Data;
import java.lang.reflect.InvocationTargetException;

public class DatabaseProxy implements IDatabase {

    IDatabase database;

    public DatabaseProxy(String url){
        try {
            database = (IDatabase) Class.forName(url).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                NoSuchMethodException | InvocationTargetException e){
            e.printStackTrace();
        }
    }

    @Override
    public void select(String url) {
        database.select(url);
    }

    @Override
    public void update(String url) {
        database.update(url);
    }

    @Override
    public void delete(String url) {
        database.delete(url);
    }

    @Override
    public void prepareStatement(String url) {
        database.prepareStatement(url);
    }

    @Override
    public void execute() {
        database.execute();
    }
}
