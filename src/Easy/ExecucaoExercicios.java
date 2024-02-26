package Easy;

import Medium.Exercicio_11_Licao_de_casa_Nivel_Medium;

import javax.swing.*;

public class ExecucaoExercicios {
    public static void main(String[] args) {

        // Exercicio_02_easy
        // Exercicio_02_easy exercicio02Easy = new Exercicio_02_easy();
        // String palavraDigitada= exercicio02Easy.exibirPalavra(" Adriana Dias");
        // System.out.println (palavraDigitada);


        //Exercicio_03_easy
 /*  String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Valor: ");
     String valor2 = JOptionPane.showInputDialog("Digite o Segundo Valor: ");
     Exercicio_03_easy exercicio03Easy = new Exercicio_03_easy();
     System.out.println(exercicio03Easy.armazenarValoresTrocados(valor1 , valor2));*/


        //Exercicio_04_easy
/*      String numeroDigitado = JOptionPane.showInputDialog("Digite o Número Inteiro:");
        int  numero1 = Integer.parseInt(numeroDigitado); // Conversão e atribuição na variavel numeroDigitado
        Exercicio_04_Licao_de_casa exercicio04Easy = new Exercicio_04_Licao_de_casa();
        System.out.println("O dobro do valor de: " + numero1 + " é " + exercicio04Easy.calcularDobro(numero1));*/


//Exercicio_05_easy

/*
        String primeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Número: ");
        String segundoNumero = JOptionPane.showInputDialog("Digite o Segundo  Número: ");
        String terceiroNumero = JOptionPane.showInputDialog("Digite o Terceiro Número: ");

        int num1 = Integer.parseInt(primeiroNumero);//Conversão da variavel primeiroNumero / segundoNumero /terceiroNumero para Inteiro.
        int num2 = Integer.parseInt(segundoNumero);
        int num3 = Integer.parseInt(terceiroNumero);

        Exercicio_05_Licao_de_casa exercicio_05_easy = new Exercicio_05_Licao_de_casa();
        System.out.println( "A soma dos numeros Digitados será: " + exercicio_05_easy.exibirSoma(num1,num2,num3));
        System.out.println( "A Subtração dos numeros Digitados será: " + exercicio_05_easy.exibirSubitracao(num1,num2));
        System.out.println( "A Multiplicação dos numeros Digitados será: " + exercicio_05_easy.exibirMultiplicacao(num1,num2,num3));
        System.out.println( "A Media dos numeros Digitados será: " + exercicio_05_easy.exibirMedia(num1,num2,num3));

*/
        //Exercicio_06_easy

  /*      String primeiraNota = JOptionPane.showInputDialog("Digite a 1º Nota :");
        String SegundaNota = JOptionPane.showInputDialog("Digite a 2º Nota :");

        double nota1 = Double.parseDouble(primeiraNota); // Conversão e atribuição na variavel primeiraNota / SegundaNota
        double nota2 = Double.parseDouble(SegundaNota);

        Exercicio_06_Licao_de_casa exercicio_06_Licao_de_casa = new Exercicio_06_Licao_de_casa();
        System.out.println(exercicio_06_Licao_de_casa.CalcularMedia(nota1 ,nota2));

*/

        //Exercicio_09_easy

    /*    String numeroDigitado = JOptionPane.showInputDialog("Digite o Número para a Tabuada : ");
        int numero = Integer.parseInt(numeroDigitado);
        Exercicio_09_Licao_de_casa exercicio_09_Licao_de_casa = new Exercicio_09_Licao_de_casa();
        exercicio_09_Licao_de_casa.calcularTabuada(numero);*/


       //   Exercicio_10_Licao_de_casa
/*        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
        Exercicio_10_Licao_de_casa  exercicio_10_Licao_de_casa = new Exercicio_10_Licao_de_casa();
        exercicio_10_Licao_de_casa.CalcularIvestimento(valorInvestimento);*/

       // Exercicio_11_Licao_de_casa_Nivel_Medium
         Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
        Exercicio_11_Licao_de_casa_Nivel_Medium exercicio_11_Nivel_Medium = new Exercicio_11_Licao_de_casa_Nivel_Medium();
        System.out.println(exercicio_11_Nivel_Medium.LerInteiro(numeroDigitado));
    }
}