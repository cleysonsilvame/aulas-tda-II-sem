import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float valorA, valorB, valorC;

    System.out.println("Digite o valor de 'A': ");
    valorA = scanner.nextFloat();

    System.out.println("Digite o valor de 'B': ");
    valorB = scanner.nextFloat();

    System.out.println("Digite o valor de 'C': ");
    valorC = scanner.nextFloat();

    float delta = valorB * valorB - 4 * valorA * valorC;

    if (delta < 0) {
      System.out.println("\n\nNão existem raízes negativas");
    } else {
      float x1 = (float) (-valorB + Math.sqrt(delta)) / 2 * valorA;
      float x2 = (float) (-valorB - Math.sqrt(delta)) / 2 * valorA;

      System.out.println("\n\nO valor de x1 é: " + x1);
      System.out.println("O valor de x2 é: " + x2);

    }

    scanner.close();
  }
}
