/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bissexto;

/**
 *
 * @author eliez
 */
public class Bissexto {
    
    public boolean bissexto(int numero){
        
        if((numero%100)!=0 && ((numero%4)==0) && ((numero%400)!=0)){
            System.out.println("Número é Bixesto");
            return true;
        }
        
        else if ((numero%400)==0){
            System.out.println("Número é Bixesto");
            return true;
        }
        else System.out.println("Numero não é Bixexto");
        return false;
    }
    
}
