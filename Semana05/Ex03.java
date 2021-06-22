import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
  
    //PROGRAMA QUE SIMULE AS OPERACOES DE SAQUE E DEPOSITO EM UMA CONTA BANCARIA
    //O PROGRAMA TEM 4 OPCOES, SACAR, DEPOSITAR, SALDO, SAIR
    Scanner in = new Scanner(System.in);
    int op = 0;
    float saldo = 0;

    while (op != 4) {
      System.out.println("Selecione a opcao desejada");
      System.out.println("\t1. Depositar");
      System.out.println("\t2. Sacar");
      System.out.println("\t3. Ver saldo");
      System.out.println("\t4. Fechar aplicativo");
      System.out.print("Opcao: ");
      op = in.nextInt();

      //if else verificando a opcao e fazendo as contas
      //...
    }

  }

}
