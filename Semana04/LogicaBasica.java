import java.util.Scanner;

public class LogicaBasica {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Quanto km/l seu carro faz na estrada?");
    final int KM_L = in.nextInt();

    System.out.println("Qual a distancia da viagem pretendida?");
    //float distancia = 50.0f;  //0.f so' pq e' float
    float distancia = in.nextFloat();

    //declaracao
    float litrosNecessarios;
    //logica - inicializacao da variavel
    litrosNecessarios = distancia / KM_L;
    System.out.println("Litros necessarios " + litrosNecessarios);

    System.out.println("Qual o valor da gasolina?");
    float precoGasolina = in.nextFloat();

    //declaracao + inicializacao (logica)
    float custoViagem = litrosNecessarios * precoGasolina;
    System.out.printf("Valor total da viagem:\n\t====> R$%.2f\n", custoViagem);

    /*
      5 / 2    => e' uma divisao entre inteiros, logo resultado e' inteiro
      5.0f / 2 => e' uma divisao de float por inteiro, resultado float
    */
    //System.out.println(5.0f/2);
  }
}
