package com.selenium.example;

/**
 * Created by frank on 11/20/2017.
 */

public class NameFormatter {

    public String formatName(String input) {
        String temp = "";
        String[] names = input.split(" ");
        for(int i = 0; i < names.length; i++) {
            temp += names[i].substring(0,1).toUpperCase() + names[i].substring(1).toLowerCase();
            if(i != names.length -1) {
                temp += " ";
            }
        }
        return temp;
    }
}
