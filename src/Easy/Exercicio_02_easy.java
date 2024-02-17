package Easy;

import javax.swing.*;

public class Exercicio_02_easy {

    public static void main(String[] args) {
        //  História de Usuário: Leitura e Exibição de Palavra

        String palavra = JOptionPane.showInputDialog("Digite uma Palavra: ");
        while (!palavra.equals("sair")){
         System.out.println("Você digitou:" + palavra);
             palavra = JOptionPane.showInputDialog("Digite uma Palavra: ");
    }
}
}

