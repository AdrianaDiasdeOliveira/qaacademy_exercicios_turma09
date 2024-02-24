package Instancia_Classe;

public class Execucao {


    public static void main(String[] args) {

        Exercicio_Instancia objinstancia = new Exercicio_Instancia();

        System.out.println(objinstancia.nome);
        System.out.println(objinstancia.texto);

        objinstancia.metodoUm();
        objinstancia.metodoDois();
        objinstancia.metodoTres();
    }
}
