/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Programa para calcular el área de un poligono compueston\n");
        //declarar e inicializar las variables
        double lc, at, ar, A, B, D;
        double ats, area;
        lc=0; at=0; ar=0; A=0; B=0; D=0; ats=0; area=0;
        //ingresar los datos
        System.out.println("Ingrese el lado del cuadrado");
        lc = leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        at= leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        ar= leer.nextDouble();
        
        //Proceso
        A = Math.pow(lc,2);
        B = (lc*at)/2;
        ats = B*3;
        D = lc * ar;
        area = (A+B+ats);
        
        //salida
        System.out.println("El resultado del poligono es: " + area + 
                " Con un cuadrado de area " + A + " y 3 rectangulos de area " + ats + 
                " Y un rectangulo de área " + D + "\n");
    }
    
}
