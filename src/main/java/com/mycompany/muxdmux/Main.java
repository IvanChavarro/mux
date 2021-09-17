/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muxdmux;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte estaciones;
        String datos[];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de estaciones");
        estaciones = entrada.nextByte();
        datos = new String[estaciones];
        //guardando datos en el vector dinamico
        for (byte i = 0; i < estaciones; i++) {
            System.out.println("Ingrese los datos que enviará a la estación " + (i + 1));
            datos[i] = entrada.next();
        }
        Mux multiplexor = new Mux(datos);
        
    }

}
