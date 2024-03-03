package org.example;
import org.example.Restaurant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

//        System.out.println("Hello world!");
//        MyService myService = (MyService) applicationContext.getBean("service");
//        MyService myService2 = (MyService) applicationContext.getBean("service");
//        MyService myService3 = (MyService) applicationContext.getBean("service");
//
//        myService.doSomething();

        Car car = (Car) applicationContext.getBean("car");
        car.go();


        // home work :
//        1.	Create a MenuItem class with attributes such as name, description, and price.
//        2.	Create a SimpleMenu class. This class should manage a list of menu items.
//              1.	It has a list of menu items and methods:
//                  1.	addItemToMenu
//                  2.	RemoveItemFromMenu
//        3.	Use constructor injection to inject the SimpleMenu dependency into a Restaurant class
//        4.	The Restaurant class has fields restaurantName and SimpleMenu.
//        5.	Implement a Main class to demonstrate the functionality of the restaurant ordering system. Create menu items, add them to the restaurant's menu, and display the menu.

        SimpleMenu simpleMenu = new SimpleMenu ();
        Restaurant restaurant = new Restaurant(simpleMenu);

        MenuItem burger = new MenuItem( "Burger", "Juicy beef patty on a sesame seed bun", 8.99);
        MenuItem pizza = new MenuItem( "Pizza", "Thin crust pizza with assorted toppings", 10.99);

        restaurant.getSimpleMenu().addItem(burger);
        restaurant.getSimpleMenu().addItem(pizza);

        //bellow is creating resturant, menu and menu items using xml file only.

        Restaurant myrestaurant = (Restaurant) applicationContext.getBean("myrestaurant");

        // the below line could be removed as we created them in the xml file
//        myrestaurant.getSimpleMenu().addItem(burger);
//        myrestaurant.getSimpleMenu().addItem(pizza);
        myrestaurant.displayMenu();
        //restaurant.displayMenu();



    }
}