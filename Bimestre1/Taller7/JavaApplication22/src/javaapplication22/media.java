/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class media {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //inicialización de variables
        System.out.println("Programa para introducir una serie indeterminada \n" +
"de números mientras su suma no supere el valor 10000");
        int num, n;
        double suma, i, media;
        num=0; i=0; n=10000; suma=0; media=0;
        while(suma<=n){
            System.out.print("Ingrese un número: ");
                num = leer.nextInt();
                suma= suma+num;
                i= i+1;
            if((suma > 0) && (suma<=10000)){
               
                System.out.println("-------");
            }
            else{
                System.out.println("La suma ha excedido el valor de 10000");
            }
            
            
        }
        media= suma/i;
        System.out.println("Se ha ingresado un total de " +i + " números");
        System.out.println("El total de numeros acumulados es: " +suma);
        System.out.println("La media aritmetica de los numeros ingresados es: " +media);
        
        
        
    }
}
