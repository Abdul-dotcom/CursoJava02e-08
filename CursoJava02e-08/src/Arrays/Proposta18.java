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
public class Proposta18 {
    /*  Criar um array A com 15 elementos inteiros. Construir um array B de mesmo tipo e
tamanho, sendo que cada elemento do array B deverá ser o quadrado do respectivo
elemento de A, ou seja: B[i] = A[i] * A[I].
 */
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [] b = new int[15];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
            System.out.println(b[i]);
        }
    }
}
