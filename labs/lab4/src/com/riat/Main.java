package com.riat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
            BasePolicy[] basePolicy = new BasePolicy[7];
            System.out.println("Policies: ");
            for (int i = 0; i < basePolicy.length; i++) {
                String[] vals = bufferedReader.readLine().split(" ");
                basePolicy[i] = new MedicalPolicy(vals[0], Integer.parseInt(vals[1]), vals[2]);
                basePolicy[i].print();
            }
            BasePolicy maxPolicy = basePolicy[0];
            for (int i = 1; i < basePolicy.length; i++) {
                if (maxPolicy.getExpiresIn() < basePolicy[i].getExpiresIn()) {
                    maxPolicy = basePolicy[i];
                }
            }
            System.out.println("Policy with highest expiration date: ");
            maxPolicy.print();
        } catch (IOException exc) {
            System.err.println("Can't read from file!");
        }
    }
}
