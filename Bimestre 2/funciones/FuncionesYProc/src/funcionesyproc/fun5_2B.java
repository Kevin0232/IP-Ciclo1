/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproc;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class fun5_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, potP,numP, denP;
        double suma,factP,n;
        suma = 0;numP= -1; denP=0; potP=0; factP=0;
        System.out.print("Ingrese el limite de la serie: ");
        n = leer.nextInt();
        
        for (i = 1; i <=n ; i++) {
            numP = Numerador(numP);
            denP = Denominador(denP);
            factP = Factorial(denP);
            potP = Potencia(potP);
            
            System.out.println(numP + "^" + potP + "/"+denP+"!");
        
            suma = suma + ((numP^potP)/factP);
            
        }
        System.out.println("La suma de la serie númerica es: "+suma);
    }
    
    public static int Numerador(int num){
        num = num + 2;
        return num;
    }
    public static int Denominador( int den){
        den = den + 2;
        return den;
    }
    public static int Factorial( double den){
        int fact, j;
        fact = 1;
        for (j = 1; j <= den; j++) {
            fact = fact * j;
        }
        return fact;
    }
    public static int Potencia(int pot){
        pot = pot + 3;
        return pot;
        
    }
}
