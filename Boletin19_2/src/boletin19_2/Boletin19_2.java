/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] notas=new int[30];
Notas clase=new Notas();
clase.crearArray(notas);
clase.numerosAS(notas);
clase.NotaMedia(notas);
clase.NotaMasAlta(notas);
    
}
}