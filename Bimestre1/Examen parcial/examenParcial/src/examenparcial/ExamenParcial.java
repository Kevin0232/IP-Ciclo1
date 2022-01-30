/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparcial;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ExamenParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaración e inicialización de variables
        Scanner leer = new Scanner(System.in);
        System.out.println("---Programa para conocer el valor total de libros---");
        String nombre;
        int cantL,opc;
        double costL, total, netoP, desc;
        cantL = 0; opc=0 ; costL = 0; total=0; netoP=0; desc=0;
        // Entrada de datos
        System.out.print("Ingrese nombre del cliente: ");
        nombre = leer.next();
        
        System.out.print("Ingrese la cantidad de libros: ");
        cantL = leer.nextInt();
        
        System.out.print("Ingrese el costo por libro: ");
        costL = leer.nextDouble();
        
        System.out.println("Observe el siguiente menú.");
        System.out.println("1. Cliente");
        System.out.println("2. Estudiante");
        System.out.println("3. Docente");
        System.out.println("Seleccione el tipo de cliente según el menú.");
        opc= leer.nextInt();
        switch (opc) {
            case 1 :
                total= costL*cantL;
                if(cantL<=5){
                    desc = total * (0.1);
                    netoP = total-desc;
                   
                }
                else{
                    if((cantL > 5) &&(cantL<=10)){
                    desc= total*(0.14);
                    netoP= total-desc;
                   
                    }
                    else{
                        if(cantL>10){
                    desc= total* (0.18);
                    netoP= total-desc;
                    
                        }
                    }
                }
                
                    
            break;    
            case 2 :
                total= costL*cantL;
                if(cantL<=5){
                    desc = total * 0.2;
                    netoP = total-desc;
                   
                }
                else{
                    if((cantL > 5) &&(cantL<=10)){
                    desc= total*0.24;
                    netoP= total-desc;
                   
                    }
                    else{
                        if(cantL>10){
                    desc= total* 0.28;
                    netoP= total-desc;
                    
                        }
                    }
                }
                    
            break;
            case 3 :
                total= costL*cantL;
                if(cantL<=5){
                    desc = total * 0.3;
                    netoP = total-desc;
                   
                }
                else{
                    if((cantL > 5) &&(cantL<=10)){
                    desc= total*0.34;
                    netoP= total-desc;
                   
                    }
                    else{
                        if(cantL>10){
                    desc= total* 0.38;
                    netoP= total-desc;
                    
                        }
                    }
                }
                    
            break;    
            default:
                System.out.println("Error: Se ha ingresado un número fuera del menú");
            break;
        }
        
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Total a pagar: " + total);
        System.out.println("Descuento: " + desc);
        System.out.println("Neto a pagar:  " + netoP);
    }
    
}
