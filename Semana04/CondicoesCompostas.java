import java.util.Scanner;



public class CondicoesCompostas {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Informe sua idade");
    int idade = in.nextInt();

    //verificar apenas as pessoas com idade entre 18 e 40   [18, 40]
    if (idade >= 18) {
      if (idade <= 40) {

      }
    }

    if (idade >= 18 && idade <= 40) {

    }


    //idade e' menor que 18 ou e' maior que 40    [0, 18]U[40, inf)
    if (idade <= 18) {
      //code 
    }
    if (idade >= 40) {
      //code
    }

    if (idade <= 18 || idade >= 40) {

    }


    //bloco unico
    if (idade <= 18) {
      //se acontecer o que tem aqui
    } else if (idade >= 40) {
      //esse nao acontece - nem chega a testar
    }


    
    /**
     * OPERADORES LOGICOS
     *  ELES PERMITEM OPERAR VALORES BOOLEANOS
     * 
     * E    &&    => RESULTADO SO' E' VERDADEIRO QUANDO AMBOS SAO VERDADEIROS
     * 
     *    COND1 && COND2 => COND1 == TRUE E COND2 == TRUE
     * 
     * OU   ||    => RESULTADO SO' E' FALSO QUANDO AMBOS SAO FALSOS
     *                E' VERDADEIRO SE PELO MENOS 1 FOR VERDADEIRO
     * 
     *    COND1 || COND2 => BASTA QUE UMA DAS CONDICOES SEJA VERDADEIRA
     * 
     */
    
  }
}
