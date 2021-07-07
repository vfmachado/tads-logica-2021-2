import java.util.Scanner;

public class Repeticao {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    /*
      //estrutura condicional - altera fluxo
      if (boolean) {
        //code
      }

      if / else
      if / else if / ...
      if / else if / ... / else

      switch (variavel) {
        case valor1:
          break;
        case valor2:
          break;
        case valor3:
          break;
        default:
      }


      //estruturas repeticao

      
      //repeticao indeterminada ...

        //testa depois executa
        while (boolean) {

        }


        //executa depois testa
        do {


        } while (boolean);


      //repeticao determinada
      //eu sei exatamente onde começar, quantas vezes executar e de quanto em quanto eu quero mudar
      for ( ; ; ) {

      }

    */

    //PROGRAMA REPETE O NOME DO USUARIO 5 VEZES
    for (int i = 0; i < 5; i++) {
      //codigo que esta aqui dentro
      System.out.println("[FOR] - Repetindo a msg i: " + i);
    }

    System.out.println();

    int j = 0;
    while (j < 5) {
      System.out.println("[WHILE] - Repetindo a msg j: " + j);
      j++;
    }

  }

}
