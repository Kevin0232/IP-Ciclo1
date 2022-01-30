/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Programa que presenta la serie Fibonacci");
        Scanner leer = new Scanner(System.in);
        //inicialización y creación de variables
        int num1,num2, i, n;
        num1=1; num2=0; i=1; n=0;
        System.out.print("Ingrese el limite de la serie: ");
        n = leer.nextInt();
        
        while(i<=n){
            
            System.out.println(num1);
            num1= num2 +num1;
            num2 = num1 - num2; 
            i=i+1;
            
            
        }
        
    }
    
}
