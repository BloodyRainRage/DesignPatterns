package com.baddragon;

import com.baddragon.Proxy.DatabaseProxy;
import com.baddragon.Proxy.Databases.PostgresDatabase;

public class Main {

    public static void main(String[] args) {

        DatabaseProxy proxy = new DatabaseProxy(PostgresDatabase.class.getName());

        proxy.select("select * from database");

    }
}
