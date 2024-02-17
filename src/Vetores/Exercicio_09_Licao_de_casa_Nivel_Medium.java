package Vetores;

import javax.swing.*;
import java.util.Random;

public class Exercicio_09_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {

        //    09-)Faça um algoritmo para: Criar dois vetores.
        // Em um vetor: ler e armazenar o nomes de alunos.No outro vetor: ler e atribuir randomicamente a numera&ccedil;&atilde;o de cada aluno,
        //de acordo com a ordem inserida no vetor de nomes.E exiba, o Nome e o número correspondente de cada um.
        // Numeros randomicos com java: // Cria uma instância da classe Random
        // Random random = new Random();// Gera um número aleatório entre 0 (inclusive) e 100 (exclusivo)
        //int numeroAleatorio = random.nextInt(101)

        String[] nomeAlunos = new String[6];
        int[] numeroAlunos = new int[6];
        Random random = new Random();
        for (int i = 0; i < nomeAlunos.length; i++) {
            nomeAlunos[i] = JOptionPane.showInputDialog("Digite um nome para o " + (i + 1) + "º aluno: ");
            numeroAlunos[i] = random.nextInt(100);
            System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
        }
        if (nomeAlunos[0] == null || nomeAlunos[0].isEmpty()) {
            System.out.println("Não há alunos para serem mostrados");
        } else {
            for (int i = 0; i < nomeAlunos.length; i++) {
                System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
            }
        }

    }
}