package com.finalbetplay.views;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.sql.Time;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Jugador;
import com.finalbetplay.clases.Partido;
import com.finalbetplay.clases.Resultado;
import com.finalbetplay.clases.Tarjeta;
import com.finalbetplay.utils.ConsoleUtils;

public class viewResultado {

    public static Controller controladorResultado;

    public void startResultados() {

        Scanner scannerResultados = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

        while (true) {

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION RESULTADOS-----\n");

            System.out.println("1. Ingresar nuevo resultado");
            System.out.println("2. Ingresar tarjetas del partido");
            System.out.println("3. Editar resultado");
            System.out.println("4. Visualizar resultados");
            System.out.println("5. Salir al menú principal \n ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerResultados.nextInt();
            scannerResultados.nextLine();

            switch (choice) {
                case 1:
                    // NUEVO RESULTADO
                    Resultado resultados = new Resultado();
                    String codigoResultado = null;

                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE PARTIDOS: ");
                    for (String codPartido : controladorResultado.partidos.keySet()) {
                        Partido p = controladorResultado.partidos.get(codPartido);
                        System.out.println("Codigo: " + codPartido);
                        System.out.println("ID: " + p.getId());
                        System.out.println("Fecha: " + dateFormatter.format(p.getFecha()));
                        System.out.println("Hora: " + timeFormatter.format(p.getHora()));
                        System.out.println("Equipo local: " + p.getEquipoLocal());
                        System.out.println("Equipo visitante: " + p.getEquipoVisitante());
                        System.out.println("Estadio: " + p.getEstadio());
                        System.out.println("-------------------------");
                    }

                    System.out.println("Ingrese el codigo del partido del cual desea agregar resultado: ");
                    codigoResultado = scannerResultados.nextLine();
                    System.out.println("Ingrese el ID del resultado: ");
                    resultados.setId(scannerResultados.nextInt());
                    scannerResultados.nextLine();
                    System.out.println("Ingrese el numero de goles del equipo local: ");
                    resultados.setGolesEquipoLocal(scannerResultados.nextInt());
                    scannerResultados.nextLine();
                    System.out.println("Ingrese el numero de goles del equipo visitante: ");
                    resultados.setGolesEquipoVisitante(scannerResultados.nextInt());
                    scannerResultados.nextLine();

                    resultados.setPartido(Integer.parseInt(codigoResultado)); // Asignar ID del partido al resultado
                    controladorResultado.resultados.put(codigoResultado, resultados);
                    break;

                case 2:
                    // INGRESAR TARJETAS
                    Jugador listarJugadores = new Jugador();
                    Jugador jugadores = new Jugador();
                    System.out.println("-------------------------");
                    System.out.println("LISTA DE PARTIDOS:");
                    for (String codResultadoT : controladorResultado.resultados.keySet()) {
                        Resultado r = controladorResultado.resultados.get(codResultadoT);
                        System.out.println("Codigo: " + codResultadoT + " , ID Partido: " + r.getPartido());
                        System.out.println("Goles equipo local: " + r.getGolesEquipoLocal());
                        System.out.println("Goles equipo visitante: " + r.getGolesEquipoVisitante());
                        // INFO NOMBRE DE EQUIPOS
                        for (String codPartido : controladorResultado.partidos.keySet()) {
                            Partido p = controladorResultado.partidos.get(codPartido);
                            System.out.println("Equipo local: " + p.getEquipoLocal());
                            System.out.println("Equipo visitante: " + p.getEquipoVisitante());
                        }
                        System.out.println("-------------------------");
                    }
                    System.out.print("Ingrese el código del partido al cual desea agregar tarjetas: ");
                    String codigoPartido = scannerResultados.nextLine();
                    if (!controladorResultado.resultados.containsKey(codigoPartido)) {
                        System.out.println("No se encontró el código de partido ingresado.");
                        break;
                    }

                    System.out.print("Ingrese el ID de la tarjeta: ");
                    int idTarjeta = scannerResultados.nextInt();
                    scannerResultados.nextLine();

                    // LISTAR JUGADORES 
                    System.out.println("-------------------------");
                    System.out.println("LISTADO DE JUGADORES DEL PARTIDO: ");
                    for (String codJugadores : controladorResultado.jugadores.keySet()){
                        listarJugadores = controladorResultado.jugadores.get(codJugadores);
                        System.out.println("Codigo: " + codJugadores + " Nombre: " + listarJugadores.getNombre() );
                    }
                    System.out.print("Ingrese el Código del jugador que recibió la tarjeta: ");
                    int idJugador = scannerResultados.nextInt();
                    scannerResultados.nextLine();

                    System.out.println("Usted ha seleccionado el jugador: " + listarJugadores.getNombre());
                    /// fin SELECCION JUGADOR

                    System.out.print("Ingrese el tipo de tarjeta (amarilla/roja): ");
                    String tipoTarjeta = scannerResultados.nextLine();
                    System.out.print("Ingrese el minuto de la tarjeta: ");
                    int minutoTarjeta = scannerResultados.nextInt();
                    scannerResultados.nextLine();

                    Tarjeta tarjeta = new Tarjeta(idTarjeta, idJugador, Integer.parseInt(codigoPartido), tipoTarjeta, new Time(minutoTarjeta * 60 * 1000));
                    controladorResultado.tarjetas.add(tarjeta);

                    System.out.println("Tarjeta registrada exitosamente.");
                    break;

                case 4:

                    for (String codigoResultado1 : controladorResultado.resultados.keySet()) {
                        Resultado resultado = controladorResultado.resultados.get(codigoResultado1);
                        Partido partido = controladorResultado.partidos.get(String.valueOf(resultado.getPartido())); // DETALLES PARTIDO, NOMBRE EQUIPOS
                        System.out.println("-------------------------");
                        System.out.println("LISTA DE RESULTADOS:");
                        System.out.println("ID del resultado: " + resultado.getId());
                        System.out.println("ID del partido: " + resultado.getPartido());
                        System.out.println("Goles equipo local: " + resultado.getGolesEquipoLocal());
                        System.out.println("Goles equipo visitante: " + resultado.getGolesEquipoVisitante());
                        // INFO NOMBRE DE EQUIPOS
                        for (String codPartido : controladorResultado.partidos.keySet()) {
                            Partido p = controladorResultado.partidos.get(codPartido);
                            System.out.println("Equipo local: " + p.getEquipoLocal());
                            System.out.println("Equipo visitante: " + p.getEquipoVisitante());
                        }
                        // TARJETAS DEL PARTIDO
                        System.out.println("-------------------------");
                        System.out.println("TARJETAS:");
                        for (Tarjeta tarjetaL : controladorResultado.tarjetas) {
                            if (tarjetaL.getPartido() == resultado.getPartido()) {
                                System.out.println("Tarjeta ID: " + tarjetaL.getId());
                                System.out.println("Código del jugador: " + tarjetaL.getJugador());
                                System.out.println("Tipo de tarjeta: " + tarjetaL.getTipo());
                                System.out.println("Minuto: " + tarjetaL.getMinuto());
                            }
                        }
                        System.out.println("-------------------------");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
}
