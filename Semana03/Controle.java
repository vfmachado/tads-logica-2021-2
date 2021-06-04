import java.util.Scanner;

public class Controle {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Funciona o controle.java");

    final int SENHA_CORRETA = 123;
    int senha;

    System.out.println("Informe a senha");
    senha = in.nextInt();

    //MOSTRAR UMA MENSAGEM SE A SENHA INFORMADA E IGUAL OU NAO A SENHA CORRETA

    /*
    OPERADORES RELACIONAIS
     5 >  2   => TRUE (BOOLEAN) 
     2 >= 3   => FALSE (BOOLEAN)
       <
       <=
       ==
       !=

    */
    boolean resultado;
    resultado = senha == SENHA_CORRETA;

    /*
    ESTRUTURA DE CONTROLE
    CONDICIONAL
      PERMITE A ALTERACAO DO FLUXO DO NOSSO CODIGO
      SE (CONDICAO OU VALOR BOOLEANO) ENTAO
        CODIGO
      FIM-SE

      if ( valor_logico ) {

      }


      SE ...
      SENAO   

      if () {

      } else {

      }

      **observem que o senao (else) NAO possui condicao...
    */

    if (resultado) {
      System.out.println("Acesso concedido (if)");
    }

    if (resultado == false) {
      System.out.println("Acesso bloqueado (if)");
    }


    if (resultado) {
      System.out.println("Acesso concedido (if-else)");
    } else {
      System.out.println("Acesso bloqueado (if-else)");
    }


    /*
    CUIDADO ESPECIAL AO COMPARAR STRINGS

    String a = "123123";
    String b = "4123123";

    a == b => NAO FUNCIONA!

    a.equals(b) => retorna true/false
    a.equals("5214241") => tbm funciona

    */
    
    //System.out.println(resultado);

  }
}
