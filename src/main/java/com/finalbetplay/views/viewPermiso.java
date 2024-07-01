package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Permiso;

public class viewPermiso {

    public static Controller controladorPermisos;

    public void startPermiso(){

        Scanner scannerPermisos = new Scanner(System.in);

        while (true) {
            
            System.out.println("1. Agregar un permiso");
            System.out.println("2. Ver permisos");
            System.out.println("3. Salir");

            int choice = scannerPermisos.nextInt();
            scannerPermisos.nextLine();

            switch (choice) {
                case 1:
                    
                    Permiso permisos = new Permiso();
                    String codigoPermiso = null;

                    System.out.println("Cuál es el código del permiso: ");
                    codigoPermiso = scannerPermisos.nextLine();

                    System.out.println("Cuál es el id del permiso: ");
                    permisos.setId(scannerPermisos.nextInt());
                    scannerPermisos.nextLine();

                    System.out.println("Cuál es la descripción del permiso: ");
                    permisos.setDescripcion(scannerPermisos.nextLine());

                    controladorPermisos.permisos.put(codigoPermiso, permisos);

                    break;
            
                case 2:

                    Permiso verPermisos = new Permiso();
                    for (String codPermisos : controladorPermisos.permisos.keySet()) {
                        verPermisos = controladorPermisos.permisos.get(codPermisos);
                        System.out.println("Cod Permiso: " + codPermisos + " Id: " + verPermisos.getId());
                    }
                    
                    break;

                case 3:
                    System.out.println("SALIENDO");
                    return;

                default:
                    break;
            }
        }

    }

}
