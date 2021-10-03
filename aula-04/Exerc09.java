import java.util.Locale;
import java.util.Scanner;

public class Exerc09 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o seu peso: ");
    float peso = scanner.nextFloat();

    System.out.println("Digite a sua altura: ");
    float altura = scanner.nextFloat();

    float imc = peso / (altura * altura);

    System.out.println("\n\nO seu IMC é: " + imc);

    scanner.close();
  }
}
