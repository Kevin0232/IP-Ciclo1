/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3p;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class diagonalprincipal {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,m, j,i;
        m=0; n=0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        int[][] A = new int [n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("ELEMENTOS ENCIMA DE LA DIAGONAL REEMPLAZADOS");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                if(i<j){
                    A[i][j] = 0;
                }
                
            }
            
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        } 
    }
}
