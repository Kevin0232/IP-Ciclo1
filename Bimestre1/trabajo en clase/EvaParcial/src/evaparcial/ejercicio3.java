/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaparcial;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creación e inicialiación de variables
        System.out.println("--conversor de escalas aprobatorias de calificaciones--\n");
        double n=0;
        
        //Entrada de datos
        System.out.print("Ingrese la calificación sobre 5 puntos. ");
        n = leer.nextDouble();
        // proceso
        if(n>=3.0){
            
            if((n>=4.6)&&(n<=5)){
                System.out.println("Estudiante excelente");
            }
            else{
                if((n>=4.1)&&(n<=4.5)){
                    System.out.println("El alumno es muy bueno");
                }
                else{
                    if((n>=3.6)&&(n<=4.0)){
                        System.out.println("El estudiante es bueno");
                    }
                    else{
                        if((n>=3.3)&&(n<=3.5)){
                            System.out.println("El alumno registró un desempeño aceptable");
                            
                        }
                        else{
                            if((n>=3.0)&&(n<=3.2)){
                                System.out.println("Alumno Aprobado");
                            }
                               
                        }
                    }
                }
            }
        }
        else{
            System.out.println("El alumno registra una calificación no aprobatoria");
        }
    }
   
}
