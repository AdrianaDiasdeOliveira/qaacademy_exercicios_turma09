package Medium;

public class Exercicio_15_Licao_de_casa_Nivel_Medium {
    public  void ExibirMultiplicacao () {

        // 4-) Faça um algoritmo para calcular e exibir a multiplicação de todos os
        //números de 1 a 1000. E toda vez que resultado chegar ou ultrapassar 1000,
        //faça que o resultado das multiplicações volte a ser 1

        //  int i = 1, resultadoMultiplicacao = 1;

//        while (i <= 1000) {
//            resultadoMultiplicacao = resultadoMultiplicacao * i;
//            System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);
//            if (resultadoMultiplicacao >= 1000) {
//                resultadoMultiplicacao = 1;
//            }
//            i++;
//        } // fim while
//
//    }// fim main
//}// fim classe

        int resultadoMultiplicacao = 1;

        for (int i = 1; i <= 1000; i++) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println( i + "Total das Interçãoes :"  +  "resultado das multiplicações :  "+ resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
             resultadoMultiplicacao = 1;
        }

            }
        }
    }
