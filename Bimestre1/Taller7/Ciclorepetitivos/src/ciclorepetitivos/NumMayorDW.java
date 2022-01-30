/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclorepetitivos;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class NumMayorDW {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //inicialización de varibales
        int i, n, num, mayor, menor ;
        i=1; n=0; num=0; mayor=0; menor=0;
        
        // Ingrese los datos
        System.out.println("**Encontrar el número mayor de N números que ingrese el usuario**\n");
        System.out.print("Ingrese el limite de los números: ");
        n = leer.nextInt();
        
        do{
            System.out.print("\n Ingrese un número: ");
            num = leer.nextInt();
            if (num > mayor){
                mayor = num;
            }
            
            i = i+1;
            
        }while (i<=n);
        System.out.println("El número mayor de los valores ingresados es: " +mayor);
        
        System.out.println("**Encontrar el número menor de N números que ingrese el usuario**\n");
        for (i=1; i<=n; i++){
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            if( i == 1 ){
                menor=num;
            }
            
            if(num < menor){
                
                menor = num;
                
            }
           
        }
        System.out.println("El número menor es: "+menor);
              
    }
}
