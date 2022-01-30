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
public class ascendente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // variables
        int i,n, j, aux;
        aux = 0; n =0;
        // Pedir el limite del vector
        System.out.println("--ORDENAR VECTOR DE N ELEMENTOS ----");
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        // Declarar vector
        int[] A = new int[n];
        // Ingresar datos en el vector
        System.out.println("Ingrese los elementos del vector");
       for(i=0;i<n;i++){
           System.out.print("A[" +i+ "]: ");
           A[i] = leer.nextInt();
           
           
       }
       // Presentar vector original
        System.out.println("---Vector original-----");
       for(i=0; i<n; i++){
           System.out.println("A[" +i+ "]: " +A[i]);
       }
       //ordenar el vector ascendente
       for(i=0; i<n; i++){
           for(j=i+1; j<n ;j++){
               if(A[i]>A[j]){
                   aux = A[i];
                   A[i] = A[j];
                   A[j] = aux;

               }
           }
       }
       // Presentar el vector ordenado
        System.out.println("--VECTOR ORDENADO ASCENDENTE---");
       for(i=0; i<n; i++){
           System.out.println("A[" +i+ "]: " +A[i]);
       }
       //ordenar el vector descendente
       for(i=0; i<n; i++){
           for(j=i+1; j<n ;j++){
               if(A[i]<A[j]){
                   aux = A[i];
                   A[i] = A[j];
                   A[j] = aux;

               }
           }
       }
       // Presentar el vector ordenado
        System.out.println("--VECTOR ORDENADO DESCENDENTE---");
       for(i=0; i<n; i++){
           System.out.println("A[" +i+ "]: " +A[i]);
       }
       
    }
    
    
}
