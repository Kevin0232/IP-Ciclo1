/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdatosjava;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class AreaPoligono {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        
        double A;
        double B;
        double C;
        double alTriag;
        double areaT, areaR;
        double areaTotal;
        String nombre;
        
        System.out.println("**Programa para calcular el área de un poligono***");
        System.out.println("Ingrese el nombre de usuario: ");
        nombre = leer.next();
        
        //ingrese datos
        System.out.println("ingresa altura del terreno(A)");
        A = leer.nextDouble();
        System.out.println(A);
        
        System.out.println("Ingresa la base del terreno (B)");
        B = leer.nextDouble();
        
        System.out.println("Ingresa la altura del rectangulo del terreno (C)");
        C= leer.nextDouble();
        
        
        //Proceso
        alTriag = A - C;
        areaT = (B * alTriag)/2;
        areaR = B * C;
        areaTotal = areaT + areaR;
        
        System.out.println("El área del terreno es:" +areaT + "\n");
        System.out.println("El área del rectangulo del terreno es: " + areaR + "\n");
        System.out.println("El área Total del terreno es: " + areaTotal + "\n");
        
        
    }
    
}
