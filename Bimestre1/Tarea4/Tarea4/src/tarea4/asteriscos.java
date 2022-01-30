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
public class asteriscos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j,n;
        //datos de entrada
        System.out.print("Ingrese un número: ");
        n = leer.nextInt();
        for(i=1; i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
                
                
            }
            
        }
       
    }
    
}
