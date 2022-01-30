/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double nT;
        double nL;
        double nP;
        double nE;
        double ntF;
        double nlF;
        double npF;
        double neF;
        double nF;
        String nombre;

        System.out.println("---Programa para calcula la nota final de un estudiante--");
        System.out.println("Ingrese nombre del estudiante: ");
        nombre = leer.next();

        // ingrese datos de entrada
        System.out.println("ingresar notas sobre 10 puntos");

        System.out.println("Ingrese nota de trabajos (nT)");
        nT = leer.nextDouble();
        if (nT>10) {
            System.out.println("La nota es sobre 10 puntos");
            System.out.println("**ingrese la nota otra vez***");
            System.out.println("");
        }
        System.out.println(nT);

        System.out.println("Ingrese nota de lecciones (nL)");
        nL = leer.nextDouble();
        if (nL>10) {
            System.out.println("La nota es sobre 10 puntos");
            System.out.println("**ingrese la nota otra vez***");
            System.out.println("");
        }
        System.out.println(nL);

        System.out.println("Ingrese nota de participación (nP) ");
        nP = leer.nextDouble();
        if (nP>10) {
            System.out.println("La nota es sobre 10 puntos");
            System.out.println("**ingrese la nota otra vez***");
            System.out.println("");
        }
        System.out.println(nP);

        System.out.println("Ingrese nota de examen final (nE)");
        nE = leer.nextDouble();
        if (nE>10) {
            System.out.println("La nota es sobre 10 puntos");
            System.out.println("**ingrese la nota otra vez***");
            System.out.println("");
        }
        System.out.println(nE);

        // proceso

        ntF = (nT * 20) / 100;
        nlF = (nL * 30) / 100;
        npF = (nP * 10) / 100;
        neF = (nE * 40) / 100;
        nF = ntF + nlF + npF + neF;

        System.out.println("La nota de trabajos correspondientes al 20% es: " + ntF + "\n");
        System.out.println("La nota de Lecciones correspondientes al 30% es: " + nlF + "\n");
        System.out.println("La nota de participacción correspondientes al 10% es: " + npF + "\n");
        System.out.println("La nota del examen final correspondientes al 40% es: " + neF + "\n");
        System.out.println("La nota final del estudiante " + nombre + "es:" + nF + "\n");
        if (nF>=7) {
            System.out.println("El estudiante aprobó");
            System.out.println("");
        }
        if (nF<=6.99) {
            System.out.println("El estudiante no aprobó");
            System.out.println("");
        }
    }
}
