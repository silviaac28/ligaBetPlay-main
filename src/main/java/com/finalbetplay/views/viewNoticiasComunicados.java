package com.finalbetplay.views;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Comunicacion;
import com.finalbetplay.utils.ConsoleUtils;

public class viewNoticiasComunicados {

    public static Controller controladorComunicaciones;

    public void startNotCom(){
        
        Scanner scannerNotCom = new Scanner(System.in);

        while (true) {
            
            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION COMUNICADOS-----\n");

            System.out.println("1. Agregar Noticia / Comunicado");
            System.out.println("2. Listar Noticia / Comunicado");
            System.out.println("3. Editar Noticia / Comunicado");
            System.out.println("4. Eliminar Noticia / Comunicado");
            System.out.println("5. Salir al menú principal \n ");

            int choice = scannerNotCom.nextInt();
            scannerNotCom.nextLine();

            switch (choice) {
                case 1:

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Comunicacion comunicaciones = new Comunicacion();
                    String codigoComunicaciones = null;

                    System.out.println("Cuál es el código de su noticia/comunicación: ");
                    codigoComunicaciones = scannerNotCom.nextLine();

                    System.out.println("Cuál es el id de su noticia/comunicación: ");
                    comunicaciones.setId(scannerNotCom.nextInt());
                    scannerNotCom.nextLine();

                    System.out.println("Cuál es el titulo de su noticia/comunicación: ");
                    comunicaciones.setTitulo(scannerNotCom.nextLine());
                    
                    System.out.println("Cuál es el contenido de su noticia/comunicación: ");
                    comunicaciones.setContenido(scannerNotCom.nextLine());

                    System.out.println("Fecha de publicación: ");
                    String fechaPublicacionStr = scannerNotCom.nextLine();

                    try {
                        Date fechaPublicacion = new Date(dateFormat.parse(fechaPublicacionStr).getTime());
                        comunicaciones.setFechaPublicacion(fechaPublicacion);
                    } catch (ParseException e) {
                        System.out.println("Fecha inválida. Por favor, use el formato yyyy-MM-dd.");
                    }

                    controladorComunicaciones.comunicaciones.put(codigoComunicaciones, comunicaciones);

                    break;
            
                case 2:

                    Comunicacion listarComunicaciones = new Comunicacion();
                    for (String codComunicaciones : controladorComunicaciones.comunicaciones.keySet()) {
                        listarComunicaciones = controladorComunicaciones.comunicaciones.get(codComunicaciones);
                        System.out.println("COD: " + codComunicaciones );
                        System.out.println("ID: ");
                        System.out.println(listarComunicaciones.getId());
                        System.out.println("TITULO: " );
                        System.out.println(listarComunicaciones.getTitulo());
                        System.out.println("CONTENIDO: ");
                        System.out.println(listarComunicaciones.getContenido());
                        System.out.println("FECHA PUBLICACIÓN: ");
                        System.out.println(listarComunicaciones.getFechaPublicacion());
                    }

                    break;

                case 3:

                    SimpleDateFormat dateFormatedit = new SimpleDateFormat("yyyy-MM-dd");

                    String codComunicacionEditar = null;
                    Comunicacion comunicacionEditar = new Comunicacion();

                    System.out.println("Cuál es el código de la noticia/comunicación que desea editar: ");
                    codComunicacionEditar = scannerNotCom.nextLine();

                    System.out.println("Cuál es la nueva id de la comunicación que editarás: ");
                    comunicacionEditar.setId(scannerNotCom.nextInt());
                    scannerNotCom.nextLine();

                    System.out.println("Cuál es el nuevo titulo de la comunicación que editarás: ");
                    comunicacionEditar.setTitulo(scannerNotCom.nextLine());

                    System.out.println("Cuál es el nuevo contenido de la comunicación que editarás: ");
                    comunicacionEditar.setContenido(scannerNotCom.nextLine());

                    System.out.println("Cuál es la fecha que editarás: ");
                    String fechaPublicacionStrEdit = scannerNotCom.nextLine();

                    try {
                        Date fechaPublicacionEdit = new Date(dateFormatedit.parse(fechaPublicacionStrEdit).getTime());
                        comunicacionEditar.setFechaPublicacion(fechaPublicacionEdit);
                    } catch (ParseException e) {
                        System.out.println("Fecha inválida. Por favor, use el formato yyyy-MM-dd.");
                    }

                    controladorComunicaciones.comunicaciones.put(codComunicacionEditar, comunicacionEditar);


                    break;

                case 4:

                    String codComunicacionEliminar = null;
                    Comunicacion comunicacionEliminar = new Comunicacion();

                    System.out.println("Cuál es el código de la comunicación que eliminarás: ");
                    codComunicacionEditar = scannerNotCom.nextLine();
                    comunicacionEliminar = controladorComunicaciones.comunicaciones.get(codComunicacionEditar);

                    controladorComunicaciones.comunicaciones.remove(codComunicacionEditar);
                    System.out.println("Usted ha eliminado la comunicación con el titulo: " + comunicacionEliminar.getTitulo());

                    break;

                case 5:
                    return;

                default:
                    break;
            }
            
        }

    }

}

    
