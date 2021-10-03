import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float ladoA, ladoB;

    System.out.println("Digite o lado 'A' do triângulo: ");
    ladoA = scanner.nextFloat();

    System.out.println("Digite o lado 'B' do triângulo: ");
    ladoB = scanner.nextFloat();

    System.out.println("\n\nA área do triângulo é: " + calculaArea(ladoA, ladoB));

    scanner.close();
  }

  static float calculaArea(float ladoA, float ladoB) {
    return ladoA * ladoB;
  }
}
