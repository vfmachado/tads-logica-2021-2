import java.util.Scanner;

public class SaltosOrnamentais {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    float notaMaisAlta = -1;
    String nomeMaisAlta = "";

    while (true) {

      String nome;
      float soma = 0;
      float maior = -1;
      float menor = -1;
      float gf;

      System.out.println("Digite o nome do atleta, o gf e as 7 notas");
      nome = in.next();
      if (nome.equals("FIM")) break;

      gf = in.nextFloat();

      for (int i = 0; i < 7; i++) {
        float nota = in.nextFloat();

        soma += nota;

        if (maior == -1 || nota > maior) {
          maior = nota;
        }

        if (menor == -1 || nota < menor) {
          menor = nota;
        }
      }

      soma = soma - maior - menor;
      float notaFinal = soma * gf;

      if (notaMaisAlta == -1 || notaFinal > notaMaisAlta) {
        notaMaisAlta = notaFinal;
        nomeMaisAlta = nome;
      }

      System.out.printf("Atleta %s: %.2f\n", nome, notaFinal);
    }

    System.out.println("ATLETA QUE GANHOU: " + nomeMaisAlta);
  }
}