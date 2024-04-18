package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random(987833);
        for(int count = 0; count < 5; count++) {
            System.out.println("Random number is:" + r.nextLong(50L,100L));
        }
    }
}