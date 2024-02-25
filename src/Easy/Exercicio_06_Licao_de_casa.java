package Easy;

import javax.swing.*;
import java.sql.SQLOutput;

//6-) Faça um algoritmo para ler duas notas, calcular a média.E SE - a média > 5 Exibir aprovado;
//SE a média < que 5 exibir reprovado .Se media = 5 exibir exame.

public class Exercicio_06_Licao_de_casa {

    public String CalcularMedia(double nota1, double nota2) {

        double media;

       /* String primeiraNota = JOptionPane.showInputDialog("Digite a 1º Nota :");
        String SegundaNota = JOptionPane.showInputDialog("Digite a 2º Nota :");

        nota1 = Double.parseDouble(primeiraNota); // Conversão e atribuição na variavel primeiraNota / SegundaNota
        nota2 = Double.parseDouble(SegundaNota);
*/
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return "Aluno Aprovado!";
        }
        if (media < 5) {
            return " Aluno Reprovado!";

        }
        if (media == 5) {
            return " Aluno em Exame!";

        }
        return null;
    }
}




