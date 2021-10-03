import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float valorBolsa;
    int tempoEstagio;

    System.out.println("Digite o valor da bolsa do estagiário: ");
    valorBolsa = scanner.nextFloat();

    System.out.println("Digite o seu tempo de estágio: ");
    tempoEstagio = scanner.nextInt();

    if ((valorBolsa >= 750f && valorBolsa <= 950f) && (tempoEstagio >= 2)) {
      System.out.println("\n\nParticipará do treinamento!");
    } else {
      System.out.println("\n\nNão participará!");
    }

    scanner.close();
  }
}
