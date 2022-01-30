/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepetitivos;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Ciclorepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Declaración e inicialización de variables
        int i, n,j, suma;
        i=1; n=1; suma=0;
        
        //Ingresar el limite del ciclo
        System.out.print("Ingrese el numero de ciclo: ");
        n = leer.nextInt();
        
        //proceso
        while(i<=n){
            suma=suma+i;
            System.out.println(i);
            i = i + 1 ;
            
        }
        
        System.out.println("i es: "+i);
        System.out.println("La suma es: " + suma);
        j= n;
        suma=0;
        while(j>=1){
            suma=suma+j;
            System.out.println(j);
            j=j-1;
            
        }
        System.out.println("j es: "+j);
        System.out.println("La suma es: " + suma);
    }
    
}
