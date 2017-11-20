package com.selenium.example;

/**
 * Created by frank on 11/20/2017.
 */

public class NameFormatter {

    public String formatName(String input) {
        String temp;
        String[] names = input.split(" ");
        names[0] = names[0].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();
        names[1] = names[1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
        return names[0] + " " + names[1];
    }
}
