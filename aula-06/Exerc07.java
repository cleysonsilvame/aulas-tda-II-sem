import java.util.Locale;
import java.util.Scanner;

public class Exerc07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    float somaAlturaMasculina = 0;
    int qtdMasculino = 0;
    float somaAlturaFeminina = 0;
    int qtdFeminino = 0;

    while (true) {
      System.out.println("\nDigite o sexo da pessoa (M/F): ");
      char sexo = scanner.next().toUpperCase().charAt(0);

      System.out.println("\nDigite sua altura: ");
      float altura = scanner.nextFloat();

      if (sexo == 'M') {
        somaAlturaMasculina += altura;
        qtdMasculino++;
      } else if (sexo == 'F') {
        somaAlturaFeminina += altura;
        qtdFeminino++;
      }

      System.out.println("\nDigite qualquer letra para continuar ou 's' para sair!");
      char resposta = scanner.next().toLowerCase().charAt(0);
      if (resposta == 's') {
        break;
      }
    }

    System.out.println("\n\nA média de altura masculina é: " + somaAlturaMasculina / qtdMasculino);
    System.out.println("A média de altura feminina é: " + somaAlturaFeminina / qtdFeminino);

    scanner.close();
  }
}
