package com.finalbetplay.views;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Entrenador;
import com.finalbetplay.clases.Equipo;
import com.finalbetplay.clases.Estadio;
import com.finalbetplay.clases.Jugador;
import com.finalbetplay.clases.Partido;
import com.finalbetplay.utils.ConsoleUtils;

public class viewEquipos {

    public static Controller controladorEquipo;

    public void startEquipos(){

        Scanner scannerEquipos = new Scanner(System.in);

        while (true){

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION EQUIPOS-----\n");

            System.out.println("1. Agregar equipo");
            System.out.println("2. Actualizar equipo");
            System.out.println("3. Listar equipos");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Agregar jugadores al equipo");
            System.out.println("6. Agregar estadio al equipo");
            System.out.println("7. Agregar entrenador al equipo");
            System.out.println("8. LISTAR PARTIDOS");
            System.out.println("9. Salir al menú principal \n .");

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

                case 2: 

                    Equipo equipoActualizar = new Equipo();
                    String codEquipoActualizar = null;
                    Estadio estadiosActualizar = new Estadio();

                    System.out.println("Cuál es el código del equipo que deseas actualizar los datos:");
                    codEquipoActualizar = scannerEquipos.nextLine();
                    equipoActualizar = controladorEquipo.equipos.get(codEquipoActualizar);

                    System.out.println("Cuál es el id del equipo: ");
                    equipoActualizar.setId(scannerEquipos.nextInt());
                    scannerEquipos.nextLine();

                    System.out.println("Cuál es el nombre del equipo: ");
                    equipoActualizar.setNombre(scannerEquipos.nextLine());

                    System.out.println("Cuál es la ciudad del equipo: ");
                    equipoActualizar.setCiudad(scannerEquipos.nextLine());

                    System.out.println("Esta es la lista de estadios  existentes: ");

                    for (String codEstadio : controladorEquipo.estadios.keySet()) {
                        estadiosActualizar = controladorEquipo.estadios.get(codEstadio);
                        System.out.println("Cod Estadio" + codEstadio +"Nombre estadio: " + estadiosActualizar.getNombre());
                    }
                
                    System.out.println("Cuál es el cod estadio: ");
                    equipoActualizar.setEstadio(scannerEquipos.nextLine());

                case 3:
                    Equipo listarEquipos = new Equipo();

                    System.out.println("Listado de equipos: ");
                    for (String codEquipos : controladorEquipo.equipos.keySet()) {
                        listarEquipos = controladorEquipo.equipos.get(codEquipos);
                        System.out.println("Codigo: " + codEquipos + " Nombre: " + listarEquipos.getNombre() + " JUGADOR : " + listarEquipos.getListaJugadores());
                    }

                    System.out.println("El estadio que le pertenece al equipo : " + listarEquipos.getNombre() +  " es: " + listarEquipos.getEstadio());

                    break;
                
                case 4:
                    
                    Equipo equipoEliminar = new Equipo();
                    String codEquipoEliminar = null;

                    System.out.println("Cuál es el código del equipo que deseas eliminar: ");
                    codEquipoEliminar = scannerEquipos.nextLine();

                    equipoEliminar = controladorEquipo.equipos.get(codEquipoEliminar);
                    controladorEquipo.equipos.remove(codEquipoEliminar);

                    System.out.println("El equipo que usted ha eliminado es: " + equipoEliminar.getNombre());

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
                    
                    Equipo equipoEstadio = new Equipo();
                    Estadio listarEstadios = new Estadio();
                    String codEstadioSeleccionar = null;
                    String codEquipoEstadio = null;

                    System.out.println("Esta es la lista de equipos existentes: ");
                    for (String codEquipos : controladorEquipo.equipos.keySet()) {
                        equipoEstadio = controladorEquipo.equipos.get(codEquipos);
                        System.out.println("Cod Equipo: " + codEquipos + "Nombre Equipo: " + equipoEstadio.getNombre());
                    }

                    System.out.println("Elige el código del estadio al que le darás el estadio : ");
                    codEquipoEstadio = scannerEquipos.nextLine();
                    equipoEstadio = controladorEquipo.equipos.get(codEquipoEstadio);
                    System.out.println("Usted ha elegido el equipo: " + equipoEstadio.getNombre());

                    System.out.println("---------------------------------------------");

                    System.out.println("Esta es la lista de estadios: ");
                    for (String codEstadio : controladorEquipo.estadios.keySet()) {
                        listarEstadios = controladorEquipo.estadios.get(codEstadio);
                        System.out.println("Cod Estadio" + codEstadio +"Nombre estadio: " + listarEstadios.getNombre());
                    }

                    System.out.println("Elige el código del estadio que vas a agregar : ");
                    codEstadioSeleccionar = scannerEquipos.nextLine();
                    listarEstadios = controladorEquipo.estadios.get(codEstadioSeleccionar);
                    System.out.println("Usted selecciono el estadio: " + listarEstadios.getNombre());

                    equipoEstadio.setEstadio(codEstadioSeleccionar);

                    break;

                case 7:

                ConsoleUtils.cleanScreen();
                    
                String codEquipoEntrenador = null;
                Equipo equipoEntrenador = new Equipo();
                
                System.out.println("----- LISTA EQUIPOS ------");
                for (String codiEquipo : controladorEquipo.equipos.keySet()) {
                    equipoEntrenador = controladorEquipo.equipos.get(codiEquipo);
                    System.out.println("-----");
                    System.out.println("Codigo Equipo: " + codiEquipo);
                    System.out.println(" Nombre del equipo: " + equipoEntrenador.getNombre());
                    System.out.println("-----");
                }
                
                System.out.println("Cuál es el equipo que deseas agregarle un entrenador: ");
                codEquipoEntrenador = scannerEquipos.nextLine();
                equipoEntrenador = controladorEquipo.equipos.get(codEquipoEntrenador);
                System.out.println("Usted ha elegido el equipo: " + equipoEntrenador.getNombre());

                Entrenador entrenadores = new Entrenador();
                String codigoEntrenadorEquipo = null;
                System.out.println("----- LISTA ENTRENADORES -----");
                for (String codEntrenadores : controladorEquipo.entrenadores.keySet()) {
                    entrenadores = controladorEquipo.entrenadores.get(codEntrenadores);
                    System.out.println("-----");
                    System.out.println("Codigo entrenador: " + codEntrenadores);
                    System.out.println("Nombre entrenador: " + entrenadores.getNombre());
                    System.out.println("------");
                }

                System.out.println("Cuál entrenador estará en su equipo: ");
                codigoEntrenadorEquipo = scannerEquipos.nextLine();

                entrenadores = controladorEquipo.entrenadores.get(codigoEntrenadorEquipo);

                equipoEntrenador.setEntrenador(codigoEntrenadorEquipo);
                
                ConsoleUtils.pause();

                break;

                case 8:

                Equipo equipoPartido = new Equipo();
                String codEquipoPartido = null;
                System.out.println("LISTA EQUIPOS");
                
                for (String codEquiposPartidos : controladorEquipo.equipos.keySet()) {
                    equipoPartido = controladorEquipo.equipos.get(codEquiposPartidos);
                    System.out.println("Codigo equipo : " + codEquiposPartidos + " Nombre Equipo: " + equipoPartido.getNombre());
                }
                
                System.out.println("Cuál es el cod del equipo que quieres ver su historial de partidos : ");
                codEquipoPartido = scannerEquipos.nextLine();
                equipoPartido = controladorEquipo.equipos.get(codEquipoPartido);
                
                    Partido partido = new Partido();
                    System.out.println("PARTIDOS EN LOS QUE PARTICIPÓ");
                for (String codPartido : controladorEquipo.partidos.keySet()) {
                    partido = controladorEquipo.partidos.get(codPartido);
                    if (equipoPartido.getNombre() == partido.getEquipoLocal() || equipoPartido.getNombre() == partido.getEquipoVisitante() ) {
                            System.out.println("Equipo Local: " + partido.getEquipoLocal() + " - " + " Equipo Visitante: " + partido.getEquipoVisitante() );
                    }
                }

                break;

                case 9:
                
                    return;

                default: 
                    System.out.println("Opción incorrecta. Selecciona una opción válida.");

            }

        }

    }

}
