/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectociclo;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i,suma,n;
        suma=0;n=0;
        System.out.println("Programa que calcule la suma de"
                + " los elementos de la diagonal principal.\n");
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        int [][] A = new int [n][n];
        
        for (i = 0; i <n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Ingrese el valor de A["+i+"]["+j+"]= ");
                A[i][j]=leer.nextInt();
                
            }
        }
        //Presentar matriz
        for(i=0; i<n; i++) {
            for(j=0; j<n ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        // Sumar los elementos de la diagonal principal
        
        for(i=0; i<n; i++) {
            for(j=0; j<n ; j++) {
                if(i==j){
                    suma = suma + A[i][j];
                }
            }
        }
        System.out.println("La suma total de los elementos de la diagonal "
                + "principal es: "+suma);
    
    }
}
