import java.util.Locale;
import java.util.Scanner;

public class Exerc07 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o número de pregos telheiro vendidos: ");
    float pregosTelheiro = scanner.nextFloat();

    System.out.println("Digite o número de pregos quadrado vendidos: ");
    float pregosQuadrado = scanner.nextFloat();

    float valorTotalVendido = (pregosTelheiro * 1.05f) + (pregosQuadrado * 0.51f);
    float valorComissão = valorTotalVendido * 0.1f;

    System.out.println("\n\nO valor total arrecadado é: R$ " + valorTotalVendido);
    System.out.println("O valor da comissão é: R$ " + valorComissão);

    scanner.close();
  }
}
