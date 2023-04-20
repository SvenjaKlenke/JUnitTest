package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println(grosserWert(addieren(5, 8)));
    }

    public static int addieren(int a, int b) {
        int x = a + b;
        return x;
    }

    public static boolean grosserWert(int addi) {
        return addi < 100;
    }
}