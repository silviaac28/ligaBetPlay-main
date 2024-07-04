package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Arbitro;
import com.finalbetplay.utils.ConsoleUtils;

public class viewArbitro {

    public static Controller controladorArbitros;

    public void startArbitro(){

        Scanner scannerArbitro = new Scanner(System.in);

        while (true) {
        
            ConsoleUtils.cleanScreen();

            System.out.println("1. Agregar Arbitro");
            System.out.println("2. Listar Arbitro");
            System.out.println("3. Salir");

            int choice = scannerArbitro.nextInt();
            scannerArbitro.nextLine();

            switch (choice) {

                case 1:
                    
                    ConsoleUtils.cleanScreen();

                    Arbitro arbitroNuevo = new Arbitro();
                    String codigoArbitro = null;

                    System.out.println("Cuál es el código del arbitro: ");
                    codigoArbitro = scannerArbitro.nextLine();

                    System.out.println("Cuál es el id del arbitro: ");
                    arbitroNuevo.setId(scannerArbitro.nextInt());
                    scannerArbitro.nextLine();

                    System.out.println("Cuál es el nombre del arbitro: ");
                    arbitroNuevo.setNombre(scannerArbitro.nextLine());

                    System.out.println("CUál es la experiencia del arbitro: ");
                    arbitroNuevo.setExperiencia(scannerArbitro.nextInt());
                    scannerArbitro.nextLine();

                    controladorArbitros.arbitros.put(codigoArbitro, arbitroNuevo);

                    ConsoleUtils.pause();

                    break;

                case 2:

                    ConsoleUtils.cleanScreen();

                    Arbitro listarArbitros = new Arbitro();

                    for (String codArbitro : controladorArbitros.arbitros.keySet()) {
                        listarArbitros = controladorArbitros.arbitros.get(codArbitro);
                        System.out.println("El código del arbitro es: " + codArbitro);
                        System.out.println("El nombre del arbitro es: " + listarArbitros.getNombre());
                        System.out.println("La experiencia del arbitro es de: " + listarArbitros.getExperiencia() + " años");
                    }

                    ConsoleUtils.pause();

                    break;

                case 3:

                    return ;


                default:
                    throw new AssertionError();
            }

        }

    }

}
