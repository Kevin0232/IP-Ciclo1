/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdatosjava;

/**
 *
 * @author kevin
 */
public class TiposDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***programa de tipos de datos, operadores y expresiones Java ***");
        System.out.println("Introducción a la programación");
        System.out.println("Kevin Bustamante");
        System.out.println("---");
        //datos enteros, suma
        int num1 = 4;
        int num2 = 9;
        int num3 = num1+num2;
        System.out.println("El valor de la variable entera es: "+ num3);
        
        System.out.println("---");
        //variables, expresión Double
        
        double dec1 = 25.8;
        double dec2 = 30.6;
        double dec3 = dec1*dec2;
        System.out.println("El valor de la variable dec3 es igual a: "+ dec3);
        
        System.out.println("---");
        //Expresión Char
        char letra1 = 'F';
        char letra2='T';
        System.out.println("Los caracteres son: "+ letra1+ letra2);
        
        System.out.println("---");
        //Expresión String
        String nombre= "Kevin";
        String apellido  = "Bustamante";
        String domicilio = "Loja";
        String telefono = "2615617";
        
        System.out.println("**Presentar variables string***");
        System.out.println("Mi nombre es: "+ nombre);
        System.out.println("Mi apellido es: "+ apellido);
        System.out.println("Vivo en:"+ domicilio);
        System.out.println("Mi número de teléfono es: "+ telefono);
        System.out.println("\n");
        System.out.println("me llamo"+ nombre+""+ apellido+", vivo en"+ domicilio + "y mi telefono de casa es" + telefono+"\n");
        
        System.out.println("**Presentar en una sola linea***");
        
        System.out.printf("me llamo %s %s, vivo en %s, y mi numero de casa es %s \n",nombre,apellido,domicilio,telefono);
        System.out.print("**Presentar concatenar variables tipo string*** \n");
        
        System.out.print("Me llamo" .concat( nombre) .concat( apellido) 
                .concat(" y vivo en") 
                .concat( domicilio)
                .concat("y mi telefono es ") 
                .concat( telefono));
        
        
        
    }
    
}
