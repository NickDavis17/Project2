
package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//Nick Davis Project 1

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        menu();

        ArrayList<String> list = new ArrayList();

        int choice = input.nextInt();
        //System.out.println(choice);
        while ((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4) || (choice == 5)) {
            // If the user chooses 1
            if (choice == 1) {
                add(list);
                // User chooses 2
            } else if (choice == 2) {
                removeTask(list);
                // 3
            } else if (choice == 3) {
                updateTask(list);
                // 4
            } else if (choice == 4) {
                displayList(list);
            }
            menu();

            choice = input.nextInt();
        }
        // 0
        if (choice == 0) {
            System.out.println("Goodbye");
            System.exit(0);
        }
        //anything else
        else {
            menu();

            choice = input.nextInt();
            System.out.println(choice);
        }
        menu();

        choice = input.nextInt();
        System.out.println(choice);

    }
    //Displays Menu
    static void menu(){
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(4) List all tasks of a certain priority.");
        System.out.println("(0) Exit.");
    }

    //Adds an item to the list
    static void add(ArrayList a) {
        System.out.println("Please give of a description of the task you would like to add");
        String add = input.next();
        a.add(add);

    }
    //removes an item
    static void removeTask(ArrayList a) {
        System.out.println(a);
        System.out.println("Which would you like to remove? (1, 2, 3, 4, Etc...");
        int remove = input.nextInt() - 1;
        while (remove > a.size()) {
            if (remove > a.size()) {
                System.out.println("Please enter a valid number");
                remove = input.nextInt() - 1;
            }
        }

        a.remove(remove);
    }


    //
    static void updateTask(ArrayList a){
        System.out.println(a);
        System.out.println("Which would you like to update? (1, 2, 3, 4, Etc...");
        int remove = input.nextInt() - 1;
        while (remove > a.size()) {
            if (remove > a.size()) {
                System.out.println("Please enter a valid number");
                remove = input.nextInt() - 1;
            }
        }
        System.out.println("What would you like to change it to?");
        String add = input.next();
        a.set(remove, add);

    }
    static void displayList(ArrayList a){
        System.out.println("Listing all tasks...");
        System.out.println(a);
    }

}
