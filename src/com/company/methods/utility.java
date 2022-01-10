package com.company.methods;

import java.util.Scanner;

public class utility {
    public static String getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
}
