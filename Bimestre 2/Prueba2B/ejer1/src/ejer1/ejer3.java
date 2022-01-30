/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma,suma1;
        int prom1,prom2;
        prom1=0; prom2=0;suma=0;suma1=0;
        int [][] A= new int [5][5];
        int [][] B= new int [5][5];
        System.out.println("Ingresar datos de la mariz A");
        for(int i=0; i <5; i++){
            for(int j=0; j <5 ; j++){
                System.out.print("A["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        //matriz B
        System.out.println("\n-------------------\n");
        System.out.println("Ingresar datos de la matriz B");
        for(int i=0; i <5; i++){
            for(int j=0; j <5 ; j++){
                System.out.print("B["+i+"]["+j+"]= ");
                B[i][j] = leer.nextInt();
            }
        }
        //Presentar matrices
        System.out.println("------------------------");
        System.out.println("Matriz A");
        for(int i=0; i <5; i++){
            for(int j=0; j <5 ; j++){
                System.out.print(A[i][j] + "    ");
            }
            System.out.println("  ");
        }
        System.out.println("\n-------------------\n");
        System.out.println("Matriz B");
        for(int i=0; i <5; i++){
            for(int j=0; j <5 ; j++){
                System.out.print(A[i][j] + "    ");
            }
            System.out.println("  ");
        }
        //diagonal secundaria A
        
        for(int i=0; i < 5; i++){
            for(int j=0; j <5 ; j++){
                if((i+j)== (5-1)){
                        suma = suma + A[i][j];
                    }
            }
                
        }
        prom1 = suma/5;
        
        //diagonal secundaria B
        
            for(int i=0; i <5; i++){
                for(int j=0; j <5 ; j++){
                    if((i+j)== (5-1)){
                        suma1 = suma1 + B[i][j];
                    }
                }
                
            }
        prom2 = suma1/5;
        
        
        System.out.println("----------------------------");
        if (prom1 == prom2) {
            System.out.println("Ambas matrices tienen el mismo promedio"
                    + " en sus diagonales secundarias.");
            System.out.println("suma matriz A="+suma);
            System.out.println("promedio matriz A= "+prom1);
            System.out.println("suma matriz B="+suma1);
            System.out.println("promedio matriz B= "+prom2);
        }else{
            System.out.println("La matriz A y la Matriz B tienen"
                    + " diferentes promedios en sus diagonales secundarias.");
            System.out.println("suma matriz A="+suma);
            System.out.println("promedio matriz A= "+prom1);
            System.out.println("suma matriz B="+suma1);
            System.out.println("promedio matriz B= "+prom2);
        }
        
    }
}
