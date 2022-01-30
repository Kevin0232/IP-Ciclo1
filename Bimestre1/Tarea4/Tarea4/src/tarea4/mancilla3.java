/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author kevin
 */
public class mancilla3 {
    public static void main(String[] args) {
        System.out.println("Al usar un contador j que tiene un valor inicial de 1, un valor final de " +
                    "100 y un incremento de 5.");
        //Declaración e inicialización de variables
        int j, n;
        j=1; n=100;
        while(j<=n){
            if (j==1) {
                j=j+4;
            }
            System.out.println(j);
            j=j+5;
        }
    }
}
