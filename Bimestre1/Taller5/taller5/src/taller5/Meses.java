/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Meses {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creación e inicialización de variables
        int mes;
        mes=0;
        //ingresar datos
        System.out.println("Programa para identificar el mes a través de su número");
        System.out.println("Escoja una opción del siguiente menú");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9.");
        System.out.println("10.");
        System.out.println("11.");
        System.out.println("12.");
        
        System.out.print("Seleccione un numero para saber el mes: ");
        mes = leer.nextInt();
        switch(mes){
            case 1: {
                System.out.println("Enero");
            }
            break;
            case 2: {
                System.out.println("Febrero");
            }
            break;
            case 3: {
                System.out.println("Marzo");
            }
            case 4: {
                System.out.println("Abril");
            }
            break;
            case 5: {
                System.out.println("Mayo");
            }
            break;
            case 6: {
                System.out.println("Junio");
            }
            break;
            case 7 : {
                System.out.println("Julio");            
            }
            break;
            case 8 : {
                System.out.println("Agosto");
            }
            break;
            case 9:{
                System.out.println("Septiembre");
            }
            break;
            case 10: {
                System.out.println("Octubre");
            }
            break;
            case 11: {
                System.out.println("Noviembre");
            }
            break;
            case 12: {
                System.out.println("Diciembre");
            }
            break;
            default: 
                System.out.println("El número ingresado no es valido.");
            break;
        }
        
    }
}
