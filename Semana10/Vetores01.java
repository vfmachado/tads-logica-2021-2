import java.util.Scanner;

public class Vetores01 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    /*
      lista de compras
        ir até o produto
        selecionar e colocar no carrinho
        pagar
          [p1, p2, p3, p4, p5, p6 ...] => soma tudo e te dá aquele susto
    */

    /*
      media claudia
      media kat
      media lucas
      media jose
      media leandro
      media lorrana
      ...
    */


    /*
      media de 5 notas
      guardando cada uma das notas
    */

    float n1, n2, n3, n4, n5;
    //ARRAY / VETOR
    /*  
      
      EH UMA ESTRUTRA QUE PERMITE GUARDAR MULTIPLOS VALORES DO MESMO TIPO!

      NOTAS = [10, 9, 7, 9, 10];

      //DECLARAR
      int [] nome;

      //INSTANCIAR OU INICIALIZAR
      nome = new int[10];   //quantos valores serão armazenados

    */

    float [] notas = new float[5];  //tamanho = 5, posicoes de 0 a 4.

    //String nomes[];
    String[] nomes;

    //int [] a, b, c; //a, b e c são vetores
    //int a[], b, c;  //apenas a eh vetor
    
    int tamanho = in.nextInt();
    nomes = new String[tamanho];

    // .length => tamanho do vetor

                                //tamanho = nomes.length
    for (int posicao = 0; posicao < nomes.length; posicao++) {
      System.out.print("Informe o  nome " + posicao + ": ");
      nomes[posicao] = in.next();
    }
    
    System.out.println("\n=== INVERSO ===\n");
    for (int i = tamanho-1; i >= 0; i--) {
      System.out.println(nomes[i]);
    }
   

    /*
    System.out.println("\n=== INVERSO ===\n");
    System.out.println(nomes[9]);
    System.out.println(nomes[8]);
    System.out.println(nomes[7]);
    System.out.println(nomes[6]);
    System.out.println(nomes[5]);
    System.out.println(nomes[4]);
    System.out.println(nomes[3]);
    System.out.println(nomes[2]);
    System.out.println(nomes[1]);
    System.out.println(nomes[0]);
    */

  }
}
