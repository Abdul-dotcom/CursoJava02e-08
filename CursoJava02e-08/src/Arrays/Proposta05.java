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
public class Proposta05 {
    //3. Faça um algoritmo que some o conteúdo de dois arrays e armazene o resultado em um terceiro array.

    public static void main(String[] args) {
        int [] array1 ={1,2,3,4,5};
        int [] array2 ={5,6,7,8,9};
        int [] resultado = new int [5];
        
        for (int i = 0; i <array1.length; i++) {
            for (int j = 0; j <array2.length; j++) {
                //int soma = array1[i]+array2[j];
                resultado[i] = array1[i] + array2[j];
                i++;  
            }
            System.out.println("Resultado da soma dos arrays e ...");
            for(int x = 0; x < resultado.length; x++){
         System.out.println(resultado[x]);
                
         
        }
    
    }
    }
}

