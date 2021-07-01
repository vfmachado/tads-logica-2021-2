import java.util.Scanner;

public class Uri2031 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    //for (int i = 0; i < n; i++) {
    while (n-- > 0) {

      String j1, j2;

      j1 = in.next();
      j2 = in.next();

      switch (j1) {
        case "ataque":
          switch (j2) {
            case "pedra":
            case "papel":
              System.out.println("Jogador 1 venceu");
              break;
            case "ataque":
              System.out.println("Aniquilacao mutua");
          }
          break;
      }
      if (j1.equals("ataque")) {
        
        if(j2.equals("pedra")) {
          System.out.println("Jogador 1 venceu");
        } else if (j2.equals("papel")) {
          System.out.println("Jogador 1 venceu");
        } else {
          System.out.println("Aniquilacao mutua");
        }
      }

      /* REESCREVER ...
      if (j1.equals("papel")) {
        
        if(j2.equals("pedra")) {
          System.out.println("Jogador 1 venceu");
        } else if (j2.equals("papel")) {
          System.out.println("Jogador 1 venceu");
        } else {
          System.out.println("Jogador 2 venceu");
        }
      }


      if (j1.equals("pedra")) {
        
        if(j2.equals("pedra")) {
          System.out.println("Jogador 1 venceu");
        } else if (j2.equals("papel")) {
          System.out.println("Jogador 1 venceu");
        } else {
          System.out.println("Aniquilacao mutua");
        }
      }
      */

    }
  } 

}