package com.riat;

// 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static double calculate(int x) {
        if (Math.abs(x) > 10) {
            return x % 10;
        }
        double y = 0;
        for (int i = 1; i <= Math.abs(x) + 1; i++) {
            y += Math.pow(x - i, 2);
        }
        return Math.sqrt(y);
    }

    public static void main(String[] args) {
        String s;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = bufferedReader.readLine();
        } catch (IOException exc) {
            System.out.println("Can't readLine from stdin");
            return;
        }
        System.out.println("Result: " + Main.calculate(Integer.parseInt(s)));
    }
}
