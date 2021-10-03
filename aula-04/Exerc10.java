import java.util.Locale;
import java.util.Scanner;

public class Exerc10 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o valor atual da cotação do dólar: ");
    float cotacaoDolar = scanner.nextFloat();

    System.out.println("Digite o valor em reais para ser convertido: ");
    float valorReal = scanner.nextFloat();

    float valorDolar = converteDolar(valorReal, cotacaoDolar);

    System.out.println("\n\nO valor em dolar é: R$ " + valorDolar);

    scanner.close();
  }

  static float converteDolar(float valorTotal, float cotacaoDolar) {
    return valorTotal / cotacaoDolar;
  }
}
