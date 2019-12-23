/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.exer9;

/**
 *
 * @author _AlyyRazack
 */
public class UniaoArrays {
    void merge(int v1[],int n1,int v2[],int n2,int v3[]){
        if (n1 == 0 && n2 ==0)return;
        
        if(n1 == 0){
            v3[0] = v2[0];
            merge( v1 , n1 , ++v2 , --n2 , ++v3 );
            
        }
        else
            if(v1[0] <= v2[0]){
                v3[0] = v1[0];
                merge(++v1,--n1,v2,n2,++v3);
            }
            else{
                v3[0] = v2[0];
                merge(v1 ,n1,++v2,--n2,++v3);
            }
    }
    
}
