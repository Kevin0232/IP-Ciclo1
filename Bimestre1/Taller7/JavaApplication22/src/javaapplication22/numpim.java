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
public class numpim {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creaci;on e inicialización de varibales
        System.out.println("Programa para saber si un número es par, impar o primo.");
        int num, j, i ,div, n;
        num=0; n=0; div=0;
        System.out.println("Ingrese el limite de números a verificar");
        n = leer.nextInt();
        for(i=1; i<=n ; i++){
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if(num%2 ==0){
                System.out.println("EL número " +num+" es par ");
            }
            else{
                System.out.println("EL número " +num+" es impar ");
            }
            //verificar número primo
            j=1;
            while(j <= num){
                if (num%j==0){
                    div= div+1;
            }
            j = j+1;
               
            }
            if( div == 2){
                System.out.println("El número " + num +" es primo.");
            }
            else{
                System.out.println("El número " + num +" no es primo.");
            }
          
            div=0;
            
        }
    }
    
}
