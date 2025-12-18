/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];

        System.out.println(" Ingreso de datos para la Matriz X (3x3) ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("X[" + i + "][" + j + "]: ");
                matrizX[i][j] = sc.nextDouble();
                double x = matrizX[i][j];
                matrizA[i][j] = (x + 1) * (x + 1);
                matrizB[i][j] = (x * x) + (2 * x) + 1;
            }
        }
        boolean identidadCumplida = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    identidadCumplida = false;
                    break;
                }
            }
        }
        System.out.println("\n RESULTADO DE LA IDENTIDAD ");
        if (identidadCumplida) {
            System.out.println("La identidad algebraica se cumple.");
        } else {
            System.out.println("La identidad algebraica NO se cumple.");
        }
    }
}


    