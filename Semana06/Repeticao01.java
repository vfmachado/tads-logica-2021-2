import java.util.Scanner;

public class Repeticao01 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    //WHILE - repeticoes indeterminadas
    System.out.println("\nWHILE");
    int i = 0;
    while (i < 10) {
      System.out.println("Valor " + i);
      i++;
    }

    //ex, pedir uma senha
    //DO ... WHILE
    System.out.println("\nDO.. WHILE");
    i = 0;
    do {
      System.out.println("Valor " + i);
      i++;
    } while (i < 10);


    // FOR
    System.out.println("\nFOR");
    //INICIALIZACAO; CONDIÇÃO; PASSO
    /*
      incializacao: configuracao inicial, normalmente, declarando uma variavel
        caso declarada uma nova variavel, o escopo dela (onde ela existe) é apenas dentro do for

      condicao / valor logico : indica se o laço deve continuar repetindo ou não... 

      passo / incremento : logica que, normalmene, altera o valor utilizado na condição

      *** TODOS OS PARAMETROS DO FOR SAO OPCIONAIS
    */
    for (int j = 0; j < 10; j++ /* j = j + 1 */) {
      System.out.println("Valor " + j);
    }
    

    for (;; i++) {
      System.out.print("Laco infinito " + i);
      if (i >= 1000) {
        break;  //BREAK IRA QUEBRAR (PARAR) O LAÇO DE REPETIÇÃO
      }
      //LOGICA PARA TODOS OS VALORES EXCETO OS MAIORES OU IGUAIS A MIL (POR CONTA DO BREAK)
      System.out.println(" ... DEPOIS DO BREAK");
    }
  }
}
