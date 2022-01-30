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
public class Tmult {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        //declaración e inicialización de variables
        int num,n, i, mult;
        i=1; num=0; n=0; mult=0;
        //entrada de datos
        System.out.print("Ingrese el número del que desea la tabla: ");
        num = leer.nextInt();
        System.out.print("Ingrese el limite de la tabla: ");
        n = leer.nextInt();
        //proceso
        while(i<=n){
            mult=num*i;
            System.out.println(num+" x "+i+" = "+mult );
            i=i+1;
        }
        
    }
}
