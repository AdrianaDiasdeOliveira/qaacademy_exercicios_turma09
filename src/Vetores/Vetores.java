package Vetores;

import javax.swing.*;

public class Vetores {
    public static void main(String[] args) {

        int[] idades;
        idades = new int[5];

        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        idades[3] = 40;
        idades[4] = 50;


        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i] );

        }
    }
}
