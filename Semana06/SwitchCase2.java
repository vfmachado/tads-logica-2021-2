import java.util.Scanner;

public class SwitchCase {
  
  public static void main(String[] args) {
    
    

    //EXEMPLO MENU
    Scanner in = new Scanner(System.in);
    char op = in.next().charAt(0);
   
    if (op == 'a' || 
        op == 'e' || 
        op == 'i' || 
        op == 'o' || 
        op == 'u'
    ) {

    }

    switch (op) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("Qlqr vogal");

      
      default:
        System.out.println("nao e' vogal");
    }

    
  }

}
