package com.finalbetplay.views;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Entrada;
import com.finalbetplay.utils.ConsoleUtils;

public class viewEntradas {

    public static Controller controladorEntradas;

    public void startEntradas(){

        Scanner scannerEntradas = new Scanner(System.in);

        while (true) {

            ConsoleUtils.cleanScreen();

            System.out.println("\n-----MENÚ GESTION ENTRADAS-----\n");

            System.out.println("1. Comprar Entrada");
            System.out.println("2. Listar Boletas");
            System.out.println("3. Salir al menú principal \n ");

            System.out.println("Elige una opción: ");
            int choice = scannerEntradas.nextInt();
            scannerEntradas.nextLine();

            switch (choice) {
                case 1:
                    
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String codigoEntradas = null;
                    Entrada entradas = new Entrada();

                    System.out.println("Cuál es el código de la entrada: ");
                    codigoEntradas = scannerEntradas.nextLine();

                    System.out.println("Id Entrada: ");
                    entradas.setId(scannerEntradas.nextInt());
                    scannerEntradas.nextLine();

                    System.out.println("Fecha Compra: ");
                    String fechaCompraStr = scannerEntradas.nextLine();

                    try {
                        Date fechaCompra = new Date(dateFormat.parse(fechaCompraStr).getTime());
                        entradas.setFechaCompra(fechaCompra);
                    } catch (ParseException e) {
                        System.out.println("Fecha inválida. Por favor, use el formato yyyy-MM-dd.");
                    }

                    System.out.println("Cuántas entradas comprarás: ");
                    entradas.setCantidad(scannerEntradas.nextInt());
                    scannerEntradas.nextLine();

                    System.out.println("Cuál es el precio total de la compra: ");
                    entradas.setPrecioTotal(scannerEntradas.nextDouble());
                    scannerEntradas.nextLine();

                    
                    System.out.println("1. ORIENTE");
                    System.out.println("2. OCCIDENTE");
                    System.out.println("3. NORTE");
                    System.out.println("4. SUR");
                    
                    System.out.println("En qué ubicación la deseas: ");
                    int choiceUbicacion = scannerEntradas.nextInt();

                    switch (choiceUbicacion) {
                        case 1:
                            
                            entradas.setUbicacion("ORIENTE");

                            break;

                        case 2:

                            entradas.setUbicacion("OCCIDENTE");
                    
                            break;

                        case 3:

                            entradas.setUbicacion("NORTE");

                            break;

                        case 4:

                            entradas.setUbicacion("SUR");

                            break;

                        default:
                            break;
                    }

                    controladorEntradas.entradas.put(codigoEntradas, entradas);
                    

                    break;
            
                case 2:

                    Entrada entradaListar = new Entrada();

                    for (String codEntradas : controladorEntradas.entradas.keySet()) {
                        entradaListar = controladorEntradas.entradas.get(codEntradas);
                        System.out.println("Codigo Entrada: " + codEntradas +  " Ubicación : " + entradaListar.getUbicacion() );

                    }

                    break;

                case 3:

                    return;

                default:
                    break;
            }

        }

    }

}
