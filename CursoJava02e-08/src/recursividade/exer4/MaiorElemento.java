/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer4;

/**
 *
 * @author _AlyyRazack
 */
public class MaiorElemento {
    int maximoR(int n,int v[]){
        int x;
        if(n == 1) x = v[0];
        else{
            x=maximoR(n-1, v);
            if (x<v[n-1]) x = v[n-1];
        }
        return x;
    }
    
}
