package com.finalbetplay.utils;

import java.io.IOException;

public class ConsoleUtils {

    public static void pause() {
        System.out.println("Presiona enter para continuar");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Error al pausar la pantalla: " + e.getMessage());
        }
    }

    public static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
