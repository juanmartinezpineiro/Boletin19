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
public class Random {

    //Método que crea un array de tipo int con números aleatorios.
    public void crearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
            System.out.println(array[i]);
        }
    }

    //Método para visualizar los datos de un array de forma inversa
    public void amosarInversa(int[] array) {
        System.out.println("\n");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
