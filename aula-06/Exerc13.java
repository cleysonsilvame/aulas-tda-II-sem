import java.util.Scanner;

public class Exerc13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro ímpar: ");
    int numeroUsuario = scanner.nextInt();
    int controleEspaco = numeroUsuario / 2;

    if (numeroUsuario % 2 == 0) {
      System.out.println("Você digitou um número não impar!");
    } else {

      for (int linha = 1; linha < numeroUsuario; linha += 2) {
        String espaco = " ".repeat(controleEspaco);
        String asterisco = "*".repeat(linha);

        controleEspaco--;
        System.out.println(espaco + asterisco);
      }

      for (int linha = numeroUsuario; linha > 0; linha -= 2) {
        String espaco = " ".repeat(controleEspaco);
        String asterisco = "*".repeat(linha);

        controleEspaco++;
        System.out.println(espaco + asterisco);
      }
    }
    scanner.close();
  }
}
