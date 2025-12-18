/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int[][] edadesMatriz = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        String[] nombresFamilias = {"Familia 1", "Familia 2", "Familia 3"};
        int[] adultosPorFamilia = new int[3];
        int totalMenores = 0;

        for (int i = 0; i < edadesMatriz.length; i++) {
            int contadorAdultos = 0;
            for (int j = 0; j < edadesMatriz[i].length; j++) {

                if (edadesMatriz[i][j] < 18) {
                    totalMenores++;
                } else {
                    contadorAdultos++;
                }
            }
            adultosPorFamilia[i] = contadorAdultos;
        }
        System.out.println(" REPORTE DE EDADES ");
        System.out.println("Total de menores de edad en el sistema: "
                + totalMenores);

        for (int i = 0; i < nombresFamilias.length; i++) {
            System.out.println(nombresFamilias[i] + " tiene: "
                    + adultosPorFamilia[i] + " adultos.");
        }
    }
}
