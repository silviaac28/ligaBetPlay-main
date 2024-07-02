package com.finalbetplay.utils;

public class ConsoleUtils {

    public static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
