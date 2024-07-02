package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Estadio;
import com.finalbetplay.utils.ConsoleUtils;

public class viewEstadio {
    public static Controller controladorEstadio;

    public void startEstadio(){
        Scanner scannerEstadio = new Scanner(System.in);

        while (true) { 

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION ESTADIOS-----\n");

            System.out.println("1. Agregar estadio ");
            System.out.println("2. Editar estadio ");
            System.out.println("3. Eliminar estadio ");
            System.out.println("4. Visualizar estadio ");
            System.out.println("5. Salir al menú principal \n ");

            System.out.println("Seleccione la opción deseada: ");
            int choice = scannerEstadio.nextInt();
            scannerEstadio.nextLine();
            

            switch (choice) {

                case 1:

                    Estadio estadios = new Estadio();
                    String codigoEstadio = null;
                    System.out.println("Cuál es el código del estadio: " );
                    codigoEstadio = scannerEstadio.nextLine();
                    System.out.println("Cuál es el id del estadio: ");
                    estadios.setId(scannerEstadio.nextInt());
                    scannerEstadio.nextLine();
                    System.out.println("Cuál es el nombre del estadio: ");
                    estadios.setNombre(scannerEstadio.nextLine());
                    System.out.println("Cuál es la ubicación del estadio : ");
                    estadios.setUbicacion(scannerEstadio.nextLine());
                    System.out.println("Cuál es la capacidad del estadio: ");
                    estadios.setCapacidad(scannerEstadio.nextInt());
                    scannerEstadio.nextLine();

                    controladorEstadio.estadios.put(codigoEstadio, estadios);
                    break;

                case 2:
                    System.out.println("Seleccionaste 2 ");
                    break;

                case 3:
                    System.out.println("Seleccionaste 2 ");
                    break;

                case 4:
                    for (String codEstadio : controladorEstadio.estadios.keySet()) {
                        Estadio visualizarEstadios = controladorEstadio.estadios.get(codEstadio);
                        System.out.println("Nombre del estadio : " + visualizarEstadios.getNombre());
                    }
                    break;

                case 5:
                    
                    return;


                default:
                    scannerEstadio.close();
                    break;  
                }
        }}

    }
