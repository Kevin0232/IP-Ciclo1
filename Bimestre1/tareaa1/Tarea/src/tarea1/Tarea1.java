/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double tL;
        double cM;
        double cT;
        String nombre;
        
        System.out.println("**Reconocer el costo de la llamada***");
        System.out.println("Ingrese nombre de usuario");
        nombre = leer.next();
        
        // ingresar los datos
        
        System.out.println("Ingresa tiempo de la llamada(tL)");
        tL = leer.nextDouble();
        System.out.println(tL);
        
        System.out.println("Ingresa el costo por minuto de la llamada(cM)");
        cM = leer.nextDouble();
        System.out.println(cM);
        
        //proceso
        cT = tL * cM;
        
        System.out.println("EL costo total de la llamada es: " + cT + "\n");
    }
    
}
