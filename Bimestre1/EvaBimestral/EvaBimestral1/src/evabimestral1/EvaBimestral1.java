/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evabimestral1;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class EvaBimestral1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para Verificar si un número es positivo, "
                + "negativo, par o impar");
        // Creación e inicializacón de variables
        int j, num, div, n, opc;
        num=0; j=1; n=0; div=0;opc=0; 
        // Ingreso de datos
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        System.out.println("\n Observe el siguiente menú.");
        System.out.println("1. Verificar si es par o impar");
        System.out.println("2. Verificar si es positivo o negativo");
        System.out.println("3. Verificar si es multiplo de 3.");
        System.out.println("4. Verificar si es primo.");
        System.out.print("\n Seleccione la opción a realizar: ");
        opc = leer.nextInt();
        switch(opc){
            case 1:
                if(num%2 ==0){
                System.out.println("EL número " +num+" es par ");
                }
                else{
                System.out.println("EL número " +num+" es impar ");
                }
            break;
            case 2:
                if(num == 0){
                System.out.println("EL número " +num+" es un número neutro ");
            }
            else{
                    if(num >0){
                        System.out.println("EL número " +num+" es positivo ");
                    }
                    else{
                        System.out.println("EL número " +num+" es negativo ");
                    }
                
                }
            break;
            case 3: 
                if(num%3 == 0){
                System.out.println("EL número " +num+" es multiplo de 3. ");
                }
                else{
                System.out.println("EL número " +num+" no es multiplo de 3. ");
                }
            break;
            case 4:
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
            break;
            default:
                System.out.println("A seleccionado un número fuera del menú.");
            break;
        }
    }
    
}
