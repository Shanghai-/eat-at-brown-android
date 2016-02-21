package com.hackteam.brendan.eatatbrown;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brendan on 2/21/2016.
 */
public class MenuDataSingleton {
    private static MenuDataSingleton ourInstance = new MenuDataSingleton();

    //public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static MenuDataSingleton getInstance() {
        return ourInstance;
    }

    private MenuDataSingleton() {
    }
}
