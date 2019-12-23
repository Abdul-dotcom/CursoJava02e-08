/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer8;

/**
 *
 * @author _AlyyRazack
 */
public class NumeroNatural {
    int conta(int n,int k){
        if ( n == 0)return 0;
        return conta( n / 10 , k) + (n % 10 == k);
    }
    
}
