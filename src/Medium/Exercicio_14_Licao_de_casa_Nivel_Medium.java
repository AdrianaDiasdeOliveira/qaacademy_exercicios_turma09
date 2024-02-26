package Medium;

public class Exercicio_14_Licao_de_casa_Nivel_Medium {
    public  void ExibirTodasSomas () {

        //3-) Faça um algoritmo para calcular e exibir a soma de todos os números
        //de 0 a 1000. E parar se caso a soma atingir 1500(Ou mais).
        //EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar

        Integer soma = 0;
        int limite =1500;

        for (int i = 0; i <= 1000; i++) {
            soma =   i + soma;

            System.out.println("A interação : " + i  + " | Soma "+ soma);

            if(soma>=limite){
                break;
            }
        }
    }
}

       // Fluxo do While
//
//        while(i <= 1500){
//              soma = soma + i;
//
//              System.out.println("O Total somado é: " + i);
//              i++;
//          }
//          }


