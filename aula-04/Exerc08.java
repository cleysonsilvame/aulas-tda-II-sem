import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite a quantidadee de moedas de 25 centavos: ");
    int qtdMoedas25 = scanner.nextInt();

    System.out.println("Digite a quantidadee de moedas de 10 centavos: ");
    int qtdMoedas10 = scanner.nextInt();

    System.out.println("Digite a quantidadee de moedas de 5 centavos: ");
    int qtdMoedas5 = scanner.nextInt();

    System.out.println("\n\nO valor total do cofre é: R$ " + valorCofre(qtdMoedas25, qtdMoedas10, qtdMoedas5));

    scanner.close();
  }

  static float valorCofre(int vinteCinco, int dez, int cinco) {
    return (float) (vinteCinco * 0.25f) + (dez * 0.10f) + (cinco * 0.05f);
  }
}
