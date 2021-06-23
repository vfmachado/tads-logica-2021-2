import java.util.Scanner;

public class For01 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    //Lista 04
    /*
    3. Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.
    */

    int n = in.nextInt();
    int div = 0;

    for (int i = 2; i <= n/2; i++) {

      //System.out.println("Testando divisao por " + i);
      //verificar se eh possivel dividir n por i
      if ( n % i == 0 ) {
        System.out.println(n + " eh divisivel por " + i);
        div++;
      }

    }

    System.out.println("Total de divisores: " + div);
    System.out.println("Veredito:");
    if (div == 0) {
      System.out.println("EHH PRIMOOO!!!");
    } else {
      System.out.println("nao foi desta vez");
    }
  }
}
