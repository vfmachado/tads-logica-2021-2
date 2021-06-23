import java.util.Scanner;

public class SwitchCase {
  
  public static void main(String[] args) {
    
    /*
    ESTRUTURAS DE CONTROLE
    
        => ESTRUTURAS DE SELEÇÃO  

            ESTÁ ASSOCIADA AO DESVIO DO FLUXO "NATURAL/SEQUENCIAL" DAS INSTRUCOES

            if  => SELECIONA SE ... ENTRE INTERVALOS DE VALORES

            if / else if / else

            switch case   => ESCOLHA  SELEÇÃO DE VALORES DISCRETOS 

        => ESTRUTURAS DE REPETIÇÃO

            ASSOCIADA SEMPRE A ALGO QUE DEVE SER REPETIDO

    */

    //EXEMPLO MENU
    Scanner in = new Scanner(System.in);
    int op = 0;

    while (op != 4) {
      System.out.println("Selecione a opcao desejada");
      System.out.println("\t1. Depositar");
      System.out.println("\t2. Sacar");
      System.out.println("\t3. Ver saldo");
      System.out.println("\t4. Fechar aplicativo");
      System.out.print("Opcao: ");
      op = in.nextInt();

      /*
      if (op == 1) {
        System.out.println("estou depositando");
      } else if (op == 2) {
        System.out.println("saque de valor");
      } else if (op == 3) {
        System.out.println("mostrando saldo");
      } else if (op == 4) {
        System.out.println("bye");
      } else if (op == 5) {
        ...
      } else {
        System.out.println("opcao invalida");
      }
      */

      switch (op) {
        case 1:
          System.out.println("estou depositando");
          break;

        case 2:
          System.out.println("saque de valor");
          break;

        case 3:
          System.out.println("mostrando saldo");
          break;

        case 4:
          System.out.println("Bye");
          break;

        case 5:
          System.out.println("Op 5..");
          break;

        default:
          System.out.println("opcao invalida");
      }

    }
  }

}
