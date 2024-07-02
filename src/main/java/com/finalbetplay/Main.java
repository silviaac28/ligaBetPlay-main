package com.finalbetplay;

import java.util.Scanner;

import com.finalbetplay.utils.ConsoleUtils;
import com.finalbetplay.views.viewEntradas;
import com.finalbetplay.views.viewEquipos;
import com.finalbetplay.views.viewEstadio;
import com.finalbetplay.views.viewJugador;
import com.finalbetplay.views.viewNoticiasComunicados;
import com.finalbetplay.views.viewPartido;
import com.finalbetplay.views.viewPatrocinio;
import com.finalbetplay.views.viewPermiso;
import com.finalbetplay.views.viewResultado;
import com.finalbetplay.views.viewRol;
import com.finalbetplay.views.viewUsuario;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        while(true){
            ConsoleUtils.cleanScreen();
            System.out.println("-------LIGA BETPLAY-------- \n ");
            System.out.println("BIENVENIDO A LA LIGA BET PLAY! \n");
            System.out.println("1. GESTION DE EQUIPOS: ");
            System.out.println("2. GESTION DE ESTADIOS: ");
            System.out.println("3. GESTION DE JUGADORES: ");
            System.out.println("4. GESTION DE PERMISOS: ");
            System.out.println("5. GESTION DE ROLES: ");
            System.out.println("6. GESTION DE USUARIOS");
            System.out.println("7. GESTION DE PARTIDOS");
            System.out.println("8. GESTION DE RESULTADOS");
            System.out.println("9. GESTION DE COMUNICACIONES");
            System.out.println("10. GESTION DE ENTRADAS");
            System.out.println("11. GESTION DE PATROCINIOS");
            System.out.println("12. SALIR");


            System.out.println("\nElige la opción deseada:  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    viewEquipos vistaEquipos = new viewEquipos();
                    vistaEquipos.startEquipos();
                    break;

                case 2:
                    
                    viewEstadio vistaEstadio = new viewEstadio();
                    vistaEstadio.startEstadio();
                    break;

                case 3:
                    viewJugador vistaJugador = new viewJugador();
                    vistaJugador.startJugador();
                    break;

                case 4: 
                    viewPermiso vistaPermiso = new viewPermiso();
                    vistaPermiso.startPermiso();
                    break;

                case 5:
                    viewRol vistaRol = new viewRol();
                    vistaRol.startRol();
                    break;

                case 6:
                    viewUsuario vistaUsuario = new viewUsuario();
                    vistaUsuario.startUsuario();
                    break;

                case 7: 
                    viewPartido vistaPartido = new viewPartido();
                    vistaPartido.startPartido();
                    break;


                case 8:
                    Controller controlador = new Controller();
                    viewResultado.controladorResultado = controlador;
                    viewResultado controladorResultadoView = new viewResultado();
                    controladorResultadoView.startResultados();
                    break;

                case 9:
                    viewNoticiasComunicados vistaNoticiasComunicados = new viewNoticiasComunicados();
                    vistaNoticiasComunicados.startNotCom();

                case 10:
                    viewEntradas vistaEntradas = new viewEntradas();
                    vistaEntradas.startEntradas();

                case 11:
                    viewPatrocinio vistaPatrocinios = new viewPatrocinio();
                    vistaPatrocinios.startPatrocinio();

                case 12:
                    System.out.println("ADIOS! ");
                    sc.close();
                    System.exit(0);
                    break;

                

                default:
                    System.out.println("Opción no válida, elige una opción que esté en el menú: ");
            }
        }
        
    }
}