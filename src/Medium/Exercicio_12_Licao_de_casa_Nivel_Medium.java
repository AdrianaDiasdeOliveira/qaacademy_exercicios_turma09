package Medium;

public class Exercicio_12_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {
        int numero = 0;

        while (numero <= 100) {  // realizar a contagem ate 100

            if (numero % 2 == 0) { //% => MOD- resto da divisão -
 // verificando se o resto do número é igual a 0 (resto do número é 0 verifica que ele é par, caso contrário  sera ímpar.
                System.out.println("O numero: " + numero + " É par!");
            } else {
                System.out.println("O numero: " + numero + " É ímpar!");
            }
            numero++;  //incremento
        } // fim while
    }// fim main
}


// Corrção do Prof
     //  for(int i = 0; i<=100;i++){
     // System.out.println("O numero: " + numero + " É par!");
    //      } else {
   //               System.out.println("O numero: " + numero + " É ímpar!");
  //   }
