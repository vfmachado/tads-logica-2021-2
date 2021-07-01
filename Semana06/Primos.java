import java.util.Scanner;

public class For01 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    int soma = 0;

    for (int valores = 2; valores <= 100; valores++) {
      int div = 0;
      for (int i = 2; i <= valores / 2; i++) {
        if (valores % i == 0) {
          div++;
          break;
        }
      }

      if (div == 0) {
        soma += valores;
        System.out.println(valores + " eh primo");
      }
    }

    System.out.println("Soma dos primos dentro do intervalo: " + soma);
  }
}
