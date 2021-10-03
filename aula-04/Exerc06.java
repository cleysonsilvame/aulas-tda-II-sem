import java.util.Locale;
import java.util.Scanner;

public class Exerc06 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o valor do produto: ");
    float valorProduto = scanner.nextFloat();

    float valorComDesc = valorProduto - (valorProduto * 0.09f);

    System.out.println("\n\nO valor do produto com 9% de desconto é: " + valorComDesc);

    scanner.close();
  }
}
