import java.util.Scanner;

public class For01 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    //Lista 04
    /*
    1. Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.
    */

    int n = in.nextInt();
    int soma = 0;

    /*
    int i = 1;
    while (i <= n) {
      System.out.println(i);
      soma += i;
      i++;
    }
    */

    for (int i = 1; i <= n; i++) {
      System.out.println(i);
      soma = soma + i;  //soma += i;
    }

    System.out.println("TOTAL: " + soma);

  }
}
