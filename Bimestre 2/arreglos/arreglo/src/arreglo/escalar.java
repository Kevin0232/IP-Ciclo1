/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class escalar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // variables
        int i,n, escalar;
        escalar = 0;
        // Vectores
        System.out.print("Ingrese el limite del vector: ");
        n = leer.nextInt();
        System.out.print("Ingrese el escalar a multiplicar: ");
        escalar = leer.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
       for(i=0;i<n;i++){
           System.out.println("Ingrese el numero del vector A[" +i+ "]: ");
           A[i] = leer.nextInt();
           
       }
       for(i=0;i<n;i++){
           B[i] = A[i] * escalar;
       
       }
        System.out.println("------------------------");
       for(i=0;i<n;i++){
           System.out.println("El vector A[" + i + "] es: " +A[i]);
       }
        System.out.println("------------------------");
       for(i=0;i<n;i++){
           System.out.println("El vector B[" + i + "] es: " +B[i]);
       }
        
    }
    
}
