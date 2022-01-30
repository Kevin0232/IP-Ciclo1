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
public class sumaCifraNUm {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int sdn, nd, n , cn;
         sdn=0; nd=0;
         //Ingreso de datos
         System.out.print("Por favor digite un número: ");
         n= leer.nextInt();
         cn=n;
         if(cn<0){
             cn= -cn;
             
         }
         if(cn==0){
             //Si el número es 0, entonces n tiene 1 dígito
             // y la suma de las cifras es 0
             sdn=0;
             nd=0;
             
         }
         else{
             while(cn>0){
                 //se acumula la suma de cifras
                 sdn=sdn+(cn%10);
                 nd= nd+1;
                 // se descarta la cifra sumada
                 cn=cn/10;
                         
                 
             }
         }
         System.out.println(n+" tiene " + nd +" dígitos y la suma de los "
                 + "digitos de " +n +" es: "+ sdn);
             
    }
    
}
