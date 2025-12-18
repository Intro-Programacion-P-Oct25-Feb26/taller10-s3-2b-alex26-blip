/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] diasAsistidos = new int[4];

        System.out.println("Reporte de Asistencia");

        for (int i = 0; i < asistencia.length; i++) {
            int contador = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j]) {
                    contador++;
                }
            }
            diasAsistidos[i] = contador;
            System.out.print(estudiantes[i] + ": " + diasAsistidos[i] + " días.");
            if (diasAsistidos[i] == 5){
            System.out.println("Asistencia completa");
        }else {
             System.out.println("Asistencia incompleta");
             }
        }   

    }
}
