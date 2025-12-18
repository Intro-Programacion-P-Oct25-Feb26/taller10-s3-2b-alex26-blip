/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double[][] original = new double[5][6];
        double[][] resultante = new double[5][6];
        double escalar;

        System.out.print("Ingrese el número (entero o real) para multiplicar la matriz: ");
        escalar = sc.nextDouble();

        System.out.println(" Ingreso de datos para la matriz (5x6) ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                original[i][j] = sc.nextDouble();
                resultante[i][j] = original[i][j] * escalar;
            }
        }
        System.out.println("\n MATRIZ ORIGINAL ");
        imprimirMatriz(original);

        System.out.println("\n MATRIZ RESULTANTE (Multiplicada por " + escalar + ") ");
        imprimirMatriz(resultante);
    }
    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}






// revisiones 