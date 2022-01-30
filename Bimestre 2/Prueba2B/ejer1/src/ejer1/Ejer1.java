/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,par,neg,prim,cont,cont1,cont2,div;
        double Ppar,Pneg,Pprim,NN;
        n=0;par=0;neg=0;prim=0;cont=-1;cont1=-1;cont2=-1;div=0;
        Ppar=0;Pneg=0;Pprim=0;NN=0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n=leer.nextInt();
        int []A= new int [n];
        System.out.println("Ingresar datos de la matriz A");
        for(int i=0; i <n; i++){
            System.out.print("A["+i+"]= ");
            A[i] = leer.nextInt();
        }
        par = PAR1(A,n);
        neg = Neg1(A,n);
        prim= Prim1(A,n);
        int []Par= new int [par];
        int []Neg= new int [neg];
        int []Primos= new int [prim];
        
        // Almacenar los datos en los vectores
        for(int i=0; i <n; i++){
            if(A[i]%2 == 0){
                cont++;
                Par[cont]=A[i];
            }
            if(A[i]<0){
                cont1++;
                Neg[cont1] = A[i];
            }
            for (int j = 1; j <=A[i]; j++) {
                if(A[i]%j==0){
                   div++; 
                }
            }
            if(div==2){
                
                cont2++;
                Primos[cont2] = A[i];
            }
            div=0;
            Ppar=par;Pneg=neg;Pprim=prim;NN=n;
        }
        System.out.println("Hay "+ par+" números pares que son el "+((Ppar/NN)*100) +"% del total de números");
        System.out.println("Hay "+ neg+" números negativos que son el "+((Pneg/NN)*100) +"% del total de números");
        System.out.println("Hay "+ prim+" números primos que son el "+((Pprim/NN)*100) +"% del total de números");
        EscribirPar(Par,par);
        EscribirNeg(Neg,neg);
        Escribirprim(Primos,prim);
    }
    public static int PAR1(int A[],int n){
        int par=0;
        for(int i=0; i <n; i++){
            if(A[i]%2 == 0){
                par++;
            }
        }
        return par;
    }
    public static int Neg1(int A[],int n){
        int neg=0;
        for(int i=0; i <n; i++){
            if(A[i]<0){
                neg++;
            }
        }
        return neg;
    }
    public static int Prim1(int A[],int n){
        int div=0;
        int prim=0;
        for(int i=0; i <n; i++){
            for (int j = 1; j <=A[i]; j++) {
                if(A[i]%j==0){
                   div++; 
                }
            }
            if(div==2){
                prim++;
            }
            div=0;
        }
        return prim;
    }
    public static void EscribirPar(int Par[],int par){
        System.out.print("\nVector Par =  ");
        for (int i = 0; i < par; i++) {
            System.out.print ( Par[i]  +"  ");
        }
        System.out.println(" ");
        
    }
    public static void EscribirNeg(int Neg[],int neg){
        System.out.print("\nVector Negativo =  ");
        for (int i = 0; i < neg; i++) {
            System.out.print ( Neg[i]  +"  ");
        }
        System.out.println(" ");
    }
    public static void Escribirprim(int Primos[],int prim){
        System.out.print("\nVector Primos =  ");
        for (int i = 0; i < prim; i++) {
            System.out.print ( Primos[i]  +"  ");
        }
        System.out.println(" ");
    }
}
