package com.finalbetplay.views;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.MedioComunicacion;
import com.finalbetplay.utils.ConsoleUtils;

public class viewMediosComunicacion {
    public static Controller controladorMediosComunicacion;

    public void startMediosComunicaciones(){
        Scanner scannerMediosComunicaciones = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    

    while (true) {

        ConsoleUtils.cleanScreen();

        System.out.println("\n-----MENÚ GESTION MEDIOS DE COMUNICACION-----\n");

        System.out.println("1. Agregar nuevo medio de comunicacion");
        System.out.println("2. Editar medio de comunicacion");
        System.out.println("3. Eliminar medio de comunicacion");
        System.out.println("4. Mostrar medios de comunicacion");
        System.out.println("5. Salir al menú principal \n ");

        System.out.println("Selecciona la opción deseada: ");
        int choice = scannerMediosComunicaciones.nextInt();
        scannerMediosComunicaciones.nextLine();

            switch (choice) {
            case 1:

                MedioComunicacion medioPeriodista = new MedioComunicacion();
                ConsoleUtils.cleanScreen();
                MedioComunicacion medioscomunicaciones = new MedioComunicacion();
                System.out.println("Ingrese el código del medio de comunicacion: ");
                String codigoMedioComunicacion = scannerMediosComunicaciones.nextLine();
                System.out.println("Ingrese el ID del medio de comunicacion: ");
                medioscomunicaciones.setId(scannerMediosComunicaciones.nextInt());
                scannerMediosComunicaciones.nextLine();
                System.out.println("Ingrese el nombre del medio de comunicacion: ");
                medioscomunicaciones.setNombre(scannerMediosComunicaciones.nextLine());
                System.out.println("Ingrese el tipo de medio de comunicacion: ");
                medioscomunicaciones.setTipo(scannerMediosComunicaciones.nextLine());

                // Usuario usuarioPeriodista = new Usuario();
                // String codigoPeriodistaMedio = null;
                // System.out.println("LISTA PERIODISTAS");
                // for (String codPeriodistas : controladorMediosComunicacion.usuarios.keySet()) {
                //     usuarioPeriodista = controladorMediosComunicacion.usuarios.get(codPeriodistas);
                //     if (usuarioPeriodista.getRol() == "Periodista") {
                //         System.out.println("Cod Periodista: " + codPeriodistas + " Nombre Periodista: " + rolPeriodista.getNombre());
                //     }else{
                //         System.out.println("No hay Periodistaes :cx");
                //     }
                // }

                // System.out.println("Cuál periodista estará en su medio: ");
                // codigoPeriodistaMedio = scannerMediosComunicaciones.nextLine();

                // rolPeriodista = controladorMediosComunicacion.rols.get(codigoPeriodistaMedio);

                // medioPeriodista.setListaPeriodistas(null);

                controladorMediosComunicacion.medioscomunicaciones.put(codigoMedioComunicacion, medioscomunicaciones);
                System.out.println("Patrocinador agregado exitosamente.");

                ConsoleUtils.pause();

                break;

            case 2:

                ConsoleUtils.cleanScreen();

                System.out.println("Ingrese el código del medio de comunicación que desea editar: ");
                String codigoEditar = scannerMediosComunicaciones.nextLine();
                if (!controladorMediosComunicacion.medioscomunicaciones.containsKey(codigoEditar)) {
                    System.out.println("No se encontró el medio de comunicación con el código ingresado.");
                    break;
                }
                MedioComunicacion MedioComunicacionEditar = controladorMediosComunicacion.medioscomunicaciones.get(codigoEditar);
                
                System.out.println("Ingrese el nuevo nombre del medio de comunicacion (actual: " + MedioComunicacionEditar.getNombre() + "): ");
                MedioComunicacionEditar.setNombre(scannerMediosComunicaciones.nextLine());
                System.out.println("Ingrese el nuevo tipo de medio (actual: " + MedioComunicacionEditar.getTipo() + "): ");
                MedioComunicacionEditar.setTipo(scannerMediosComunicaciones.nextLine());
                
                System.out.println("Medio de comunicacion editado exitosamente.");

                ConsoleUtils.pause();

                break;


            case 3:
                ConsoleUtils.cleanScreen();

                System.out.println("Ingrese el código del medio de comunicación que desea eliminar: ");
                String codigoEliminar = scannerMediosComunicaciones.nextLine();
                if (controladorMediosComunicacion.medioscomunicaciones.remove(codigoEliminar) != null) {
                    System.out.println("Medio de comunicación eliminado exitosamente.");
                } else {
                    System.out.println("No se encontró el medio de comunicación con el código ingresado.");
                }

                ConsoleUtils.pause();

                break;

            case 4:

                ConsoleUtils.cleanScreen();

                System.out.println("------------------------------------");
                System.out.println("LISTA DE MEDIOS DE COMUNICACIÓN:");
                for (String codigo : controladorMediosComunicacion.medioscomunicaciones.keySet()) {
                    MedioComunicacion e = controladorMediosComunicacion.medioscomunicaciones.get(codigo);
                    System.out.println("-------------------------");
                    System.out.println("Código: " + codigo);
                    System.out.println("ID: " + e.getId());
                    System.out.println("Nombre: " + e.getNombre());
                    System.out.println("Tipo: " + e.getTipo());
                    System.out.println("------------------------------------");
                }

                ConsoleUtils.pause();
                
                break;

            case 5:
                return;

            default:
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                break;

                


            }}
    
}
}