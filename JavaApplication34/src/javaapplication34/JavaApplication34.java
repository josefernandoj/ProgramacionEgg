/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String ii="", jj="", kk="";
       
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                   ii=Integer.toString(i);
                   jj=Integer.toString(j);
                   kk=Integer.toString(k);
                    if (i==3){
                        ii="E";
                    }
                    if (j==3){
                        jj="E";
                    }
                    if (k==3){
                        kk="E";
                    }
                    System.out.println(ii+"-"+jj+"-"+kk);
                }
            }
            
        }
    }
    
}
