import java.util.Scanner;


public class Condicoes {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Informe sua idade");
    int idade = in.nextInt();

    /*
      >= 60 ANDAR DE ONIBUS SEM PAGAR PASSAGEM
      >= 60 FILA PREFERENCIAL

      >= 18 PODEM TIRAR CARTEIRA DE MOTORISTA
      
      < 18 SAO PROTEGIDAS PELO ESTATUTO DA CRIACA E DO ADOLESCENTE
    */

    if (idade >= 60) {
      System.out.println("ANDAR DE ONIBUS SEM PAGAR PASSAGEM");
      System.out.println("FILA PREFERENCIAL");
    }

    if (idade >= 18) {
      System.out.println("PODEM TIRAR CARTEIRA DE MOTORISTA");
    } else {
      System.out.println("SAO PROTEGIDAS PELO ESTATUTO DA CRIACA E DO ADOLESCENTE");
    }
  }
}
