package com.finalbetplay.views;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.finalbetplay.clases.Partido;
import com.finalbetplay.utils.ConsoleUtils;

public class viewCalendarioPartidos {

    public void startCalendarioPartidos(){

        ConsoleUtils.cleanScreen();

        Scanner scannerCalendiaronPartidos = new Scanner(System.in);

        while (true) {
            
            System.out.println("1. Ver calendario de partidos: ");
            System.out.println("2. Salir");

            int choice = scannerCalendiaronPartidos.nextInt();
            scannerCalendiaronPartidos.nextLine();

            switch (choice) {

                case 1:

                    ConsoleUtils.cleanScreen();

                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                    Partido partidosConsulta = new Partido();

                    Date date = null;
                    Date date2 = null;

                    System.out.println("Digite la fecha de inicio del rango que desea consultar (Formato DD/MM/AAAA):  ");

                    String fechaPartidoInicio = scannerCalendiaronPartidos.nextLine();

                    try {
                        date = dateFormat.parse(fechaPartidoInicio);

                        System.out.println("la primera fecha: " + date);
                    }catch (ParseException e) {
                    e.printStackTrace();
                    }


                    System.out.println("Digite la fecha de fin del rango que desea consultar (Formato DD/MM/AAAA): ");

                    String fechaPartidoFin = scannerCalendiaronPartidos.nextLine();

                    try {
                        date2 = dateFormat.parse(fechaPartidoFin);

                        System.out.println("la segunda fecha: " + date2);
                    }catch (ParseException e) {
                    e.printStackTrace();
                    }

                    System.out.println("-----------------");

                    System.out.println("Los partidos que se encuentran entre la fecha " + fechaPartidoInicio + " y la fecha " + fechaPartidoFin);

                    if(partidosConsulta.getFecha() >= date || partidosConsulta.getFecha() <= date1){
                        
                    }
                    
                    ConsoleUtils.pause();
                    break;

                case 2: 

                    ConsoleUtils.pause();
                    return;
                    
                default:

                    scannerCalendiaronPartidos.close();

                    break;
            }
        

        }

    }

}
