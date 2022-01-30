/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class PosNeg {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creación e identificación de variables
        double a;
        a=0;
        //ingresar datos
        System.out.println("Programa para identificar si un número es positivo o negativo ");
        System.out.print("Ingrese un numero: ");
        a = leer.nextDouble();
        //proceso
        if(a==0){
            
            System.out.println("El 0 es numero neutro");
        }
        else{
            if(a>0){
                System.out.println("El número " +a +" es positivo.\n" );
            }
            else{
                System.out.println("El número " +a +" es negativo.\n" );
            }
             
        }
    }
}
