/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Explicador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fone = 0;
        String [] nome ;
        int [] codigo ;
        int continua = 1;
        int qnt = 0 ;
        System.out.println("Digite a quantidade que pretende inserir:");
        qnt = sc.nextInt();
        nome = new String[qnt];
        codigo = new int[qnt];
        for (int i = 0; i < nome.length; i++) {
            System.out.println("digite o nome: ");
            nome[i] = sc.next();
            System.out.println("Digite o codigo de visita: ");
            codigo[i] = sc.nextInt();   
        }
        System.out.println("Entrando em modo de consulta..");
        
        while(continua == 1){
            System.out.println("qual e o nome q deseja saber o codigo?");
            String nomes = sc.next();
            for (int i = 0; i < qnt; i++) {
                if(nome[i].equalsIgnoreCase(nomes)){
                    fone = codigo[i];
                }
                    
                
            }
            System.out.println("Resultado da Consulta: '" + fone + "'");
            continua = 0;
            System.out.println("Para fazer uma nova consulta, entre com o valor 1:");
            continua =sc.nextInt();
        }
    }
    
}
