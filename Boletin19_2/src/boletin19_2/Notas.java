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
public class Notas {
    //Método para introducir valores.

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
    }
    //Método para crear y dar valor a un array de tipo int.
    public void crearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = darValor();
        }
    }
    //Método que cuenta los alumnos aprobados y suspensos dado un array de tipo int.
    public void numerosAS(int[] array) {
        int aprobado = 0;
        int suspenso = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5.0) {
                aprobado++;
            } else {
                suspenso++;
            }
        }
        System.out.println("Aprobados: " + aprobado + "\nSuspensos: " + suspenso);
    }
    //Método que calcula y visualiza la nota media de los alumnos dado un array de tipo int.
    public void NotaMedia(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total +=array[i];
        }
        System.out.println("Nota Media: " + (total / array.length));
    }
    //Método que visualiza la nota más alta dado un array de tipo int.
    public void NotaMasAlta(int[] array) {
        double aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (aux < array[i]) {
                aux = array[i];
            }

        }
        System.out.println("Nota más Alta: " + aux);
    }
}
