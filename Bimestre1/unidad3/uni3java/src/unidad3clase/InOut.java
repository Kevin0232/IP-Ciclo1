/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3clase;

/**
 *
 * @author kevin
 */
public class InOut {
    public static void main(String[] args) {
        String nombre = "Maria";
        int edad = 37;
        double estatura = 1.64;
        String empresa = "UTPL";
        
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("La estatura es: " + estatura);
        System.out.println("Trabaja en: " + empresa);
        
        System.out.print("--System.out.print--");
        System.out.print("Mi nombre es: " + nombre);
        System.out.print("La edad es: " + edad);
        System.out.print("La estatura es: " + estatura);
        System.out.print("Trabaja en: " + empresa);
        
        
        System.out.println("--System.out.printf--");
        System.out.printf("Mi nombre es %s, tengo %d anios, mido %f y trabajo en la %s", nombre, edad, estatura, empresa);
        
    }
    
}
