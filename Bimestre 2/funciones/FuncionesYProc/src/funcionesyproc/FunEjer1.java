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
public class FunEjer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        boolean band;
        System.out.println("Funcion para verificar si un numero es positivo "
                + "o negativo");
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        
        band = funNegPos(num); // asigna el valor que devuelve la función
        if(band == true){
            System.out.println("El número " + num + " es positivo.\n");
        }
        else{
            System.out.println("El número " + num + " es negativo.\n");
        }
        System.out.println("*** Fin de la función 1 ***");
        
        //comprobar directamente con el llamado de la función
        if(funNegPos(num) == true){
            System.out.println("\nEl número " + num + " es positivo.\n");
        }
        else{
            System.out.println("El número " + num + " es negativo.\n");
        }
        System.out.println("*** Fin de la función 2 ***");
    }
    
    public static boolean funNegPos( int numero){
        if(numero > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
