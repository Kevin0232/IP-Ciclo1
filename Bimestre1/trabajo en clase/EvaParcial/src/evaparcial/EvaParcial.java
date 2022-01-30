/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaparcial;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class EvaParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----Programa para calcular los descuentos por tipo de cliente----\n");
        Scanner leer = new Scanner(System.in);
        String nombre;
        int tCliente, cantLibros;
        double costoLibro, desc, descTotal, subtotal, total;
        tCliente = 0; cantLibros = 0; costoLibro =0; desc=0;
        descTotal=0; costoLibro=0; total=0;
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = leer.next();
        System.out.println("1. Docente");
        System.out.println("2. Estudiante");
        System.out.println("3. Publico en general");
        
        System.out.print("Ingrese el tipo de cliente: ");
        tCliente = leer.nextInt();
        System.out.print("Ingrese la cantidad de libros: ");
        cantLibros = leer.nextInt();
        System.out.print("Ingrese el costo por libro: ");
        costoLibro = leer.nextDouble();
        //proceso
        if(tCliente==1){
            desc=0.30;
        }
        else{
            if(tCliente==2){
                desc=0.20;
                
            }
            else{
                if(tCliente==3){
                    desc=0.10;
                    
                }
                else{
                    desc=0;
                }
            }    
            
        }
        //condición para determinar ek descuento según la cantidad de libros
        if((cantLibros>5)&&(cantLibros<=10)){
            desc= desc+0.04;
            
        }
        else{
            if(cantLibros>10){
                desc= desc+0.08;
            }
        }
        //Obtener el subtotal y el valor neto a pagar
        subtotal= cantLibros*costoLibro;
        descTotal= (subtotal*desc);
        total= subtotal-descTotal;
        //presentar los datos de salida
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Total a pagar: "+subtotal);
        System.out.println("Descuento: " +descTotal);
        System.out.println("Neto a pagar: "+ total);
        
    }
    
}
