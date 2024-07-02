package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.Main;
import com.finalbetplay.clases.Jugador;
import com.finalbetplay.utils.ConsoleUtils;

public class viewJugador {
    public static Controller controladorJugador;

    public void startJugador(){
        Scanner scannerJugador = new Scanner(System.in);
        while (true) { 

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION JUGADORES-----\n");

            System.out.println("1. Agregar jugador");
            System.out.println("2. Actualizar jugador");
            System.out.println("3. Listar jugadores");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Salir al menù principal \n ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerJugador.nextInt();
            scannerJugador.nextLine();

            switch (choice) {
                case 1:
                    Jugador jugadores = new Jugador();
                    String codigoJugador = null;
                    System.out.println("Ingrese el codigo del jugador: ");
                    codigoJugador = scannerJugador.nextLine();
                    System.out.println("Ingrese el ID del jugador: ");
                    jugadores.setId(scannerJugador.nextInt());
                    scannerJugador.nextLine();
                    System.out.println("Ingrese el nombre del jugador: ");
                    jugadores.setNombre(scannerJugador.nextLine());
                    System.out.println("Ingrese la edad del jugador: ");
                    jugadores.setId(scannerJugador.nextInt());
                    scannerJugador.nextLine();
                    System.out.println("Ingrese la posicion del jugador: ");
                    jugadores.setPosicion(scannerJugador.nextLine()); 
                    System.out.println("Ingrese la nacionalidad: ");
                    jugadores.setNacionalidad(scannerJugador.nextLine());
                    System.out.println("Ingrese el numero de camiseta del jugador:");
                    jugadores.setNumeroCamiseta(scannerJugador.nextInt());

                    controladorJugador.jugadores.put(codigoJugador, jugadores);
                    break;


                case 3:
                    Jugador jugador = new Jugador();
                    for (String codJugador : controladorJugador.jugadores.keySet()) {
                        jugador = controladorJugador.jugadores.get(codJugador);
                        System.out.println("Nombre: " + jugador.getNombre());
                    }
                    break;

                case 5:
                    return;

                default:
                    scannerJugador.close();
                    break;
            }
          


            

        }}
    }

