import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {
    
    //in => entrada
    //teclado
    //entrada
    //scanner
    Scanner in = new Scanner(System.in);

    //VARIAVEL
    /*
    um espaco na memoria nomeado; 
    */
    //TIPO nome da variável;
    int matricula;  //declaracao de variavel
    String nome;  

    //final indica uma constante =)
    final String cpf; //declarei  uma constante

    cpf = "123.123.123-12";
    
    matricula = 123;
    matricula = 321;

    //declarando e inicializando
    int idade = 29;

    //SEQUENCIAS LOGICAS PARA A SOLUÇÃO DE UM PROBLEMA
    System.out.println("Olaaa!!! Digite seu nome");

    //ler uma string => 1 palavra
    nome = in.next();

    System.out.print("Ahhh legal " + nome + ", prazer em te conhecer. Qual a sua idade? ");
    idade = in.nextInt();


    int dobro = idade * 2;

    //8 casas depois da virgula
    float real = 0.1f + 0.2f;

    //sao muitas
    double tbmEhReal = 0.1 + 0.2;

    System.out.println("OI " + nome + ", ouvi dizer que o dobro de " + idade + " e' " + dobro);
   
    System.out.printf("FLOAT:  %.8f\n", real);
    System.out.printf("DOUBLE: %.30f\n", tbmEhReal);

  }

}
