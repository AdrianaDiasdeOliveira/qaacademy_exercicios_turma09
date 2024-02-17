package Medium;

import javax.swing.*;

public class Exercicio_13_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {

        //2-) Faça um algoritmo para ler um valor de investimento, com uma taxa
        //de juros de 12% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
        //juros, e o total. Considerando que a remuneração será no regime de juros
        //compostos.

            double valorInvestimento, taxaJuros =0.12, totalAtualizadoComJuros;
            int ano = 1, tempoInvestido = 10;
            String valorInvestimentoStg = JOptionPane.showInputDialog("Digite um valor de investimento: ");
            valorInvestimento = Integer.parseInt(valorInvestimentoStg);
            totalAtualizadoComJuros = valorInvestimento;

            while (ano <= tempoInvestido) {
                totalAtualizadoComJuros =
                        (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
                ano++;
            } // fim while
            System.out.println("O valor do investimento são: "+ valorInvestimento);
            System.out.println("O valor do Juros são: " +
                    (totalAtualizadoComJuros - valorInvestimento));

            System.out.println("O valor total do investimento: " + totalAtualizadoComJuros);


        }// fim main
    }

