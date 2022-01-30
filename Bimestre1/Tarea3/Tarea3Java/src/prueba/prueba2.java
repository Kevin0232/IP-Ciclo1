/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class prueba2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creación e inicialización de variables
        int a, b, resta;
        a=0; b=0; resta=0;
        //entrada de datos
        System.out.print("Ingrese el primer número: ");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = leer.nextInt();
        
        if((a % resta == 0)&&(b % resta == 0)){
            System.out.println("La diferencia "+resta +" es un divisor exacto de "+a+" y de "+b );
         
        }
        else{
            if(a % resta == 0){
                System.out.println("La diferencia "+resta +" es un divisor exacto de "+a);
            }
            else{
                if(b % resta == 0){
                    System.out.println("La diferencia "+resta +" es un divisor exacto de "+b);
                }
                else{
                    System.out.println("La diferencia "+resta +" no es un divisor exacto de ninguno de los 2 numeros " );
        
                }
            }
        }
    }
}
