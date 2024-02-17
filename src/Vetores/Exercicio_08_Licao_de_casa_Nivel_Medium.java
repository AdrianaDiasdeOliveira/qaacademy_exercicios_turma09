package Vetores;

import javax.swing.*;

public class Exercicio_08_Licao_de_casa_Nivel_Medium {

    public static void main(String[] args) {

        String[] meses = new String[12];

        meses[0] =  "Janeiro";
        meses[1] =  "Fevereiro";
        meses[2] =  "Março";
        meses[3] =  "Abril";
        meses[4] =  "Maio";
        meses[5] =  "Junho";
        meses[6] =  "Julho";
        meses[7] =  "Agosto";
        meses[8] =  "Setembro";
        meses[9] =  "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        for (int i = 0; i < meses.length; i++) {
            System.out.println("O mês do Ano: " + (i + 1) + "." + meses[i]);
        }
    }
}







