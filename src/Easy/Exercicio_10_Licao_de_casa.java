package Easy;

import javax.swing.*;

public class Exercicio_10_Licao_de_casa {
    public  double CalcularIvestimento( double valorInvestimento) {
        // História de Usuário: Cálculo de Investimento com Juros Simples. Como usuário,
// desejo inserir um valor de investimento e visualizar, após 10 anos, o valor investido, o montante dos juros e
// o total acumulado com juros, considerando uma taxa de juros simples de 12% ao ano. Isso proporcionará uma
// compreensão clara do rendimento do investimento ao longo do tempo.
//      Critérios de Aceite:
//○ Como usuário, posso fornecer o valor do investimento como entrada para o algoritmo.
//○ O sistema deve calcular o montante dos juros simples ao longo de 10 anos, utilizando uma taxa de juos 12% ao ano.
// O sistema deve calcular o total acumulado, somando o valor inicial do investimento e o montante dos juros simples.
// O sistema deve exibir de forma clara e legível o valor investido, o montante dos juros e o total acumulado com juros após 10 anos


        // double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));

                //double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
                double taxaJuros = 0.12;
                int tempoInvestido = 10;
                double taxaJurosTotal = 0.0;

                for (int i = 1; i <= tempoInvestido; i++) {
                    taxaJurosTotal = taxaJurosTotal + taxaJuros;
                }
                double valorTotal = (valorInvestimento * taxaJurosTotal) + valorInvestimento;

                System.out.println("Valor Investido: " + valorInvestimento);
                System.out.println("Taxa de juros acumulada: " + (taxaJuros * 100) + "%");
                System.out.println("Valor Total: " + valorTotal);

        return taxaJuros;
    }// fim main

        }// fim da classe

