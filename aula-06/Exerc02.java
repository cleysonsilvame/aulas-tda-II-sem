
public class Exerc02 {

  public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 100; i++) {
      if (i <= 50) {
        System.out.println(i);
      } else {
        if (i % 2 == 0) {
          System.out.println(i);
        }
      }
    }
  }
}
