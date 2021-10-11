import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    float total = 0;
    float maiorValor = -1;
    int qtdValores = 0;

    while (true) {
      System.out.println("\nDigite um valor: ");
      float valorAtual = scanner.nextFloat();
      total += valorAtual;
      qtdValores++;
      if (valorAtual > maiorValor) {
        maiorValor = valorAtual;
      }

      System.out.println("\nDigite qualquer tecla para continuar ou 's' para sair!");
      char resposta = scanner.next().toLowerCase().charAt(0);
      if (resposta == 's') {
        break;
      }
    }

    float media = total / qtdValores;

    System.out.println("\n\nA média é: " + media);
    System.out.println("E o maior valor digitado é: " + maiorValor);

    scanner.close();
  }
}
