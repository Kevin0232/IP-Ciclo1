/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class alumnos {
    public static void main(String[] args) {
        System.out.println("para leer las calificaciones de N alumnos y "
                + "determine el número de " +
                "aprobados y reprobados. ");
        Scanner leer = new Scanner(System.in);
        //creación e inicialización de variables
        int n, alum,aprob,reprob;
        double nota;
        n=0;alum=1;aprob=0;reprob=0; nota=0;
        //entrada de datos
        System.out.print("Ingrese la cantidad de alumnos a evaluar: ");
        n = leer.nextInt();
        while(alum<=n){
            System.out.println("Ingrese la nota del alumno:");
            nota = leer.nextDouble();
            if(nota<7){
                reprob=reprob+1;
                  
            }
            else{
                aprob=aprob+1;
            }
            alum=alum+1;
        
        }
        System.out.println("La cantidad de alumnos que probaron fueron: "+aprob);
        System.out.println("La cantidad de alumnos que reprobaron fueron: "+reprob);
        
    }
    
}
