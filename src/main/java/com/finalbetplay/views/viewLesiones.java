package com.finalbetplay.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Lesion;
import com.finalbetplay.utils.ConsoleUtils;

public class viewLesiones {

    public static Controller controladorLesion;

    public void StartLesiones(){

        Scanner scannerLesiones = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION LESIONES-----\n");

            System.out.println("1. Ingresar nueva lesión");
            System.out.println("2. Editar lesión");
            System.out.println("3. Eliminar lesión");
            System.out.println("4. Listar lesiones");
            System.out.println("5. Salir al menú principal \n ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerLesiones.nextInt();
            scannerLesiones.nextLine();

            switch (choice) {
                case 1:
                    ConsoleUtils.cleanScreen();

                    Lesion lesiones = new Lesion();
                    System.out.println("Ingrese el código de la lesión: ");
                    String codigoLesion = scannerLesiones.nextLine();
                    System.out.println("Ingrese el ID de la lesión: ");
                    lesiones.setId(scannerLesiones.nextInt());
                    scannerLesiones.nextLine();

                    // SELECCION JUGADOR 



                    //


                    System.out.println("Ingrese el tipo de lesión: ");
                    lesiones.setTipo(scannerLesiones.nextLine());
                    System.out.println("Ingrese la gravedad de la lesión: ");
                    lesiones.setGravedad(scannerLesiones.nextLine());

                    // FECHA INICIO
                    while (true) {
                        System.out.println("Ingrese la fecha de inicio de la lesión (DD/MM/AAAA): ");
                        String fechaInicioLesion = scannerLesiones.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(fechaInicioLesion);
                            lesiones.setfechaInicioLesion(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    // while (true) {
                    //     System.out.println("Ingrese la fecha de fin de la recuperación (DD/MM/AAAA): ");
                    //     String fechaFin = scannerPatrocinio.nextLine();
                    //     try {
                    //         Date fecha = dateFormatter.parse(fechaFin);
                    //         patrocinios.setFechaFin(fecha);
                    //         break;
                    //     } catch (ParseException e) {
                    //         System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                    //     }
                    // }

                    // controladorPatrocinio.patrocinios.put(codigoPatrocinio, patrocinios);
                    // System.out.println("Patrocinio agregado exitosamente.");

                    // ConsoleUtils.pause();

                    // break;
            
        }

       }
    }


}
