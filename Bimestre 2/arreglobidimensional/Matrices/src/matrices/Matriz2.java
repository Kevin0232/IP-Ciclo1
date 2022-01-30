/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Matriz2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("--EJERCICIOS CON MATRICES---");
        int n, m, i, j, suma;
        n=0; m=0; i=0; j=0; suma = 0;
        //ingresar e; tamaño de la matriz 
        System.out.print("Ingrese el número de filas: ");
        n = leer.nextInt();
        System.out.print("Ingrese el número de comlunas: ");
        m = leer.nextInt();
        
       int[][] A = new int [n][m];
        //Ingresar elementos de la Matriz
       for(i=0; i<n ; i++){
           for(j=0; j<m; j++){
               System.out.print("A[" + i + "][" + j + "] = ");
               A[i][j] = leer.nextInt();
               
           }
       }
        System.out.println("\n La matriz A es:");
        for(i=0; i<n ; i++){
           for(j=0; j<m; j++){
               System.out.print(A[i][j] + "  ");
               
                             
           }
        System.out.println("");
       }
        int[] B = new int[n];
        
        for (i = 0; i <n; i++) {
            for (j = 0; j <m; j++) {
                suma = suma + A[i][j];
                
                
            }
            B[i] = suma;
            suma=0;
        }
        System.out.println("El Vector B es: ");
        for (i = 0; i <n; i++) {
            
            System.out.print(B[i] +  "   ");
                
                
            
            
        }
        
        
    }
    
}
