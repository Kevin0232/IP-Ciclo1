/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para obtener el factorial de un número");
        //inicialización de variables
        int num, i, fact;
        num=0; i=1; fact=1;
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        while(num>=i){
            System.out.println(num);
            fact = fact * num;
            
            num = num-1;
            
            
        }
        System.out.println("El factorial del número ingresado es: " + fact);
    }
    
}
