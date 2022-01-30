/*n
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, i;
        double suma, promedio, mayor;
        suma = 0; promedio = 0; mayor=0;
        
        System.out.print("Ingrese el número de notas a promediar: ");
        n = leer.nextInt();
        // Ingresa la notas al vector
        double[] Notas = new double [n];
        String[] Nombre = new String [n];
        for(i=0; i<n; i++){
            
            System.out.print("Ingrese el nombre " + i +": ");
            Nombre[i] = leer.next();
            
        
            System.out.print("Ingrese la nota " +i + ": " );
            Notas[i] = leer.nextDouble();
            
        }
        // Calcular las sumas de las notas
        for(i=0; i<n; i++){
            suma = suma + Notas[i];
            
        }
        // Promedio de notas ingresadas
        promedio = suma / (n-1);
        
        // Presentar los elementos del vector nota
        System.out.println("Las notas son:");
        for(i=0; i<n; i++){
            System.out.println("Notas [" +i +" ]= " +Notas[i]);
            
        }
        System.out.println("\n");
        System.out.println("El promedio de notas es: " + promedio);
        
        // Obtener la nota mas alta
        mayor = Notas[0];
        for(i=1;i<n;i++){
            if(Notas[i]>mayor){
                mayor = Notas[i];
            }
            System.out.println("----"+mayor);    
        }
        System.out.println("--Nota mayor = " + mayor);
        
        // Impar
        System.out.println("----Las notas de las posiciones impares son: ");
        for(i=0;i<n;i++){
            if(i%2 !=0){
                System.out.println("Notas [" +i +"] = " +Notas[i]);
            }
          
        }
        System.out.println("\n NOTAS Y NOMBRES DE ESTUDIANTES");
        for(i=0; i<n; i++){
            System.out.println(Nombre[i]+ " tiene una nota de " +Notas[i] );
        }
        


        
    }
    
}
