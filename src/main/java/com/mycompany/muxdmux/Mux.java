/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muxdmux;

/**
 *
 * @author Karen
 */
public class Mux {

    String dato[];

    public Mux(String dato[]) {
        this.dato = dato;
        multiplexorPorDivisionDeTiempo();
    }

    public void multiplexorPorDivisionDeTiempo() {
        byte count = 0;
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < dato.length; j++) {
                if (dato[i].length() > dato[j].length()) {
                    count = (byte) dato[i].length();
                }
            }
        }
        String mux = "";
        for (int i = 0; i < dato.length; i++) {
            System.out.println(dato[i]);
        }
        dato = invertirManual(dato);
        int l = 0;
        for (int i = 0; i < count; i++) {
            int k = 0;

            for (int j = l; j < count; k++) {
                try {
                    mux += "[" + String.valueOf(dato[k].charAt(j)) + "]";
                } catch (StringIndexOutOfBoundsException e) {
                    mux += "[ ]";
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
            l++;
        }
        System.out.println(mux);
    }

    public static String[] invertirManual(String[] arreglo) {
        String temporal; // El elemento temporal del arreglo que vamos a intercambiar
        int longitudDeArreglo = arreglo.length;
        // Nota: al dividir entre 2, si es flotante, se pasa al entero anterior. P. ej.
        // 5 / 2 = 2
        for (int x = 0; x < longitudDeArreglo / 2; x++) {
            // Guardar el actual
            temporal = arreglo[x];
            // El índice de la otra mitad
            int indiceContrario = longitudDeArreglo - x - 1;
            // El valor actual es el valor contrario, el de la otra mitad
            arreglo[x] = arreglo[indiceContrario];
            // Y el de la otra mitad, es el que había en el actual originalmente
            arreglo[indiceContrario] = temporal;
        }
        // El arreglo ya está invertido internamente
        return arreglo;
    }

}
