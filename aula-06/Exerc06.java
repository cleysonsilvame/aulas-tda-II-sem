import java.util.Locale;
import java.util.Scanner;

public class Exerc06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    int qtdPositivos = 0;
    int qtdNegativos = 0;
    float menorValor = 0;

    while (true) {
      System.out.println("\nDigite um valor: ");
      float valorAtual = scanner.nextFloat();

      if (valorAtual > 0) {
        qtdPositivos++;
      } else if (valorAtual < 0) {
        qtdNegativos++;
      }

      if (valorAtual < menorValor) {
        menorValor = valorAtual;
      }

      System.out.println("\nDigite qualquer tecla para continuar ou 's' para sair!");
      char resposta = scanner.next().toLowerCase().charAt(0);
      if (resposta == 's') {
        break;
      }
    }

    System.out.println("\n\nA quantidade de valores positivos são: " + qtdPositivos);
    System.out.println("A quantidade de valores negativos são: " + qtdNegativos);
    System.out.println("E o menor valor é: " + menorValor);

    scanner.close();
  }
}
