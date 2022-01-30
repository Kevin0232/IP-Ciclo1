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
public class sumaMatriz {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,m,i,j;
        m=0; n=0;
        System.out.print("Ingrese el tamaño en filas de la matriz A y B: ");
        n = leer.nextInt();
        
        System.out.print("Ingrese el tamaño en columnas de la matriz A y B: ");
        m = leer.nextInt();
        
        
        int[][] A = new int [n][m];
        int[][] B = new int [n][m];
        int[][] C = new int [n][m];
        
        // Ingresar vector A
        System.out.println("\nINGRESAR DATOS DEL VECTOR A");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        //Ingresar vector B
        System.out.println("INGRESAR DATOS DEL VECTOR B");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("B ["+i+"] ["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("VECTOR A");
        //presentar vector A
        for(i=0; i<n; i++) {
            for(j=0; j<m ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("VECTOR B");
        // Presentar vector B
        for(i = 0; i < n; i++) {
            for(j = 0;j < m ; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("VECTOR C");
        //Vector C
        
        for(i=0;i<(n);i++){
            for(j=0;j<(m);j++){
                C[i][j]=((A[i][j])+(B[i][j]));
            }    
        }
        // Presentar vector C
        for (i = 0; i < n; i++) {
            for (j = 0; j < m ; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
    }
}
