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
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaración e inicialización de varibales
        int base, pot, result;
        int i;
        i=1; base = 0; result = 1 ;pot =0;
        //ingreso de datos
        System.out.print("Ingrese la base: ");
        base = leer.nextInt();
        System.out.print("ingrese la potencia: ");
        pot = leer.nextInt();
        
        while(i<=pot){
            result= result*base;
            
            i= i+1;
            
        }
        System.out.println("La potencia "+pot +" de la base "+ base+" es: "+result);
        
    }
}
