/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author kevin
 */
public class mancilla8 {
    public static void main(String[] args) {
        System.out.println("Al usar un contador xcnt que tiene valor inicial "
                + "de 20.0, un valor final de" +
                "10.0 y un incremento de –0.2");
        //declaración e inicialización de variables
        double xcnt,n;
        xcnt=20; n=10; 
        while(xcnt>=n){
            System.out.println(xcnt);
            xcnt = xcnt - 0.2;
        }
    }
}
