package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
     write your code here
    String name;
    name = "Daniel";
    System.out.println("Hello "+name);
    */
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your name and press Enter");
            String userName = myObj.nextLine();  // Read user input
            System.out.println("Hello " + userName +". Welcome to the World of Java!");  // Output user input
    }
}
