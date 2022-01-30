/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproc;


import java.util.Scanner;
import static funcionesyproc.fun3_2B.Impar;
/**
 *
 * @author kevin
 */
public class funcion4_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        boolean esImpar, esPrimo;
        System.out.println("Funcion para verificar si un numero es impar y"
                + " primo\n ");
        
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        esImpar = Impar(num);
        if(esImpar == true){
            esPrimo = Primo(num);
            if(esPrimo == true){
                System.out.println("El número " + num + " es impar y es primo.\n");
            }
            else{
                System.out.println("El número " + num + " es impar pero no es primo.\n");
            }
        }
        else{
            System.out.println("El número no es impar por lo tanto no se verifica si es primo");
        }
        
    }
    public static boolean Primo(int numero){
        int div =0;
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                div = div + 1;
            }
        }
        if(div == 2 ){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
