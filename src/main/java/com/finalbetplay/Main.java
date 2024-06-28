package com.finalbetplay;

import java.util.Scanner;

import com.finalbetplay.views.viewEquipos;
import com.finalbetplay.views.viewEstadio;
import com.finalbetplay.views.viewJugador;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        while(true){
            System.out.println("LIGA BETPLAY");
            System.out.println("1. GESTION DE EQUIPOS: ");
            System.out.println("2. GESTION DE ESTADIOS: ");
            System.out.println("3. GESTION DE JUGADORES: ");


            System.out.println("Cuál es tú eleccion: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    viewEquipos vistaEquipos = new viewEquipos();
                    vistaEquipos.startEquipos();

                    break;

                case 2:
                    
                    viewEstadio vistaEstadio = new viewEstadio();
                    vistaEstadio.startEstadio();

                    break;


                case 3:
                    viewJugador vistaJugador = new viewJugador();
                    vistaJugador.startJugador();

                    
                default:
                    System.out.println("Opción no válida");
            }
        }
        
    }
}