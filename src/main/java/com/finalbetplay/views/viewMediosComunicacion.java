package com.finalbetplay.views;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.MedioComunicacion;
import com.finalbetplay.clases.Rol;
import com.finalbetplay.clases.Usuario;
import com.finalbetplay.utils.ConsoleUtils;

public class viewMediosComunicacion {
    public static Controller controladorMediosComunicacion;

    public void startMediosComunicaciones(){
        Scanner scannerMediosComunicaciones = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    

    while (true) {

        ConsoleUtils.cleanScreen();

        System.out.println("\n-----MENÚ GESTION MEDIOS DE COMUNICACION-----\n");

        System.out.println("1. Agregar nuevo medio de comunicacion");
        System.out.println("2. Editar medio de comunicacion");
        System.out.println("3. Eliminar medio de comunicacion");
        System.out.println("4. Mostrar medios de comunicacion");
        System.out.println("5. Salir al menú principal \n ");

        System.out.println("Selecciona la opción deseada: ");
        int choice = scannerMediosComunicaciones.nextInt();
        scannerMediosComunicaciones.nextLine();

            switch (choice) {
            case 1:

               
                MedioComunicacion medioPeriodista = new MedioComunicacion();

                ConsoleUtils.cleanScreen();
                MedioComunicacion medioscomunicaciones = new MedioComunicacion();
                System.out.println("Ingrese el código del medio de comunicacion: ");
                String codigoMedioComunicacion = scannerMediosComunicaciones.nextLine();
                System.out.println("Ingrese el ID del medio de comunicacion: ");
                medioscomunicaciones.setId(scannerMediosComunicaciones.nextInt());
                scannerMediosComunicaciones.nextLine();
                System.out.println("Ingrese el nombre del medio de comunicacion: ");
                medioscomunicaciones.setNombre(scannerMediosComunicaciones.nextLine());
                System.out.println("Ingrese el tipo de medio de comunicacion: ");
                medioscomunicaciones.setTipo(scannerMediosComunicaciones.nextLine());

                // Usuario usuarioPeriodista = new Usuario();
                // String codigoPeriodistaMedio = null;
                // System.out.println("LISTA PERIODISTAS");
                // for (String codPeriodistas : controladorMediosComunicacion.usuarios.keySet()) {
                //     usuarioPeriodista = controladorMediosComunicacion.usuarios.get(codPeriodistas);
                //     if (usuarioPeriodista.getRol() == "Periodista") {
                //         System.out.println("Cod Periodista: " + codPeriodistas + " Nombre Periodista: " + rolPeriodista.getNombre());
                //     }else{
                //         System.out.println("No hay Periodistaes :cx");
                //     }
                // }

                // System.out.println("Cuál periodista estará en su medio: ");
                // codigoPeriodistaMedio = scannerMediosComunicaciones.nextLine();

                // rolPeriodista = controladorMediosComunicacion.rols.get(codigoPeriodistaMedio);

                // medioPeriodista.setListaPeriodistas(null);

                // controladorMediosComunicacion.medioscomunicaciones.put(codigoMedioComunicacion, medioscomunicaciones);
                // System.out.println("Patrocinador agregado exitosamente.");

                ConsoleUtils.pause();

                break;

                

                


            }}
    
}
}