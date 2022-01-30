/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesyproc;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class FuncionesYProc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = 0;
        System.out.println("Procedimiento para verificar si un numero es par o impar");
        System.out.print("Ingrese el número a verificar: ");
        num = leer.nextInt();
        
        ParImpar(num);
        System.out.println("**Fin del procedimiento 1**");
        NegPos(num);
        System.out.println("**Fin del procedimiento 2**");
    }
    
    // procedimiento para verificar si un número es par o impar
    public static void ParImpar (int numero) {
        if(numero % 2 == 0){
            System.out.println("El número " + numero + " es par \n");
        }
        else{
            System.out.println("El número " + numero + " es impar \n");
        }
    }
    
    public static void NegPos (int numero){
        if(numero > 0){
            System.out.println("El número " + numero + " es positivo \n");
        }
        else{
            System.out.println("El número " + numero + " es negativo \n");
        }
    }
    
}
