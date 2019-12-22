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
public class Proposta16 {
    /*Criar um array A com 5 elementos inteiros. Construir um array B de mesmo tipo e
tamanho e com os "mesmos" elementos do array A, ou seja, B[i] = A[i].
    */
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10};
        int [] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
            
        }
    }
    
}
