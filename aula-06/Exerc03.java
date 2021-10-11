import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    System.out.println("Digite o valor de um numero inteiro e positivo: ");
    int n = scanner.nextInt();

    float total = 0;

    for (int i = 1; i <= n; i++) {
      total += 1 / (float) i;
    }

    System.out.println("O resultado da soma é: " + total);

    scanner.close();
  }
}
