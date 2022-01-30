/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declarar e inicializar variables
        int num1, num2, dif;
        num1=0; num2=0; dif=0;
        //ingresar los 2 numeros
        System.out.println("---Programa para determinar se la diferencia de dos numeros es"
                + " multiplo de alguno de ellos---\n");
        System.out.print("Ingrese el primer número: ");
        num1= leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= leer.nextInt();
        //Proceso para obtener la diferencia y verificar si es mulriplo
        dif= (num1-num2);
        if((num1 % dif == 0)&&(num2 % dif == 0)){
            System.out.println("La diferencia "+dif +" es múltiplo de "+num1+" y de "+num2 );
         
                
        }
        else{
            if(num1 % dif == 0){
                System.out.println("La diferencia "+dif +" es múltiplo de "+num1);
            }
            else{
                if(num2 % dif == 0){
                    System.out.println("La diferencia "+dif +" es múltiplo de "+num2);
                }
                else{
                    System.out.println("La diferencia "+dif +" no es múltiplo de ninguno de los 2 numeros " );
                }
            }
                
        }
    }
    
}
