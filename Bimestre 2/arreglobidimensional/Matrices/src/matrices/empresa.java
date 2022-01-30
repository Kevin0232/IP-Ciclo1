/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class empresa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m, i, j,cont,asp;
        double suma,aux;
        String aux1=("ad");
        n = 0; i = 0 ; j = 0; m=0;;suma=0;cont=0;asp=0;aux=0;
        
        //PAGINA 241 MANCILLA, EJERCICIO 4.18
       
        
        System.out.print("Ingrese el número de personas a "
                + "considerar en el puesto de trabajo: ");
        n = leer.nextInt();
        System.out.print("Ingrese el número de aspirantes: ");
        asp = leer.nextInt();
        
        System.out.print("Ingrese el número criterios "
                + "a evaluar: ");
        m = leer.nextInt();
        cont=m;
        String[] nombre = new String[n];
        double[][] criterio = new double [n][m];
        double [] result = new double[n];
        String[] Ncriterio= new String[m];
        double[] aspi = new double [asp];
        //Ingresar los datos
        for(j=0; j<m; j++){
            System.out.print("Ingrese el nombre del criterio "+j+": " );
            Ncriterio[j] = leer.next();
        }
        for(i=0;i<n;i++){
            
            System.out.print("Ingrese el nombre del empleado, codigo ["+i+"]: ");
            nombre[i] = leer.next();
        }
        
        System.out.println("LOS CRITERIOS CALIFICADOS VAN CON EL SIGUIENTE RANGO.[0-10]");    
        for(i=0;i<n;i++){
                
            for ( j = 0; j <m; j++) {
                    
                System.out.print("Ingrese la calificación del criterio " + Ncriterio[j]+" de "+nombre[i]+": " );
                criterio[i][j] = leer.nextDouble();
                if((criterio[i][j] <0)||(criterio[i][j]>10)){
                    System.out.println("SE HA INGRESADO UNA NOTA FUERA DE LOS PARAMETROS");
                    System.out.println("***FIN DEL PROGRAMA***");
                    System.out.println("VUELVA A INICIAR");
                    j=m;
                    i=n;
                }
            }
            System.out.println("SIGUIENTE ASPIRANTE: ");
        }
        
        for(i=0;i<n;i++){
                
            for ( j = 0; j <m; j++) {
                    
                suma= suma+ criterio[i][j];
                    
            }
        result[i]= (suma/cont);
        suma=0;
        
        }
        
        // PRESENTAR LOS DATOS
        for(i=0;i<n;i++){
            
            System.out.print(nombre[i] + "     ");
          
                for ( j = 0; j <m; j++) {
                    
                    System.out.print("   "+ criterio[i][j] );
                   
                    
                }
            System.out.print(" =  "+ result[i]) ;
            System.out.println(" ");
        }
        //considerar el número de aspirantes
        for(i=0; i<n; i++){
           for(j=i+1; j<n ;j++){
                if(result[i]<result[j]){
                   aux = result[i];
                   result[i] = result[j];
                   result[j] = aux;
                   aux1 = nombre[i];
                   nombre[i] = nombre[j];
                   nombre[j] = aux1;

               }
           }
       }
    
        System.out.println("Las personas con mayor consideración para"
                + " tener el empleo son: ");
        for(i=0; i<asp; i++){
            System.out.println("  *"+nombre[i]+" con una calificación de "+result[i]+". ");
    }
    }
    
}
