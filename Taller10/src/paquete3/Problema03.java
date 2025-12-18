/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);

        boolean[][] Sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};
        
        String[] nombresZonas = {"Zona 1", "Zona 2", "Zona 3", "Zona 4"};
        
        int[] fallosPorZona = new int[4];
        int zonasSinFallosTotal = 0;

        System.out.println(" Reporte de Seguridad");

        for (int i = 0; i < Sensores.length; i++) {
            int contadorFalsos = 0;
            boolean tieneFallo = false;

            for (int j = 0; j < Sensores[i].length; j++) {
                if (Sensores[i][j] == false) {
                    contadorFalsos++;
                    tieneFallo = true;;
                }
            }
            fallosPorZona[i] = contadorFalsos;
            if (!tieneFallo) {
                zonasSinFallosTotal++;
                System.out.println(nombresZonas[i] + ": Funcionamiento Correcto");
            } else {
                System.out.println(nombresZonas[i] + ": Presneta " + 
                        fallosPorZona[i] + " Fallos");
            }
        }
        System.out.println("Total de zonas operando sin error: " + 
                zonasSinFallosTotal);
    }
}