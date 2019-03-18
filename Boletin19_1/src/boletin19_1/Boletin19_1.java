/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int[] numeros=new int[6];
        Random random1=new Random();
        random1.crearArray(numeros);
        random1.amosarInversa(numeros);
    }
    
}
