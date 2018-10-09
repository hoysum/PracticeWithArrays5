package com.company;

import java.util.Scanner;

//5. Create an array to store 3 names, loop through that array to print out the names.
public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] names = {"Jon", "Mary", "Mike"};

        int i = 0;
        for ( i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}