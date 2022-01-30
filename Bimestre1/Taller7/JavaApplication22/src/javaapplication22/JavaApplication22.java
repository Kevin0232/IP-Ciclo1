/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author kevin
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Programa para saber los multiplos de 5 entre el 0 al 100===");
        //creaci;on e inicialización de varibales
        int i,n,mult, num;
        i =1 ; n=100 ;num=0; mult=0 ;
        //proceso
        for(i=1;i<=n;i++){
            num=num+1;
            if(num%5 ==0){
                System.out.println("El número "+ num +" es multilpo de 5");
            }
            
            
        }
        System.out.println("-------------------------------------------------------");
        i=1;
        num=0;
                
        do{
            
            num=num+1;
            if(num%5 ==0)
                System.out.println("El número "+ num +" es multilpo de 5");
                i = i+1;
        }while(i<=n);
    }
    
}
