/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproc;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class fun6_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n =0;
        int num = 0;
        int cont =0;
        System.out.println("Funcion que permita encontrar cuantas veces se repite un número "
                + "en un vector ");
        
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        int[] A = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Ingrese el elemento A["+i+"]= ");
            A[i]= leer.nextInt();
        }
        System.out.println("Ingrese el elemento a buscar en el vector");
        num = leer.nextInt();
        
        cont = BuscarVector(A,num,n);
        
        System.out.println("El número "+num + " se ha encontrado "+ cont + " veces"
                + " en el vector.");
        for (int i = 0; i <n; i++) {
            System.out.println(A[i]);
        }
    }
    public static int BuscarVector(int[]B, int num, int n ){
        int cont = 0;
        for (int i = 0; i <n; i++) {
            if(B[i] == num){
                cont = cont + 1;
            }
        }
        return cont;
    }
}
