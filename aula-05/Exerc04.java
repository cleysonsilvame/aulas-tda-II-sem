import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    int codigo;
    float salarioAtual, aumento, novoSalario;

    System.out.println("Digite o código do cargo: ");
    codigo = scanner.nextInt();

    System.out.println("Digite o salário atual do funcionário: ");
    salarioAtual = scanner.nextFloat();

    switch (codigo) {
      case 1:
        aumento = salarioAtual * 0.5f;
        novoSalario = salarioAtual + aumento;

        System.out.println("\n\nO cargo é 'Escriturário'");
        System.out.println("O valor do seu aumento é: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
        break;

      case 2:
        aumento = salarioAtual * 0.35f;
        novoSalario = salarioAtual + aumento;

        System.out.println("\n\nO cargo é 'Secretário'");
        System.out.println("O valor do seu aumento é: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
        break;

      case 3:
        aumento = salarioAtual * 0.2f;
        novoSalario = salarioAtual + aumento;

        System.out.println("\n\nO cargo é 'Caixa'");
        System.out.println("O valor do seu aumento é: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
        break;

      case 4:
        aumento = salarioAtual * 0.1f;
        novoSalario = salarioAtual + aumento;

        System.out.println("\n\nO cargo é 'Gerente'");
        System.out.println("O valor do seu aumento é: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
        break;

      case 5:

        System.out.println("\n\nO cargo é 'Diretor'");
        System.out.println("Diretor não tem aumento");
        break;

      default:
        System.out.println("\n\nCódigo inválido!");
        break;
    }

    scanner.close();
  }
}
