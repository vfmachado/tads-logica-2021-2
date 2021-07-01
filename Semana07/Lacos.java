import java.util.Scanner;

public class Lacos {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    /*

    lado = 4;

    * * * *
    * * * *
    * * * *
    * * * *


    lado = 2

    * *
    * *

    ...


    */

    int lado;

    do {
      System.out.println("Informe o valor para o lado do quadrado");
      lado = in.nextInt();    
      
      for (int j = 0; j < lado; j++) {
    
        for (int i = 0; i < lado; i++) {
          System.out.print("* ");
        }

        System.out.println();
      }  
    } while (lado != 0);

  }

}
