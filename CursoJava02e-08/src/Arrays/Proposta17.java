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
public class Proposta17 {
    /*. Criar um array A com 8 elementos inteiros. Construir um array B de mesmo tipo e
tamanho e com os elementos do array A multiplicados por 2, ou seja: B[i] = A[i] * 2.*/
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10,12,14,16};
        int [] b = new int[8];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;
            System.out.println(b[i]);
            
            
        }
    }
    
}
