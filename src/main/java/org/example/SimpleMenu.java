package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleMenu {

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    List<MenuItem> menuItems = new ArrayList<>();

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeItem(String name) {
        menuItems.removeIf(item -> item.getName().equals(name));
    }

}
