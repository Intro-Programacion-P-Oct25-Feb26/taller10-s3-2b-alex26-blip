/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete0;

/**
 *
 * @author reroes
 */
public class Problema00 {
    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8}, 
                            {10, 5, 7, 9}, 
                            {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jose A", "Elena J", "Paúl L"};
        double[] sumaNotas = new double[3];
                            
        double suma = 0;
        String reporte = "";
        
        for (int i = 0; i < notas.length; i++) { 
            
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j];
                     
            }
            sumaNotas[i] = suma; // 
        }
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene una sumataria "
                    + "de notas: %.3f\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i]);
        }
        System.out.printf("%s\n", reporte);
        
    }
}
