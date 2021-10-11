import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    int qtdAprovados = 0;
    int qtdNotas = 80;
    float total = 0;

    for (int i = 0; i < qtdNotas; i++) {
      System.out.println("\nDigite a nota do " + (i + 1) + "º aluno: ");
      float notaAtual = scanner.nextFloat();

      while (notaAtual < 0 || notaAtual > 10) {
        System.out.println("\nVocê digitou uma nota inválida!");
        System.out.println("Por favor, digite uma nota entre 0 e 10: ");
        notaAtual = scanner.nextFloat();
      }

      if (notaAtual >= 6) {
        qtdAprovados++;
      }

      total += notaAtual;
    }

    float media = total / qtdNotas;

    System.out.println("\n\nA quantidade de aprovados são: " + qtdAprovados);
    System.out.println("A média das notas é: " + media);

    scanner.close();
  }
}
