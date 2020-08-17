package com.baddragon.Proxy;

public interface IDatabase {

    void select(String url);
    void update(String url);
    void delete(String url);

    void prepareStatement(String url);
    void execute();

}
