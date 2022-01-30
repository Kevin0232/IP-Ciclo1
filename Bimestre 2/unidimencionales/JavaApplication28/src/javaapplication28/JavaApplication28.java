/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        // Declarar e inicializar las variables
        int i, n;        
        i=0; n=5;
        
        // Declaramos los vectores
        int [] A = new int [n];
        int [] B = new int [n];
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento A["+i+"]: ");
            A[i] = leer.nextInt();
        }
        
        for (i=0;i<n;i++) {
            System.out.print("Ingrese el elemento B["+i+"]: ");
            B[i] = leer.nextInt();
        }
        
        // Comparar ambos vectores
        
        for (i=0;i<n;i++) {
            if (A[i] == B[i]) {
                System.out.println("El vector A y B en la posición "+i+" tienen el mismo número ("+A[i]+")");
            }
            else {
                System.out.println("El vector A["+i+"]"+" y el vector B ["+i+"] no tienen el mismo número.");
                System.out.println("A = "+A[i]+" y B = "+B[i]);
            }
        }        
    }
    
}
