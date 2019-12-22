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
public class Proposta19 {
    /*Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array Proposta19,
onde cada elemento de Proposta19 é a divisão dos respectivos elementos em A e B, ou seja:
Proposta19[i] = A[i] / float(B[i]).
*/    
    public static void main(String[] args) {
        int [] a = {10,2,3,4,5,6,7,8,9,10}; 
        int [] b = {2,2,3,4,5,6,7,8,9,10}; 
        float [] c = new float[10];
        System.out.println("a divisao dos arrays e  ");
        for (int i = 0; i < a.length; i++) {
            
               c[i] = a[i] / (b[i]);
                System.out.println(c[i]);
            }
            
        }
    }

