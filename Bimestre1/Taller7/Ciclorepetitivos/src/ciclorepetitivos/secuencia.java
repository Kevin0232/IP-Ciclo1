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
public class secuencia {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        //declaración e inicialización de variables
        int  i, n;
        double suma, term, num, den;
        num=1; den=2; i=1; n=0; term=0; suma=0;
        // entrada de datos
        System.out.print("Ingrese el limite de la sucesión: ");
        n = leer.nextInt();
        while(i<=n){
            term= (num/den);
            System.out.println("El término " + i+ " es: "+num+" / " + den );
            suma = suma + (num/den);
            num = num+2;
            den = den +3;
            i=i+1;
        }
        System.out.println("El total de la suma es: "+ suma);
            
    }
}
