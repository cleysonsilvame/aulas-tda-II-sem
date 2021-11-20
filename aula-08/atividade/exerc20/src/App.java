import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        for (int i = 0; i < 10; i++) {
            System.out.print("\n\nDigite o salario: ");
            double salario = scanner.nextDouble();

            if (salario > 0 && salario <= 1500) {
                System.out.println("\nReceberá um aumento de 10% sobre o salario atual!");
                System.out.println("Novo salario : " + (salario + (0.10 * salario)));

            } else if (salario > 1500 && salario <= 3000) {
                System.out.println("\nReceberá um aumento de 2% sobre o salario atual!");
                System.out.println("Novo salario : " + (salario + (0.02 * salario)));

            } else {
                System.out.println("\nNão receberá o aumento!");
            }

        }

        scanner.close();
    }
}
