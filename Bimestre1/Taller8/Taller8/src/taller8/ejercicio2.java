/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Programa para aceptar una nota");
        //solicitar una calificación de forma continua, en tanto se produzca una calificación invalida <0 o >100
        //inicialización de variables
        Scanner leer = new Scanner(System.in);
        int num;
         num=0;
        //proceso
        do{
           
            System.out.print("Ingrese una calificaión: ");
            num= leer.nextInt();
            if((num>0)&&(num<100)){
                System.out.println("Nota aceptada");
            }
            else{
                System.out.println("Nota no aceptada");
                System.out.println("**FIN DEL PROGRAMA***");
            }
            
        }while((num>0)&&(num<100));
                
    }
    
}
