package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Rol;
import com.finalbetplay.clases.Usuario;
import com.finalbetplay.utils.ConsoleUtils;

public class viewUsuario {

    public static Controller controladorUsuarios;

    public void startUsuario(){

        Scanner scannerUsuario = new Scanner(System.in);

        while (true) {

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION USUARIOS-----\n");

            System.out.println("1. Crear Usuario: ");
            System.out.println("2. Listar Usuarios: ");
            System.out.println("3. Salir al menú principal \n ");

            System.out.println("Selecciona la opción : ");
            int choice = scannerUsuario.nextInt();
            scannerUsuario.nextLine();

            switch (choice) {
                case 1:
                    
                    Usuario usuario = new Usuario();
                    String codigoUsuario = null;
                    String codigoRol = null;

                    System.out.println("Cuál es el código de usuario: ");
                    codigoUsuario = scannerUsuario.nextLine();

                    System.out.println("Cuál es el id del usuario: ");
                    usuario.setId(scannerUsuario.nextInt());
                    scannerUsuario.nextLine();

                    System.out.println("Cuál es el nombre del usuario: ");
                    usuario.setNombre(scannerUsuario.nextLine());

                    System.out.println("Cuál es el email del usuario: ");
                    usuario.setEmail(scannerUsuario.nextLine());

                    System.out.println("Cuál es la contraseña: ");
                    usuario.setPassword(scannerUsuario.nextLine());

                    System.out.println("Roles disponibles: ");
                    Rol rol = new Rol();
                    for (String codRol : controladorUsuarios.rols.keySet()) {
                        rol = controladorUsuarios.rols.get(codRol);
                        System.out.println("Codigo: " + codRol + " Nombre del Rol" + rol.getNombre());
                    }
                    System.out.println("Cuál rol tiene su usuario: ");
                    codigoRol = scannerUsuario.nextLine();
                    rol = controladorUsuarios.rols.get(codigoRol);
                    usuario.setRol(rol);


                    controladorUsuarios.usuarios.put(codigoUsuario, usuario);

                    break;
            
                case 2:

                    Usuario listarUsuario = new Usuario();
                    for (String codUsuario : controladorUsuarios.usuarios.keySet()) {
                        listarUsuario = controladorUsuarios.usuarios.get(codUsuario);
                        System.out.println("Cod Usuario: " + codUsuario + " Nombre Usuario : " + listarUsuario.getNombre() + 
                        " Rol Usuario: " + listarUsuario.getRol());
                    }

                    break;

                case 3:

                    System.out.println("Saliendo! ");
                    return;

                default:
                    break;
            }
        }

    }

}
