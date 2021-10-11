import java.util.Random;
import java.util.Scanner;

public class Exerc11 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println(("Digite um número de 0 a 99999"));
    int numeroDoUser = scanner.nextInt();

    if (numeroDoUser < 0 || numeroDoUser > 99999) {
      System.out.println("Você digitou um número fora do esperado!");

    } else {
      System.out.println(("\n**"));
      System.out.println(("Calma ai que estou tentando acertar...\n\n"));
      long tempoInicial = System.currentTimeMillis();

      Random random = new Random();
      int key;

      do {
        key = random.nextInt(100000);
      } while (key != numeroDoUser);

      System.out.println("Ahhhh, eu, Mr. Robot acertei! Sua chave é: " + key);

      long tempoFinal = System.currentTimeMillis() - tempoInicial;
      System.out.println("Eu demorei " + (tempoFinal / 1000.0) + " segundos, nada mal né?!");

    }

    scanner.close();
  }
}
