/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectociclo;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ProyectoCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, i;
        n=0; i=0;
        /*Leer n números enteros, almacenarlos en 
        un vector y determinar cuáles son los 
        números múltiplos de 5 y en qué posiciones están.*/
        System.out.println("Programa para identificar los multiplos de 5 "
                + "y determinar las posición de estos dentro de un vector.");
        System.out.print("\nIngrese el tamaño del vector: ");
        n = leer.nextInt();
        
        int[] A = new int[n];
        
        for (i = 0; i < n; i++) {
            System.out.print("A [" + i + "] = ");
            A[i] = leer.nextInt();
        }
        System.out.println("Vector A =");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] +"  ");
        }
        System.out.println(" ");
        // Descrubrir multiplos de 5
        for (i = 0; i < n; i++) {
            if(A[i]%5 ==0){
                System.out.println("El número "+ A[i] + " es múltiplo de 5 y "
                        + "está en la posición A["+i+"].");
            }
        }
        
    }
    
}
