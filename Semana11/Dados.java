import java.util.Scanner;

public class Dados {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    /*
      n = 5 (5 laçamentos) ** n pode ser qlqr valor > 0

      considerando um dado de 6 lados, tenho  6 variaveis
      do mesmo tipo
      com o mesmo proposito
      logicamente organizadas
      ==> vetor
      l1, l2, l3, l4, l5, l6

      n = 1
        qual lado caiu? 4
        l4++;
      n = 2
        qual lado caiu? 3
        l3++;
      n = 3
        qual lado caiu? 5
        l5++;
      n = 4   
        qual lado caiu? 4
        l4++;
      n = 5
        qual lado caiu? 2
        l2++;

      l2 = 1
      l3 = 1
      l4 = 2
      l5 = 1
    */

    System.out.println("Quantos lancamentos serao feitos?");
    int n = in.nextInt();

    int lados[] = new int[6]; //0 a 5
    // [0, 0, 0, 0, 0, 0]
    // l1 l2 l3  l4 l5 l6
 
    for (int i = 0; i < n; i++) {
      System.out.println("qual lado que caiu (1-6)?");  //1 a 6
      int caiu = in.nextInt();
      lados[caiu-1]++;  //caiu = 4      [0, 0, 0, 1, 0, 0]
      //variavel++ == variavel = variavel + 1
    }

    System.out.println("Total de cada lado");
    for (int i = 0; i < lados.length; i++) {
      System.out.println("O lado " + (i+1) + " caiu " + lados[i] + " vez(es)");
    }

  }

}
