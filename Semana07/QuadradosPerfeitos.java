import java.util.Scanner;

public class QuadradosPerfeitos {
  
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    /*
      80 => ??   ( x * x == 80 )
      81  => 9  * 9            
      144 => 12 * 12
      225 => 15 * 15

      2 * 2 = 4
      3 * 3 = 9
      4 * 4 = 16
      5..
      ...
      9 * 9 = 81
    */

    int numero = in.nextInt();

    int teste = 1;
    int mult;
    boolean quadrado = false;

    do {

      mult = teste * teste;

      if (mult == numero) {
        quadrado = true;
      } 

      teste++;  

    } while (mult < numero);


    /*
    if (quadrado) {
      System.out.println("Sim, e' quadrado perfeito");
    } else {
      System.out.println("oops... nao eh");
    }
    */

    /*
    System.out.println(quadrado ? 
      "Sim, e' quadrado perfeito" 
      : "oops... nao eh");
    */

    String msg = quadrado ? "Sim, e' quadrado perfeito" : "oops... nao eh";
    System.out.println(msg);
  }


}
