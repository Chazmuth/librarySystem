package com.company.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import static com.company.methods.utility.getInput;

public class loginHandling {

    private static File usernameList = new File("src/com/company/methods/usernamelist.txt");

    public static void welcome() {
        System.out.println("Welcome");
        while (true) {
            String option = getInput("Would you like to login [l] or register [r]?");
            if (option.equalsIgnoreCase("l") || option.equalsIgnoreCase("r")) {
                if (option.equalsIgnoreCase("l")) {
                    if (logIn()) {
                        break;
                    }
                }
                if (option.equalsIgnoreCase("r")) {
                    register();
                }
            }
        }
    }

    public static boolean logIn() {//passes back a bool so that if the user inputs invalid  details, it loops again
        boolean accessToken = false;
        while (!accessToken) {
            String username = getInput("Username:");
            String password = getInput("Password:");
            System.out.println("Checking....");
            try { //pauses for effect
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("There was an error " + e);
            }
            try {
                Scanner reader = new Scanner(usernameList);
                while (reader.hasNextLine()) {
                    String[] usernamePasswordArray = reader.nextLine().split("&");
                    if (usernamePasswordArray[0].equals(username) && usernamePasswordArray[1].equals(password)) {
                        System.out.println("Access Granted");
                        accessToken = true;
                        return accessToken;
                    }
                }
                System.out.println("Username or password is incorrect");
                break;
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        return accessToken;
    }

    public static void register() {
        System.out.println("Please enter you details");
        while (true) {
            String userEmail = getInput("Enter an email adress:");
            if (userEmail.contains("@") || userEmail.length() > 8) {
                String userPassword = getInput("Enter password:");
                if (userPassword.length() > 8 ||
                        userPassword.matches(".*[A-Z].*") ||
                        userPassword.matches(".*[a-z].*") ||
                        !userPassword.contains("&")) {
                    try {
                        FileWriter writer = new FileWriter(usernameList.getName(), true);
                        String usernamePasswordCombination = "\n" + userEmail + "&" + userPassword;
                        writer.write(usernamePasswordCombination);
                        writer.close();
                        break;
                    } catch (Exception e) {
                        System.out.println("There was an error" + e);
                    }
                } else {
                    System.out.println("Enter a valid password");
                }
            } else {
                System.out.println("Please enter a email");
            }
        }
    }
}
