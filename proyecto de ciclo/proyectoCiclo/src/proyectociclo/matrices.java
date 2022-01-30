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
public class matrices {
    public static void main(String[] args) {
        /*Leer dos matrices 5x5 enteras y determinar 
        si el promedio entero de los números 
        menores por cada fila de una matriz 
        corresponde a alguno de los datos 
        almacenados en las “esquinas” de la otra 
        matriz.*/
        Scanner leer = new Scanner(System.in);
        int menor,suma,i,j, promedio;
        menor=0;suma=0;promedio=0;
        
        
        int[][] A = new int [5][5];
        int[][] B = new int [5][5];      
        // Ingresar vector A
        System.out.println("\nINGRESAR DATOS DEL MATRIZ A");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        //Ingresar vector B
        System.out.println("INGRESAR DATOS DEL MATRIZ B");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("B ["+i+"] ["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("MATRIZ A");
        //presentar vector A
        for(i=0; i<5; i++) {
            for(j=0; j<5 ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("MATRIZ B");
        // Presentar vector B
        for(i = 0; i < 5; i++) {
            for(j = 0;j < 5 ; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("--------------------------------");
        System.out.println("Menores en matriz A");
        // DETECTAR EL MENOR DE CADA FILA EN MATRIZ A
        for (i = 0; i < 5; i++) {
            menor = A[i][0];
            for(j = 0;j < 5 ; j++) {
                if(menor > A[i][j] ){
                    menor = A[i][j];
                }
            }
            suma = suma + menor;
        }
        System.out.println("SUMA DE MENORES "+suma);
        
        promedio = (suma/5);
        System.out.println(promedio);
        
        if(promedio == B[0][0] ){
            System.out.println("El promedio de las filas de la matriz A"
                    + " es igual a la esquina en la poscición B[0][0]");
        }
        if(promedio == B[0][4] ){
            System.out.println("El promedio de las filas de la matriz A"
                    + " es igual a la esquina en la poscición B[0][4]");
        }
        if(promedio == B[4][0] ){
            System.out.println("El promedio de las filas de la matriz A"
                    + " es igual a la esquina en la poscición B[4][0]");
        }
        if(promedio == B[4][4] ){
            System.out.println("El promedio de las filas de la matriz A"
                    + " es igual a la esquina en la poscición B[4][4]");
        }
            
        System.out.println("--------------------------------");
        suma=0;
        System.out.println("Menores en matriz B");
        // DETECTAR EL MENOR DE CADA FILA EN MATRIZ A
        for (i = 0; i < 5; i++) {
            menor = B[i][0];
            for(j = 0;j < 5 ; j++) {
                if(menor > B[i][j] ){
                    menor = B[i][j];
                }
            }
            suma = suma + menor;
        }
        System.out.println("SUMA DE MENORES "+suma);
        
        promedio = (suma/5);
        System.out.println(promedio);
        
        if(promedio == A[0][0] ){
            System.out.println("El promedio de las filas de la matriz B"
                    + " es igual a la esquina en la poscición A[0][0]");
        }
        if(promedio == A[0][4] ){
            System.out.println("El promedio de las filas de la matriz B"
                    + " es igual a la esquina en la poscición A[0][4]");
        }
        if(promedio == A[4][0] ){
            System.out.println("El promedio de las filas de la matriz B"
                    + " es igual a la esquina en la poscición A[4][0]");
        }
        if(promedio == A[4][4] ){
            System.out.println("El promedio de las filas de la matriz B"
                    + " es igual a la esquina en la poscición A[4][4]");
        }
            
    }
}
