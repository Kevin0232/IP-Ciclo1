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
public class menorfila {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, j,i,k,l, menor;
        menor = 0; n=0; l=0; k=0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        int[][] A = new int [n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
                }
            }
        
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
                
            }
            System.out.println("");
        }
        
        for(i=0;i<n;i++){
            menor = A[i][0];
            for(j=0;j<n;j++){
                if(A[i][j]< menor){
                    menor = A[i][j];
                    
                           
                }
            }
            System.out.println("El elemento menor de la fila " +i + " es "
                    +menor+" y está en A["+i+"]["+ l +"]");
            
            
            
        }
        
    }
}
