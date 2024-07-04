package com.finalbetplay.views;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.sql.Time;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Equipo;
import com.finalbetplay.clases.Estadio;
import com.finalbetplay.clases.Partido;


public class viewPartido {
    public static Controller controladorPartido;

    public void startPartido() {
        Scanner scannerPartidos = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

        while (true) {


            System.out.println("\n-----MENÚ GESTION PARTIDOS-----\n");

            // System.out.println("1. Agregar nuevo partido");
            System.out.println("2. Editar partido");
            System.out.println("3. Eliminar partido");
            System.out.println("4. Mostrar partidos");
            System.out.println("5. Volver al menú principal \n ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerPartidos.nextInt();
            scannerPartidos.nextLine();

            switch (choice) {
                case 1:
                    Partido partidos = new Partido();
                    Equipo equipos = new Equipo();
                    Estadio estadios = new Estadio();
                    Equipo listarEquipos = new Equipo();
                    Equipo listarEquipos1 = new Equipo();
                    Estadio listarEstadios = new Estadio();
                    String codigoPartido = null;
                    String codigoEquipoSeleccionar1 = null;
                    String codigoEquipoSeleccionar2 = null;
                    String codigoEstadioSeleccionado = null;

                    System.out.println("Ingrese el codigo del partido: ");
                    codigoPartido = scannerPartidos.nextLine();
                    System.out.println("Ingrese el ID del partido: ");
                    partidos.setId(scannerPartidos.nextInt());
                    scannerPartidos.nextLine();

                    // SELECCION DE EQUIPOS PARTICIPANTESS
                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE EQUIPOS: ");
                    for (String codEquipos : controladorPartido.equipos.keySet()) {
                        listarEquipos = controladorPartido.equipos.get(codEquipos);
                        System.out.println("Codigo: " + codEquipos + " Nombre: " + listarEquipos.getNombre());
                    }
                    System.out.println("-------------------------");

                    System.out.println("Ingrese el codigo del equipo que jugará de local: ");
                    codigoEquipoSeleccionar1 = scannerPartidos.nextLine();
                    listarEquipos = controladorPartido.equipos.get(codigoEquipoSeleccionar1);
                    System.out.println("Usted ha seleccionado el equipo: " + listarEquipos.getNombre());
                    partidos.setEquipoLocal(listarEquipos.getNombre());

                    System.out.println("Ingrese el codigo del equipo que jugará de visitante: ");
                    codigoEquipoSeleccionar2 = scannerPartidos.nextLine();
                    listarEquipos1 = controladorPartido.equipos.get(codigoEquipoSeleccionar2);
                    System.out.println("Usted ha seleccionado el equipo: " + listarEquipos1.getNombre());
                    partidos.setEquipoVisitante(listarEquipos1.getNombre());

                    // FECHA PARTIDO
                    System.out.println("Ingrese la fecha en que se jugará el partido (DD/MM/AAAA): ");
                    String fechaPartido = scannerPartidos.nextLine();
                    try {
                        Date fecha = dateFormatter.parse(fechaPartido);
                        partidos.setFecha(fecha);
                        System.out.println("Fecha del partido: " + fecha);
                    } catch (ParseException e) {
                        System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato DD/MM/AAAA.");
                        break;
                    }

                    // HORA PARTIDO
                    System.out.println("Ingrese la hora en que se jugará el partido (HH:MM:SS): ");
                    String horaPartido = scannerPartidos.nextLine();
                    try {
                        Time hora = new Time(timeFormatter.parse(horaPartido).getTime());
                        partidos.setHora(hora);
                        System.out.println("Hora del partido: " + hora);
                    } catch (ParseException e) {
                        System.out.println("Hora no válida. Por favor, ingrese la hora en el formato HH:MM:SS.");
                        break;
                    }

                    // ESTADIO

                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE ESTADIOS: ");
                    for (String codigoEstadio : controladorPartido.estadios.keySet()) {
                        listarEstadios = controladorPartido.estadios.get(codigoEstadio);
                        System.out.println("Codigo: " + codigoEstadio + " Nombre: " + listarEstadios.getNombre());
                    }
                    System.out.println("-------------------------");

                    System.out.println("Ingrese el codigo del estadio en el que se jugará el partido: ");

                    codigoEstadioSeleccionado = scannerPartidos.nextLine();
                    listarEstadios = controladorPartido.estadios.get(codigoEstadioSeleccionado);
                    System.out.println("Usted ha seleccionado el estadio: " + listarEstadios.getNombre());
                    partidos.setEstadio(listarEstadios.getNombre());

                    controladorPartido.partidos.put(codigoPartido, partidos);
                    System.out.println("Partido agregado exitosamente.");

                    break;

                case 2:
                    Partido partidos1 = new Partido();
                    Equipo equipos1 = new Equipo();
                    Estadio estadios1 = new Estadio();
                    Equipo listarEquipos2 = new Equipo();
                    Equipo listarEquipos3 = new Equipo();
                    Estadio listarEstadios1 = new Estadio();
                    String codigoPartido1 = null;
                    String codigoEquipoSeleccionar1New = null;
                    String codigoEquipoSeleccionar2New = null;
                    String codigoEstadioSeleccionadoNew = null;
                    System.out.println("Ingrese el código del partido que desea editar: ");
                    String codigoEditar = scannerPartidos.nextLine();
                    if (!controladorPartido.partidos.containsKey(codigoEditar)) {
                        System.out.println("No se encontró el partido con el código ingresado.");
                        break;
                    }

                    Partido partidoEditar = controladorPartido.partidos.get(codigoEditar);

                    // SELECCION DE EQUIPOS PARTICIPANTESS
                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE EQUIPOS: ");
                    for (String codEquipos : controladorPartido.equipos.keySet()) {
                        listarEquipos = controladorPartido.equipos.get(codEquipos);
                        System.out.println("Codigo: " + codEquipos + " Nombre: " + listarEquipos.getNombre());
                    }
                    System.out.println("-------------------------");
                    
                    System.out.println("Ingrese el codigo del nuevo equipo que jugará de local: ");
                    codigoEquipoSeleccionar1 = scannerPartidos.nextLine();
                    listarEquipos = controladorPartido.equipos.get(codigoEquipoSeleccionar1);
                    System.out.println("Usted ha seleccionado el equipo: " + listarEquipos.getNombre());
                    partidos1.setEquipoLocal(listarEquipos.getNombre());

                    System.out.println("Ingrese el codigo del nuevo equipo que jugará de visitante: ");
                    codigoEquipoSeleccionar2 = scannerPartidos.nextLine();
                    listarEquipos1 = controladorPartido.equipos.get(codigoEquipoSeleccionar2);
                    System.out.println("Usted ha seleccionado el equipo: " + listarEquipos1.getNombre());
                    partidos1.setEquipoVisitante(listarEquipos1.getNombre());

                 


                case 4:
                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE PARTIDOS:");
                    for (String codPartido : controladorPartido.partidos.keySet()) {
                        Partido p = controladorPartido.partidos.get(codPartido);
                        System.out.println("ID: " + p.getId());
                        System.out.println("Fecha: " + dateFormatter.format(p.getFecha()));
                        System.out.println("Hora: " + timeFormatter.format(p.getHora()));
                        System.out.println("Equipo local: " + p.getEquipoLocal());
                        System.out.println("Equipo visitante: " + p.getEquipoVisitante());
                        System.out.println("Estadio: " + p.getEstadio());
                        System.out.println("-------------------------");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("opcion incorrecta");
            }

        }

    }

}