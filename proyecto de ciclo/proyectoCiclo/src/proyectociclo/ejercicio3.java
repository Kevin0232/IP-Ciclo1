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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i,suma;
        double prom;
        suma=0;prom=0;
        
        int [] A = new int [10];
        
        System.out.println("Función que tome un vector de 10 posiciones y"
                + " devuelva su promedio real\n");
        for (i = 0; i <10; i++) {
            System.out.print("Ingrese el valor de A["+i+"]= ");
            A[i]=leer.nextInt();
        }
        System.out.println("\n Vector A: ");
        //Presentar matriz
        for(i=0; i<10; i++) {
            System.out.print(A[i] + "  ");            
        }
        System.out.println(" ");
        prom = pronFun(A,suma);
        System.out.println("El promedio real del vector es: "+prom);
    }
    public static double pronFun(int B[], double sum){
        double prom =0;
        for (int i = 0; i <10; i++) {
            sum = sum + B[i];
        }
        prom = sum/10;
        return prom;
    }
}
