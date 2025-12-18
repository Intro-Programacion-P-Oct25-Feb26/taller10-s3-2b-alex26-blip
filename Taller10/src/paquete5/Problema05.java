/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };
        String acumulador = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                
                String nombre = estudiantes[i][j];
                String inicial = nombre.substring(0, 1);

                switch (inicial) {
                    case "S":
                    case "P":
                    case "T":
                        acumulador += nombre + "\n";
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("Estudiantes que inician con S, P o T:");
        System.out.println(acumulador);
    }
}
