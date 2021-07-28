import java.util.Scanner;

public class VetoresParImpar {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int vetor[] = new int[10];

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = in.nextInt();
    }

    //pares
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 == 0) {
        System.out.println(vetor[i] + " eh par");
      }
  
    }
   
    //impares

  }
}
