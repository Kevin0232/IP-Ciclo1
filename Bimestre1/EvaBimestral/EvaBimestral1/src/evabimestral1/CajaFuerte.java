/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evabimestral1;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class CajaFuerte {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correct, n, clave,i;
        correct=2032; n=4; i=1; clave=0;
        
       //proceso
       
        do{
            System.out.print("Ingrese la clave: ");
            clave= leer.nextInt();
            if(correct==clave){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }
            if(correct!=clave){
                System.out.println("Lo siento, esa no es la combinación");
            }
            i=i+1; 
            if((i>4)){
                System.out.println("Demasiados intentos");
                System.out.println("La caja fuerte ha sido bloqueada");
            }
             
               
           } while ((i<=n)&&(correct != clave));
    }
}
