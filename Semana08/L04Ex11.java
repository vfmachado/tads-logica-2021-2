import java.util.Scanner;

public class L04Ex11 {
  public static void main(String[] args) {
    
    /*
Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
    */

    Scanner in = new Scanner(System.in);
    int v1, v2;

    // INTERESSANTE   
    // double a = 0.1
    // double b = 0.2;
    // double c = a + b;
    // System.out.println(c);
    // System.out.println(c == 0.3);

    System.out.println("Informe o primeiro valor");
    v1 = in.nextInt();

    do {
      System.out.println("Informe o segundo valor");
      v2 = in.nextInt();
    } while (v2 == 0);

    float resultado = ((float) v1)/v2;
    System.out.printf("%d/%d = %.1f\n", v1, v2, resultado);
  }
}
