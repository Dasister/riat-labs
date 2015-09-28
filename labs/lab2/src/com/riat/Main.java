package com.riat;

public class Main {

    private static int randomInt(int min, int max) {
        return (int)((Math.random() * ((max - min) + 1)) + min);
    }

    public static void main(String[] args) {
	    int[] a = new int[3];
        int param = -10;
        System.out.print("Array 'a': ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Main.randomInt(-8, 1);
            System.out.print(a[i] + " ");
            param = Math.max(param, a[i]);
        }
        System.out.println("\nMax: " + param);

        int[][] b = new int[3][4];
        int max_b = -10;
        System.out.println("Array 'b': ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[i] >> j;
                System.out.print(b[i][j] + " ");
                max_b = Math.max(max_b, b[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max of B: " + max_b);
        int n = 6;
        System.out.println("Array 'c': ");
        int[][] c = new int[n][];
        for (int i = 0; i < c.length; i++) {
            c[i] = new int[Main.randomInt(3, 8)];
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = i + j - max_b;
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
