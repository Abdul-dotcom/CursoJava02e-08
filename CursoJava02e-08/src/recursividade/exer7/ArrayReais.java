/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer7;

/**
 *
 * @author _AlyyRazack
 */
public class ArrayReais {
    int somaArray(int v[],int n){
        if (n == 0) return 0;
        return v[n-1] +somaArray(v,n-1);
    }
    
}
