package com.finalbetplay.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Patrocinador;

public class viewPatrocinio {
    public static Controller controladorPatrocinador;

    public void startPatrocinio() {
        Scanner scannerPatrocinador = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("1. Agregar nuevo patrocinio");
            System.out.println("2. Editar patrocinio");
            System.out.println("3. Eliminar patrocinio");
            System.out.println("4. Mostrar patrocinios");
            System.out.println("5. Volver al menú principal");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerPatrocinador.nextInt();
            scannerPatrocinador.nextLine();

                switch (choice) {
                case 1:
                    Patrocinador patrocinadores = new Patrocinador();
                    System.out.println("Ingrese el código del patrocinador: ");
                    String codigoPatrocinador = scannerPatrocinador.nextLine();
                    System.out.println("Ingrese el ID del patrocinador: ");
                    patrocinadores.setId(scannerPatrocinador.nextInt());
                    scannerPatrocinador.nextLine();
                    System.out.println("Ingrese el nombre del patrocinador: ");
                    patrocinadores.setNombre(scannerPatrocinador.nextLine());
                    System.out.println("Ingrese el tipo de patrocinio: ");
                    patrocinadores.setTipo(scannerPatrocinador.nextLine());
                    System.out.println("Ingrese el monto del patrocinio: ");
                    patrocinadores.setMonto(scannerPatrocinador.nextDouble());
                    scannerPatrocinador.nextLine(); // Consumir el salto de línea

                    // FECHA PATROCINIO
                    while (true) {
                        System.out.println("Ingrese la fecha de inicio del patrocinio (DD/MM/AAAA): ");
                        String fechaInicio = scannerPatrocinador.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(fechaInicio);
                            patrocinadores.setFechaInicio(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    while (true) {
                        System.out.println("Ingrese la fecha de fin del patrocinio (DD/MM/AAAA): ");
                        String fechaFin = scannerPatrocinador.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(fechaFin);
                            patrocinadores.setFechaFin(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    controladorPatrocinador.patrocinadores.put(codigoPatrocinador, patrocinadores);
                    System.out.println("Patrocinador agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("Ingrese el código del patrocinador que desea editar: ");
                    String codigoEditar = scannerPatrocinador.nextLine();
                    if (!controladorPatrocinador.patrocinadores.containsKey(codigoEditar)) {
                        System.out.println("No se encontró el patrocinador con el código ingresado.");
                        break;
                    }
                    Patrocinador patrocinadorEditar = controladorPatrocinador.patrocinadores.get(codigoEditar);

                    System.out.println("Ingrese el nuevo nombre del patrocinador (actual: " + patrocinadorEditar.getNombre() + "): ");
                    patrocinadorEditar.setNombre(scannerPatrocinador.nextLine());

                    System.out.println("Ingrese el nuevo tipo de patrocinio (actual: " + patrocinadorEditar.getTipo() + "): ");
                    patrocinadorEditar.setTipo(scannerPatrocinador.nextLine());

                    System.out.println("Ingrese el nuevo monto del patrocinio (actual: " + patrocinadorEditar.getMonto() + "): ");
                    patrocinadorEditar.setMonto(scannerPatrocinador.nextDouble());
                    scannerPatrocinador.nextLine(); 

                    // AQUI SE EDITAN LAS FECHAS
                    while (true) {
                        System.out.println("Ingrese la nueva fecha de inicio del patrocinio (actual: " + dateFormatter.format(patrocinadorEditar.getFechaInicio()) + ", formato DD/MM/AAAA): ");
                        String nuevaFechaInicio = scannerPatrocinador.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(nuevaFechaInicio);
                            patrocinadorEditar.setFechaInicio(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    while (true) {
                        System.out.println("Ingrese la nueva fecha de fin del patrocinio (actual: " + dateFormatter.format(patrocinadorEditar.getFechaFin()) + ", formato DD/MM/AAAA): ");
                        String nuevaFechaFin = scannerPatrocinador.nextLine();
                        try {
                            Date fecha = dateFormatter.parse(nuevaFechaFin);
                            patrocinadorEditar.setFechaFin(fecha);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        }
                    }

                    System.out.println("Patrocinador editado exitosamente.");
                    break;

                case 3:
                    System.out.println("Ingrese el código del patrocinador que desea eliminar: ");
                    String codigoEliminar = scannerPatrocinador.nextLine();
                    if (controladorPatrocinador.patrocinadores.remove(codigoEliminar) != null) {
                        System.out.println("Patrocinador eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró el patrocinador con el código ingresado.");
                    }
                    break;

                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Lista de Patrocinios:");
                    for (String codigo : controladorPatrocinador.patrocinadores.keySet()) {
                        Patrocinador p = controladorPatrocinador.patrocinadores.get(codigo);
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
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    scannerPatrocinador.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
}
