package com.riat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    private final static int YEAR = 2015;

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
            Magazine[] magazines = new Magazine[7];
            magazines[0] = new Magazine();
            magazines[1] = new Magazine("foobar", 1, 2012);
            magazines[0].print();
            magazines[1].print();
            for (int i = 2; i < magazines.length; i++) {
                String str = bufferedReader.readLine();
                String[] vals = str.split(" ");
                magazines[i] = new Magazine(vals[0], Integer.parseInt(vals[1]), Integer.parseInt(vals[2]));
                magazines[i].print();
            }
            Arrays.sort(magazines);
            try (PrintWriter printWriter = new PrintWriter("test-answer.txt", "UTF-8")) {
                for (int i = 0; i < magazines.length; i++) {
                    printWriter.write(magazines[i].sprint());
                }
            }
            int count = 0;
            for (int i = 0; i < magazines.length; i++) {
                if (magazines[i].getYear() == Main.YEAR) {
                    count++;
                }
            }
            System.out.println("Number of magazines in this year: " + count);
        } catch (IOException exc) {
            System.err.println("Can't read from file!");
        }
    }
}
