package Instancias_Metodos;

import com.sun.tools.javac.Main;

public class MetodoComParametros {


  public static void metodoUmSemRetorno(String nome) {
      System.out.println(nome);

  }
      public static String metodoUmComRetorno (String nome){
          return " O parametro enviado é " + nome;
      }
      public static void metodoDoisSemRetorno (String nome){
          System.out.println(nome);

      }
      public static String metodoDoisComRetorno (String nome){

      return " O parametro enviado é " + nome;
      }


      public static void metodoTresSemRetorno (String nome){
          System.out.println(nome);

      }
      public static String metodoTresComRetorno (String nome)
      {
          return " O parametro enviado é " + nome;
      }

      public static void metodoQuatroSemRetorno (String nome){
          System.out.println(nome);

      }
      public static String metodoQuatroComRetorno (String nome)      {
          return " O parametro enviado é " + nome;
      }


      public static void metodoCincoSemRetorno (String nome){
          System.out.println(nome);

      }
      public static String metodoCincoComRetorno (String nome){
          return " O parametro enviado é " + nome;
      }


      public static void main (String[]args){
          System.out.println(metodoUmComRetorno("Adriana"));
          System.out.println(metodoDoisComRetorno("Adnys"));
          System.out.println(metodoTresComRetorno("Flavio"));
          System.out.println(metodoQuatroComRetorno("Jesse"));
          System.out.println(metodoCincoComRetorno("Valeria"));

      metodoUmSemRetorno("Adriana -1");
      metodoDoisSemRetorno("Adnys - 2");
      metodoTresSemRetorno("Flavio - 3");
      metodoQuatroSemRetorno("Jesse - 4 ");
      metodoCincoSemRetorno("Valeria- 5");
      }

  }


