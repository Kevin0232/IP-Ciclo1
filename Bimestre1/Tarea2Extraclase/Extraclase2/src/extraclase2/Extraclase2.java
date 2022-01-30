/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraclase2;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Extraclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Desarrollar un programa que transforme una cantidad en metros y la convierta "
                + "a centímetros, kilómetros, pies y pulgadas.");
        Scanner leer = new Scanner(System.in);
        //Creación de variables
        double m, d , cm , km, ft, p ; 
        //inicialización de variables
        m=0;cm=0; km=0; ft=0; p=0 ; 
        
        //Entrada de datos
        System.out.println("Ingrese la cantidad en metros:");
        m = leer.nextDouble();
        //proceso
        cm = m*100;
        km = m/1000;
        ft = m*3.28084 ;
        p = m*39.3701 ;



//salida
        System.out.println("La cantidad transformada a centimetros es: " + cm);
        System.out.println("La cantidad transformada a kilometros es: " +km);
        System.out.println("La cantidad transformada a pies es: " + ft);
        System.out.println("La cantidad transformada a pulgadas es: " +p);
    }
    
}
