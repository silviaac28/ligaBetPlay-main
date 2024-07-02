package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Permiso;
import com.finalbetplay.clases.Rol;
import com.finalbetplay.utils.ConsoleUtils;

public class viewRol {

    public static Controller controladorRol;
    public void startRol(){


        Scanner scannerRol = new Scanner(System.in);

        while (true) {

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION ROLES-----\n");

            System.out.println("1. Agregar un Rol: ");
            System.out.println("2. Listar Roles: ");
            System.out.println("3. Agregar Permiso a Rol: ");
            System.out.println("4. Salir al menú principal \n ");

            System.out.println("Cuál es la eleccion: ");
            int choice = scannerRol.nextInt();
            scannerRol.nextLine();

            switch (choice) {
                case 1:

                    String codigoRol = null;
                    Rol rols = new Rol();

                    System.out.println("Cuál es el código del Rol: ");
                    codigoRol = scannerRol.nextLine();

                    System.out.println("Cuál es el id del rol : ");
                    rols.setId(scannerRol.nextInt());
                    scannerRol.nextLine();

                    System.out.println("Cuál es el nombre del rol : ");
                    rols.setNombre(scannerRol.nextLine());

                    controladorRol.rols.put(codigoRol, rols);
                    
                    
                    
                    break;

                case 2:

                    Rol listarRol = new Rol();
                    System.out.println("Lista de Roles");
                    for (String codRol : controladorRol.rols.keySet()) {
                        listarRol = controladorRol.rols.get(codRol);
                        System.out.println("Nombre Rol: " + listarRol.getNombre() + " Permisos Rol: " + listarRol.getListapPermisos());
                    }

                    break;
                
                case 3:

                    System.out.println("Lista Permisos");
                    String codigoRolPermiso = null;
                    Rol rolParaPermiso = new Rol();
                    System.out.println("Lista de Roles");
                    for (String codRol : controladorRol.rols.keySet()) {
                        rolParaPermiso = controladorRol.rols.get(codRol);
                        System.out.println("Cod Rol: " + codRol + " Nombre Rol: " + rolParaPermiso.getNombre());
                    }
                    System.out.println("Que rol eligirá: ");
                    codigoRolPermiso = scannerRol.nextLine();
                    rolParaPermiso = controladorRol.rols.get(codigoRolPermiso);

            
                    
                    System.out.println("\n LISTA DE PERMISOS");
                    Permiso permisosParaRol = new Permiso();
                    String codigoPermisoRol = null;
                    for (String codPermisos : controladorRol.permisos.keySet() ) {
                        permisosParaRol = controladorRol.permisos.get(codPermisos);
                        System.out.println("Cod Permiso: " + codPermisos + "Descripcion permiso: " + permisosParaRol.getDescripcion());
                    }
                    System.out.println("Cuál permiso le deseas agregar a este Rol: ");
                    codigoPermisoRol = scannerRol.nextLine();
                    permisosParaRol = controladorRol.permisos.get(codigoPermisoRol);

                    rolParaPermiso.addPermiso(permisosParaRol);

                    break;

                case 4:
                    return;
            
                default:
                System.out.println("Seleccione una opción correcta: ");
                    break;
            }
        }

    }   

}