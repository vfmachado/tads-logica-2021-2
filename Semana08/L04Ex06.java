import java.util.Scanner;

public class L04Ex06 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    /*
    6. Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após a leitura do valor, escrever o valor lido na tela.
    */

    int valor;
    boolean continuar;
    do {
      System.out.println("Hey usuario, diga qual o valor")
      ;
      valor = in.nextInt();

      continuar = valor < 1 || valor > 10;
      if (continuar) {
        System.out.println("hmmm, nao aceito!");
      } 

    } while(continuar);
     
    System.out.println("Valor digitado: " + valor);
        
  }
}
