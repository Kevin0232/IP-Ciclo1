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
public class ejerMatriz3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
       n = 0; i = 0 ; j = 0;
       
        System.out.println("---OPREACIONS SOBRE MATRICES CUADRADAS");
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        int[][]  A= new int[n][n];
        
        //Ingresar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz A: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz Original");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
                
            }
            System.out.println("");
        }
        System.out.println("\n Cambiar con 0 la diagonal principal");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                if(i==j){
                    A[i][j] = 0;
                }
                
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j]+ "  ");
                
            }
            System.out.println("");
        }
        System.out.println("\n Cambiar con 0 la diagonal Secundaria");
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                if((i + j)== (n-1)){
                    A[i][j] = 1;
                }
                
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j]+ "  ");
                
            }
            System.out.println("");
        }
        System.out.println("\n Cambiar Esquinas");
        A[0][0] = 99;
        A[0][n-1] = 99;
        A[n-1][0] = 99;
        A[n-1][n-1] = 99;
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j]+ "  ");
                
            }
            System.out.println("");
        }
    }
}
