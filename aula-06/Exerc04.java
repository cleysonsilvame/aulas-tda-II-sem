import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    System.out.println("Digite a quantidade de valores: ");
    int qtdValores = scanner.nextInt();

    float total = 0;

    for (int i = 0; i < qtdValores; i++) {
      System.out.println("\nDigite o " + (i + 1) + "º valor: ");
      total += scanner.nextFloat();
    }

    float media = total / qtdValores;

    System.out.println("\n\nA média é: " + media);

    scanner.close();
  }
}
