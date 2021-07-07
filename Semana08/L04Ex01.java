import java.util.Scanner;

public class L04Ex01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int soma = 0;
    for (int i = 1; i <= n; i++) {
      soma = soma + i;  //soma += i;
      // System.out.println("i: " + i + " soma: " + soma);
    }
    System.out.println(soma);

    System.out.println("\nEX 2");
    soma = 0;
    for (int i = 2; i <= n; i += 2) {
      soma = soma + i;  //soma += i;
      // System.out.println("i: " + i + " soma: " + soma);
    }
    System.out.println(soma);


    System.out.println("\nEX 3");
    int div = 0;
    for (int i = 2; i < n/2; i++) {
      if (n % i == 0) {
        div++;
        break;
      }
    }

    if (div == 0) {
      System.out.println("Eh primo");
    } else {
      System.out.println("nao eh primo");
    }


    System.out.println("\nQuantos divisores tem N?");
    div = 2;
    for (int i = 2; i <= n/2; i++) {
      System.out.println("Testando se " + n + " eh divisivel por " + i);
      if (n % i == 0) {
        div++;
        System.out.println(" e eh neh!? =D");
      }
      System.out.println("total de divs: " + div);
    }
    System.out.println("Total: " + div);

  }
}
