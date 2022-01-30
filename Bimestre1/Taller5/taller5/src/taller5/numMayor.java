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
public class numMayor {
    public static void main(String[] args) {
        //creación e inicialización de variable
        Scanner leer = new Scanner(System.in);
        double a, b, c;
        a=0; b=0; c=0;
        //Ingresar datos
        System.out.println("--Programa para identificar el mayor de 3 números--");
        System.out.print("Ingrese el primer número: ");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = leer.nextInt();
        System.out.print("Ingrese el tercer número: ");
        c = leer.nextInt();
        
        //proceso
        if((a>b)&&(a>c)){
            System.out.println("El número mayor es: " +a+"\n");
        }
        else{
            if(b>c){
                System.out.println("El número mayor es: " + b +"\n");
            }
            else{
                System.out.println("El número mayor es: " +c + "\n");
            }
            
        }
    }
}
