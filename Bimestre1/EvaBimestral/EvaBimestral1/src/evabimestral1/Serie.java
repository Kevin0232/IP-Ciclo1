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
public class Serie {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Creación e inicialización de variables.
        double n, num, denom, pot,i, j, pot1, pot2, denom1,suma;
        
        n=0; i=1; denom=0; pot=1; suma=0; num=3;pot1=0; j=1; pot2 =0; denom1=4;
        
        //proceso
        System.out.println("Ingrese un limite: ");      
        n = leer.nextDouble();
        for(i=1; i<=n;i++){
            if(i%2==0){
                num = 2;
            }
            else{
                num = 1;
            } 
            j = 1;
            while(j <= i){
                pot1 = pot1+2;
                
                pot= pot *(num *num) ;
                pot2= pot2 + 1;
                
                j=j+1;
            }
                  
            denom = denom1 + 3;
            suma= suma + (pot/denom);
            System.out.println("(" +num + "^" + pot1 + "/" +denom1 + ")" );
            denom1 = denom1 + (3*pot2);
            pot = 1;
            pot1= 0;
            pot2 = 0;
            
                
            
        }
        System.out.println("suma es:" +suma);
        
    }
    
}
