/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int an, mn, dn, ap, mp, dp, aa, ma, da;
        System.out.println("Inrese todos sus datos con números");
        System.out.print("Ingrese año de nacimiento: ");
        an = leer.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        mn =leer.nextInt();
        System.out.print("Ingrese dia de nacimiento: ");
        dn = leer.nextInt();
        
        System.out.print("Ingrese el año actual: ");
        aa = leer.nextInt();
        System.out.print("Ingrese el mes actual: ");
        ma = leer.nextInt();
        System.out.print("Ingrese el dia actual: ");
        da = leer.nextInt();
        
        
        //proceso
        
        
        if(((mn>ma)&&(ma<=12)&&(mn<=12))){
            ap = (aa - an)-1;
        }
        else{
            ap = (aa - an);
        }
        if(mn<=ma){
            mp = (ma-mn);
        }
        else{
            mp=(12-(mn-ma));
        }
        if(dn>da){
        
            dp= 31-(dn-da) ;
        }
        else {
            dp= da-dn ;
        }
        if(mp>=12){
            ap= ap+1;
            mp=mp-12;
        }
        
        if(dp>30){
           mp = mp+1;
           dp= dp-31;
        }
        
        //salida
        System.out.println("la persona tiene "+ap + " años, " +mp + " meses y " + dp + " días." );
    }
    
}
