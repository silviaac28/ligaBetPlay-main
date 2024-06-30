package com.finalbetplay.views;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Equipo;
import com.finalbetplay.clases.Estadio;
import com.finalbetplay.clases.Jugador;

public class viewEquipos {

    public static Controller controladorEquipo;

    public void startEquipos(){

        Scanner scannerEquipos = new Scanner(System.in);
        while (true){
            System.out.println("1. Agregar equipo");
            System.out.println("2. Actualizar equipo");
            System.out.println("3. Listar equipos");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Agregar jugadores al equipo");
            System.out.println("6. Agregar estadio al equipo");


            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerEquipos.nextInt();
            scannerEquipos.nextLine();
            
            switch(choice){
                case 1:
                    Equipo equipos = new Equipo();
                    Jugador jugadores = new Jugador();
                    String codigoEquipo = null;
                    String codJugador = null;
                    System.out.println("Ingrese el codigo del equipo: ");
                    codigoEquipo = scannerEquipos.nextLine();
                    System.out.println("Ingrese el ID del equipo: ");
                    equipos.setId(scannerEquipos.nextInt());
                    scannerEquipos.nextLine();
                    System.out.println("Ingrese el nombre del equipo: ");
                    equipos.setNombre(scannerEquipos.nextLine());
                    System.out.println("Ingrese la ciudad de origen del equipo: ");
                    equipos.setCiudad(scannerEquipos.nextLine());
                
                    controladorEquipo.equipos.put(codigoEquipo, equipos);
                    break;

                case 3:
                    Equipo listarEquipos = new Equipo();
                    System.out.println("Listado de equipos: ");
                    for (String codEquipos : controladorEquipo.equipos.keySet()) {
                        listarEquipos = controladorEquipo.equipos.get(codEquipos);
                        System.out.println("Codigo: " + codEquipos + " Nombre: " + listarEquipos.getNombre() + " JUGADOR : " + listarEquipos.getListaJugadores());
                    }
                    break;

                case 5:
                    Jugador listarJugadores = new Jugador();
                    Equipo equipoSeleccionado = new Equipo();
                    String codigoEquipoSeleccionar = null;
                    String codigoJugadorSeleccionar = null;
                    System.out.println("Ingrese el codigo del equipo al que desea agregar el jugador: ");
                    System.out.println("-------------------------");
                    System.out.println("Listado de equipos: ");

                    for (String codEquipos : controladorEquipo.equipos.keySet()) {
                        equipoSeleccionado = controladorEquipo.equipos.get(codEquipos);
                        System.out.println("Codigo: " + codEquipos + " Nombre: " + equipoSeleccionado.getNombre());
                    }

                    codigoEquipoSeleccionar = scannerEquipos.nextLine();
                    equipoSeleccionado = controladorEquipo.equipos.get(codigoEquipoSeleccionar);
                    System.out.println("Usted ha seleccionado el equipo: " + equipoSeleccionado.getNombre());
                    

                    System.out.println("Seleccione el codigo del jugador que desea agregar: ");
                    for (String codJugadores : controladorEquipo.jugadores.keySet()){
                        listarJugadores = controladorEquipo.jugadores.get(codJugadores);
                        System.out.println("Codigo: " + codJugadores + " Nombre: " + listarJugadores.getNombre() );
                    }
                    codigoJugadorSeleccionar = scannerEquipos.nextLine();
                    listarJugadores = controladorEquipo.jugadores.get(codigoJugadorSeleccionar);
                    System.out.println("Usted ha seleccionado el jugador: " + listarJugadores.getNombre());

                    equipoSeleccionado.addJugador(listarJugadores);
                    
                    break;
                
                case 6:
                    
                    System.out.println("Esta es la lista de estadios: ");
                    
                    for (String codEstadio : controladorEquipo.estadios.keySet()) {
                        Estadio estadios = new Estadio();
                    }

                default: 
                System.out.println("Opción incorrecta. Selecciona una opción válida.");
            }
        }
    }

}
