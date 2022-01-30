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
public class ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        boolean cont;
        cont=true;
        n=0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n=leer.nextInt();
        int [][] A= new int [n][n];
        System.out.println("Ingresar datos de la mariz A");
        for(int i=0; i <n; i++){
            for(int j=0; j <n ; j++){
                System.out.print("A["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        cont = Simetrica(A,n);
        if(cont == true){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }

    }
    public static boolean Simetrica(int B[][],int m){
        boolean sim;
        sim=true;
        System.out.println("----------");
        for(int i=0; i <m; i++){
            for(int j=0; j <m ; j++){
                if(B[i][j] != B[j][i]){
                    sim = false;
                    i=m;
                    break;
                }
            }
        }
        return sim;
    }
}
