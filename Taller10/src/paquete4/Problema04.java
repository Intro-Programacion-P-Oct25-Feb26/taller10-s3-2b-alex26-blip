/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {
    
     public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);

        double[][] matrizA = new double[3][2];
        double[][] matrizB = new double[3][2];

        System.out.println(" Ingreso Matriz A (3x2) ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\n Ingreso Matriz B (3x2) ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nMATRIZ A:");
        imprimirMatriz(matrizA);
        System.out.println("\nMATRIZ B:");
        imprimirMatriz(matrizB);
        boolean todasMayorIgual = true;
        boolean alMenosUnaEstricta = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (!(matrizA[i][j] >= matrizB[i][j])) {
                    todasMayorIgual = false;
                }
                if (matrizA[i][j] > matrizB[i][j]) {
                    alMenosUnaEstricta = true;
                }
            }
        }
        System.out.println("\n RESULTADO DE LA COMPARACIÓN ");
        if (todasMayorIgual && alMenosUnaEstricta) {
            System.out.println("La matriz A es mayor que la matriz B");
        } else {
            System.out.println("La matriz A no es mayor que la matriz B");
        }
    }
    public static void imprimirMatriz(double[][] m) {
        for (double[] fila : m) {
            for (double valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
       
       
       
       
     
     

