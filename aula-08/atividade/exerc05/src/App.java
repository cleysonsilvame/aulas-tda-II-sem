import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        float somaSalario = 0;
        float somaFilhos = 0;
        int qtdSalariosBaixo = 0;

        ArrayList<Float> salarios = new ArrayList<Float>();
        ArrayList<Float> filhos = new ArrayList<Float>();

        while (true) {

            System.out.print("\nDigite o salario do habitante: ");
            float salario = scanner.nextFloat();

            if (salario <= 0) {
                System.out.println("\nSalário inválido!");
                break;
            }

            System.out.print("Digite a quantidade de filhos: ");
            float qtdFilhos = scanner.nextInt();

            somaSalario += salario;
            somaFilhos += qtdFilhos;
            salarios.add(salario);
            filhos.add(qtdFilhos);

            if (salario < 150) {
                qtdSalariosBaixo++;
            }

            System.out.print("\nDeseja continuar? (S/N): ");
            char continuar = scanner.next().toUpperCase().charAt(0);
            if (continuar == 'N') {
                break;
            }
        }

        System.out.println("\n\nMedia de salário da população: " + somaSalario / salarios.size());
        System.out.println("Média de filhos: " + somaFilhos / filhos.size());
        System.out.println("O maior salário é R$" + Collections.max(salarios));
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: "
                + (qtdSalariosBaixo * 100) / salarios.size() + "%");

        scanner.close();
    }
}
