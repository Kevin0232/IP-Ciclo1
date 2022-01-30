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
public class simetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m, i, j;
        boolean simetrica;
        m = 0; i = 0 ; j = 0;
        simetrica = true;
        
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        m = leer.nextInt();
        int[][] A = new int [m][m];
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
                }
            }
        for (i = 0; i < m; i++) {
            for (j = 0; j <m ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
        for(i=0;i<m;i++){      
            for(j=0;j<m;j++){
                if(A[i][j] != A[j][i]){
                    simetrica = false;
                    i=m;
                    break;
                }
            }
         
        }
        if(simetrica == true){
            System.out.println("La matriz es simetrica");
            
        }
        else{
            System.out.println("La matriz no es simetrica");
        }
    }
          
}
