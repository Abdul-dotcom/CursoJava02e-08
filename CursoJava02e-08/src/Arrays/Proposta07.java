/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta07 {
    /* Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C,
      onde cada elemento de C é a soma dos respectivos elementos em A e B, */
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9,10};
        int [] b ={11,12,13,14,15,16,17,18,19,20};
        int [] c= new int[10];
         for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <b.length; j++) {
                //int soma = array1[i]+array2[j];
                c[i] = a[i] + b[j];
                i++;  
            }
            System.out.println("Resultado da soma dos arrays e ...");
            for(int x = 0; x < c.length; x++){
         System.out.println(c[x]);
                
         
        }
    }
}
}
