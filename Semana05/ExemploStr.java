public class ExemploStr {
  public static void main(String[] args) {
    
    boolean ok;

    int a, b;
    a = 3;
    b = 5;
    ok = a == b;
    System.out.println(ok);

    a = 5;
    ok = a == b;  // if (a == b)
    System.out.println(ok);


    String t1, t2;
    t1 = "Vini";
    t2 = "Vini";

    /* EVITAR POIS EH UMA FEATURE NOVA
    ok = t1 == t2;  //funciona apenas em versoes mais novas de java
    System.out.println("t1 == t2 ? " + ok);
    */

    //maneira recomendada para comparar strings!
    ok = t1.equals(t2);
    System.out.println("t1.equals(t2) ? " + ok);
  }
}
