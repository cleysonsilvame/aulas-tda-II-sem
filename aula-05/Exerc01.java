import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    int numero;

    System.out.println("Digite um número: ");
    numero = scanner.nextInt();

    if (numero >= 0 && numero <= 10) {
      System.out.println("\n\nvalor correto!");

    } else {
      System.out.println("\n\nvalor incorreto!");
    }

    scanner.close();
  }
}
