package com.finalbetplay.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Patrocinio;
import com.finalbetplay.utils.ConsoleUtils;

public class viewPatrocinios {

    public static Controller controladorPatrocinio;

    public void startPatrocinio() {
        Scanner scannerPatrocinio = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION PATROCINIOS-----\n");

            System.out.println("1. Agregar nuevo patrocinio");
            System.out.println("2. Editar patrocinio");
            System.out.println("3. Eliminar patrocinio");
            System.out.println("4. Mostrar patrocinios");
            System.out.println("5. Salir al menú principal \n ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerPatrocinio.nextInt();
            scannerPatrocinio.nextLine();

                switch (choice) {
                case 1:

                    ConsoleUtils.cleanScreen();

                    Patrocinio patrocinios = new Patrocinio();
                    System.out.println("Ingrese el código del patrocinio: ");
                    String codigoPatrocinio = scannerPatrocinio.nextLine();
                    System.out.println("Ingrese el ID del patrocinio: ");
                    patrocinios.setId(scannerPatrocinio.nextInt());
                    scannerPatrocinio.nextLine();
                    System.out.println("Ingrese el nombre del patrocinio: ");
                    patrocinios.setNombre(scannerPatrocinio.nextLine());
                    System.out.println("Ingrese el tipo de patrocinio: ");
                    patrocinios.setTipo(scannerPatrocinio.nextLine());
                    System.out.println("Ingrese el monto del patrocinio: ");
                    patrocinios.setMonto(scannerPatrocinio.nextDouble());
                    scannerPatrocinio.nextLine(); // Consumir el salto de línea

                    // FECHA PATROCINIO
                    while (true) {
                        System.out.println("Ingrese la fecha de inicio del patrocinio (DD/MM/AAAA): ");
                        String fechaInicio = scannerPatrocinio.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(fechaInicio);
                            patrocinios.setFechaInicio(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    while (true) {
                        System.out.println("Ingrese la fecha de fin del patrocinio (DD/MM/AAAA): ");
                        String fechaFin = scannerPatrocinio.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(fechaFin);
                            patrocinios.setFechaFin(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    controladorPatrocinio.patrocinios.put(codigoPatrocinio, patrocinios);
                    System.out.println("Patrocinio agregado exitosamente.");

                    ConsoleUtils.pause();

                    break;

                case 2:

                    ConsoleUtils.cleanScreen();

                    System.out.println("Ingrese el código del Patrocinio que desea editar: ");
                    String codigoEditar = scannerPatrocinio.nextLine();
                    if (!controladorPatrocinio.patrocinios.containsKey(codigoEditar)) {
                        System.out.println("No se encontró el Patrocinio con el código ingresado.");
                        break;
                    }
                    Patrocinio PatrocinioEditar = controladorPatrocinio.patrocinios.get(codigoEditar);

                    System.out.println("Ingrese el nuevo nombre del Patrocinio (actual: " + PatrocinioEditar.getNombre() + "): ");
                    PatrocinioEditar.setNombre(scannerPatrocinio.nextLine());

                    System.out.println("Ingrese el nuevo tipo de patrocinio (actual: " + PatrocinioEditar.getTipo() + "): ");
                    PatrocinioEditar.setTipo(scannerPatrocinio.nextLine());

                    System.out.println("Ingrese el nuevo monto del patrocinio (actual: " + PatrocinioEditar.getMonto() + "): ");
                    PatrocinioEditar.setMonto(scannerPatrocinio.nextDouble());
                    scannerPatrocinio.nextLine(); 

                    // AQUI SE EDITAN LAS FECHAS
                    while (true) {
                        System.out.println("Ingrese la nueva fecha de inicio del patrocinio (actual: " + dateFormatter.format(PatrocinioEditar.getFechaInicio()) + ", formato DD/MM/AAAA): ");
                        String nuevaFechaInicio = scannerPatrocinio.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(nuevaFechaInicio);
                            PatrocinioEditar.setFechaInicio(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    while (true) {
                        System.out.println("Ingrese la nueva fecha de fin del patrocinio (actual: " + dateFormatter.format(PatrocinioEditar.getFechaFin()) + ", formato DD/MM/AAAA): ");
                        String nuevaFechaFin = scannerPatrocinio.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(nuevaFechaFin);
                            PatrocinioEditar.setFechaFin(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    System.out.println("Patrocinio editado exitosamente.");

                    ConsoleUtils.pause();


                    break;

                case 3:

                    ConsoleUtils.cleanScreen();

                    System.out.println("Ingrese el código del Patrocinio que desea eliminar: ");
                    String codigoEliminar = scannerPatrocinio.nextLine();
                    if (controladorPatrocinio.patrocinios.remove(codigoEliminar) != null) {
                        System.out.println("Patrocinio eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró el Patrocinio con el código ingresado.");
                    }

                    ConsoleUtils.pause();

                    break;

                case 4:

                    ConsoleUtils.cleanScreen();

                    System.out.println("-------------------------");
                    System.out.println("LISTA DE PATROCINIOS:");
                    for (String codigo : controladorPatrocinio.patrocinios.keySet()) {
                        Patrocinio p = controladorPatrocinio.patrocinios.get(codigo);
                        System.out.println("-------------------------");
                        System.out.println("Código: " + codigo);
                        System.out.println("ID: " + p.getId());
                        System.out.println("Nombre: " + p.getNombre());
                        System.out.println("Tipo: " + p.getTipo());
                        System.out.println("Monto: " + p.getMonto());
                        System.out.println("Fecha de inicio: " + dateFormatter.format(p.getFechaInicio()));
                        System.out.println("Fecha de fin: " + dateFormatter.format(p.getFechaFin()));
                        System.out.println("-------------------------");
                    }

                    ConsoleUtils.pause();
                    
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }

}
