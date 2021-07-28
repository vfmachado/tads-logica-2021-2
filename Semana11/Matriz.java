import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // VETOR
    int vetor[] = new int[5]; // UNIDIMENSIONAL

    // MATRIZ
    int matriz[][] = new int[5][5]; // BIDIMENSIONAL - QUANTIDADE DE LINHAS E COLUNAS

    // declaracao
    int[][] a;

    // inicializar
    // linha, coluna
    a = new int[3][4];

    a[0][0] = 1;
    a[0][1] = 1;
    a[0][2] = 1;
    a[0][3] = 1;

    a[1][0] = 2;
    a[1][1] = 2;
    a[1][2] = 2;
    a[1][3] = 2;

    a[2][0] = 3;
    a[2][1] = 3;
    a[2][2] = 3;
    a[2][3] = 3;

    while (true) {
      System.out.println("Informar uma linha, coluna e valor");
      int linha = in.nextInt();
      int coluna = in.nextInt();
      int valor = in.nextInt();

      a[linha][coluna] = valor;

      for (int lin = 0; lin < 3; lin++) {
        //lin = 0
        // col = 0; col = 1; col = 2; col = 3 
        int somaLinha = 0;
        for (int col = 0; col < 4; col++) {
          System.out.print(a[lin][col] + " ");
          somaLinha += a[lin][col];
        }
        System.out.println("  => " + somaLinha);
      }

    }

  }
}
