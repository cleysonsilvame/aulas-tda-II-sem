import java.util.Locale;
import java.util.Scanner;

public class Exerc09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // para usar o ponto na entrada do float ao invés de virgula.

    int qtdDados = 0;
    int somaIdade = 0;
    int qtdHomens = 0;
    float somaSalarioHomens = 0;
    int qtdMulheresComSalarioAbaixo = 0;

    while (true) {
      System.out.println("\n---------- Novo Dado ----------");
      System.out.println("\n\nDigite a idade da pessoa: ");
      int idade = scanner.nextInt();

      if (idade < 0) {
        System.out.println("\nVocê digitou uma idade negativa, então o programa será encerrado!");
        break;
      }

      System.out.println("\nDigite o sexo (M/F): ");
      char sexo = scanner.next().toUpperCase().charAt(0);

      System.out.println("\nDigite o salário: ");
      float salario = scanner.nextFloat();

      if (sexo == 'M') {
        somaSalarioHomens += salario;
        qtdHomens++;
      } else if (sexo == 'F' && salario < 600) {
        qtdMulheresComSalarioAbaixo++;
      }

      qtdDados++;
      somaIdade += idade;
    }

    try {
      System.out.println("\n\nA média de idade do grupo é: " + (somaIdade / qtdDados));
      System.out.println("A média de salário dos homens é: " + (somaSalarioHomens / qtdHomens));
      System.out.println("A quantidade de mulheres com salário abaixo de R$ 600,00 são: " + qtdMulheresComSalarioAbaixo);
    } catch (Exception e) {
      System.out.println("\n\nFim do programa!");
    }

    scanner.close();
  }
}
