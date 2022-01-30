/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseñe un algoritmo que presente el menor número"
                + " primo ingresado por el usuario, tenga en cuenta que el"
                + " , se tiene que reconocer si el número ingresado es primo o no ");
        Scanner leer = new Scanner(System.in);
        //inicialización de variables
        int num, i,n, menor, j, divisor, prim ;
        num=0; i=1; j=1 ; n=0; divisor=0; menor=0; prim=0;
        // ingreso de datos
        System.out.print("Ingresar el limite: ");
        n = leer.nextInt();
        //proceso
        while(i<=n){
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            
            
            for (j=1; j<=num; j++){
                if(num%j == 0){
                    divisor= divisor + 1;
                }
                    
                
            }
            if(divisor==2){
                System.out.println("Es un número primo.");
                prim= prim+1;
                if(prim==1){
                    menor=num;
                }
                else{
                    if(num<menor){
                        menor=num;
                    }
                    
                }
                       
            }
            else{
                System.out.println("No es un número primo, no se lo tomará en cuenta.");
            }
           i=i+1;
           divisor=0;
        }
        System.out.println("\nSe ha ingresado un total de " +prim + " números primos");
        System.out.println("\nEl menor número primo ingresado es: " + menor);
        
    }
    
}
