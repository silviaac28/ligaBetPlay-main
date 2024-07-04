package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Entrenador;
import com.finalbetplay.utils.ConsoleUtils;

public class viewEntrenador {

    public static Controller controladorEntrenadores;

    public void startEntrenador(){

        while(true){

            ConsoleUtils.cleanScreen();

            Scanner scannerEntrenador = new Scanner(System.in);

            System.out.println("-----Gestion Entrenadores-----");
            System.out.println("1. Agregar Entrenador");
            System.out.println("2. Listar Entrenadores");
            System.out.println("3. Salir");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerEntrenador.nextInt();

            scannerEntrenador.nextLine();

            switch (choice) {
                case 1:

                    ConsoleUtils.cleanScreen();

                    Entrenador entrenadorAgregar = new Entrenador();
                    String codigoEntrenador = null;

                    System.out.println("----- AGREGAR ENTRENADOR -----");
                    System.out.println("Cual es el codigo del entrenador: ");
                    codigoEntrenador = scannerEntrenador.nextLine();

                    System.out.println("Cuál es el id del entrenador: ");
                    entrenadorAgregar.setId(scannerEntrenador.nextInt());
                    scannerEntrenador.nextLine();
                    System.out.println("Cuál es el nombre del entrenador: ");
                    entrenadorAgregar.setNombre(scannerEntrenador.nextLine());
                    System.out.println("Cuál es la edad del entrenador: ");
                    entrenadorAgregar.setEdad(scannerEntrenador.nextInt());
                    scannerEntrenador.nextLine();
                    System.out.println("Cual es la nacionalidad del entrenador");
                    entrenadorAgregar.setNacionalidad(scannerEntrenador.nextLine());
                    System.out.println("Cual es la experiencia del entrenador: ");
                    entrenadorAgregar.setExperiencia(scannerEntrenador.nextInt());

                    controladorEntrenadores.entrenadores.put(codigoEntrenador, entrenadorAgregar);

                    ConsoleUtils.pause();

                    break;

                case 2:
                    
                    ConsoleUtils.cleanScreen();

                    Entrenador entrenadoreListar  = new Entrenador();

                    for (String codEntrenadores : controladorEntrenadores.entrenadores.keySet()) {
                        entrenadoreListar = controladorEntrenadores.entrenadores.get(codEntrenadores);
                        System.out.println("Codigo entrenador: " + codEntrenadores);
                        System.out.println("Nombre Entrenador: " + entrenadoreListar.getNombre());
                        System.out.println("El entrenador tiene  " + entrenadoreListar.getExperiencia() + " años de experiencia");
                    }

                    ConsoleUtils.pause();

                    break;

                case 3:
                    return;
                    

                default:
                    scannerEntrenador.close();
                    break;
            }

        }

    }

}