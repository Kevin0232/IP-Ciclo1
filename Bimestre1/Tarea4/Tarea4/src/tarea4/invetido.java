/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author kevin
 */
public class invetido {
    public static void main(String[] args) {
        System.out.println("Programa que dé como salida número en orden "
                + "invertido del 25 al 0. ");
        //declaración de variables
        int num, n;
        num=25; n=0;
        //Proceso
        do{
            System.out.println(num);
            num=num-1;
        }while(num>=n);
    }
}
