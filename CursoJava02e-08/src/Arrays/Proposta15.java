/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta15 {
    /*15. Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
escreva a quantidade de elementos armazenados neste vetor que são pares. */
    public static void main(String[] args) {
         int[] elementos = {1, 2, 9, 10, 22, 4, 34, 30, 90, 7};
        ArrayList<Integer> pares = new ArrayList<>();
         for (int i = 0; i < elementos.length; i++) {
            
            int el = elementos[i];
            
            if (el % 2 == 0) {
                pares.add(el);
            } 
    }
         
         int resultado = pares.size();
         System.out.println(resultado);
    
}
}
