/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evabimestral1;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class multiplos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer  dos  números  enteros  y  mostrar  todos  los  múltiplos  de  3
        //comprendidos  entre  el menor y el mayor de los número ingresados.
        System.out.println("Programa para mostrar los múltiplos comprendidos entre dos número ingresados.");
        int num, num1, mult;
        num = 0; num1 = 0; mult=0;
        System.out.print("Ingrese el primer número: ");
        num = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num1 = leer.nextInt();
        
        while(num1<=num){
            if(num1%3 == 0){
                System.out.println(num1);
            }
                       
            num1 = num1+1;
        }
        
        
    }
}
