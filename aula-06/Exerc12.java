import java.util.Locale;
import java.util.Scanner;

public class Exerc12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    System.out.println("Digite um número inteiro: ");
    int num = scanner.nextInt();

    System.out.println("\n");

    for (int linha = num; linha > 0; linha--) {

      String caracteres = "";

      for (int i = 0; i < linha; i++) {
        caracteres += '*';
      }

      System.out.println(caracteres);
    }

    scanner.close();
  }
}
