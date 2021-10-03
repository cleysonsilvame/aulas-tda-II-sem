import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o valor do produto: ");
    float valorProduto = scanner.nextFloat();

    System.out.println("Digite a quantidade de parcelas: ");
    int qtdParcelas = scanner.nextInt();

    float resultado = calculaJuros(valorProduto, qtdParcelas);

    System.out.println("\n\nO valor da parcela é R$ " + resultado);

    scanner.close();
  }

  static float calculaJuros(float valor, int qtdParcelas) {
    float juros = 0f;

    if (qtdParcelas > 1) {
      juros = valor * 0.05f;
    }

    return (juros + valor) / qtdParcelas;
  }
}
