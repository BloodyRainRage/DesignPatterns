package com.baddragon;

import com.baddragon.InterfaceAdapter.Adapter;
import com.baddragon.InterfaceAdapter.IAdapter;

public class Main {

    public static void main(String[] args) {

        IAdapter adapter = new Adapter();

        adapter.method();

    }
}
