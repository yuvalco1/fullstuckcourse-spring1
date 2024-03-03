package org.example;

import java.util.List;
import org.example.SimpleMenu;

public class Restaurant {

    private SimpleMenu simpleMenu;

    public Restaurant(SimpleMenu simpleMenu) {
        this.simpleMenu = simpleMenu;
    }


    public SimpleMenu getSimpleMenu() {
        return simpleMenu;
    }

    public void displayMenu() {
        List<MenuItem> menu = simpleMenu.getMenuItems();
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
        }
    }


}
