/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("--Programa para conocer si el resultado de una resta es multiplo de 2 numeros--");
        Scanner leer = new Scanner(System.in);
        //creación e inicialiación de variables
        int a, b, resta;
        a=0; b=0; resta=0;
        //entrada de datos
        System.out.println("El número mayor se restará con el menor");
        System.out.print("Ingrese el primer número: ");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = leer.nextInt();
       
        if(a>b){
            resta = a-b;
            System.out.println("El resultado de la resta es: " + resta + " .\n" );
        }
        else{
            
            resta= b -a;
            System.out.println("El resultado de la resta es: " + resta + " .\n" );
            
            
        }
        if ((a % resta ==0 ) || (b % resta ==0)){
            System.out.println("La diferencia es un divisor exacto de uno de los números.");
        
        }
        else {
            System.out.println("La diferencia no es un divisor exacto de ningún número");
        }
    }
}
