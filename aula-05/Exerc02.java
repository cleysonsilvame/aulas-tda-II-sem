import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    char turno;
    int qtdHoras;

    System.out.println("Digite o turno de trabalho: ");
    turno = scanner.next().charAt(0);

    System.out.println("Digite a quantidade de horas trabalhadas: ");
    qtdHoras = scanner.nextInt();

    if (turno == 'N') {
      float salario = 45 * qtdHoras;

      System.out.println("\n\nSeu salário é R$ " + salario);
    } else {
      float salario = 37.50f * qtdHoras;

      System.out.println("\n\nSeu salário é R$ " + salario);
    }

    scanner.close();
  }
}
