import java.util.Scanner;

public class WhileEx02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 1;

    //condicao => enquanto verdadeiro, executa, quando falso, termina o laco de repeticao
    System.out.println("LACO 1: Mostrando uma mensagem com o numero N vezes");
    while (n <= 5) {
      System.out.println("EXECUTEI " + n + " vezes");
      n++;  //n = n + 1
    }
    
    System.out.println("\n\nLACO 2: Mostrar os numeros de maneira decrescente");
    n = 5;
    while (n > 0) {
      System.out.println("Valor de n: " + n);
      n--;  //n = n - 1;
    }

    //o programa continua executando fora do laco normalmente!!!
    System.out.println("\n\nSOMA DE 5 valores");
    int soma = 0;
    int valor;
    n = 1000;
    while (n < 1005) {
      System.out.println("Informe um valor");
      valor = in.nextInt();
      soma = soma + valor;
      n++;
    }
    System.out.println("Soma total: " + soma);

  }
}
