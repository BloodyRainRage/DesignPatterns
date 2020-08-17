package com.baddragon.Proxy.Databases;

import com.baddragon.Proxy.IDatabase;

public class MysqlDatabase implements IDatabase {

    protected String url;

    @Override
    public void select(String url) {
        System.out.println("[MysqlLog]: " + url);
    }

    @Override
    public void update(String url) {
        System.out.println("[MysqlLog]: " + url);
    }

    @Override
    public void delete(String url) {
        System.out.println("[MysqlLog]: " + url);
    }

    @Override
    public void prepareStatement(String url) {
        this.url = url;
        System.out.println("[Statement prepared]");
    }

    @Override
    public void execute(){
        if(url == null) throw new NullPointerException();

        System.out.println("[executing prep statement on mysql]: " + this.url);
    }

}
