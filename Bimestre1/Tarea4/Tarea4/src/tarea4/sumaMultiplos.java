/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author kevin
 */
public class sumaMultiplos {
    public static void main(String[] args) {
        int suma, i;
        suma=0;
        for(i=1;i<=999;i++){
            if(i%3==0 || i%5==0){
                suma=suma+i;
                
            }
        }
        System.out.println("Respuesta: " +suma);
    }
    
}
