import java.util.Scanner;

public class WhileEx01 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    /*
    float n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
    float media;

    System.out.println("Informe as notas");
    n1 = in.nextFloat();
    n2 = in.nextFloat();

    media = (n1 + n2)/2;

    System.out.println("A media entre os valores eh " + media);
    */

    /*
    VALOR_LOGICO => VERDEIRO OU FALSO, PODE SER UMA VARIAVEL, PODE SER UMA OPERACAO LOGICA A > B
    ENQUANTO/WHILE (VALOR_LOGICO) {
      // GARANTIR QUE O VALOR LOGICO EM ALGUM MOMENTO SERA FALSO, SENAO O PROGRAMA EXECUTARA EM UM LOOPING INFINITO
    }

    */
    int a = 10;
    while (a > 5) {
      System.out.println("sim ... A: " + a + " eh maior que 5");
      System.out.println("Informe um novo valor para A");
      a = in.nextInt();
    }

    System.out.println("FIM =)");
  }
}
