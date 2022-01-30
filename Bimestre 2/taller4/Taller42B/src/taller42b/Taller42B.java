/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller42b;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Taller42B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Cálculo de los cuadrados de V");
        int n,i;
        int [] V= new int [50];
        int [] C= new int [50];
        System.out.print("Ingresar el valor de n: ");   
        n = leer.nextInt();
        for (i = 0; i <n ; i++) {
            System.out.print("ingrese el valor de V["+i+"]= ");
            V[i] = leer.nextInt();
        }
        //Llamado de la función que calcula los cuadrados de los números
        for (i = 0; i <n ; i++) {
            C[i] = Cuadrado_Suc(V [i]);
        }
        // Impresión de los cuadrados sucesivos contenidos en el vector C
        i=0;
        while(i<n){
            System.out.println("El número contenido en la posición "+ i+ " del vector");
            System.out.println(V [i]+ " tiene cuadrado "+C[i]);
            i=i+1;
        }
    }
    public static int Cuadrado_Suc(int m){
        int r,j;
        j=m; r=0;
        do{
            r= r+m;
            j=j-1;
        }while(j!=0);
        return r;
    }
}
