import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite a quantidade de mercadorias no estoque: ");
        int mercadorias = scanner.nextInt();

        System.out.println("Digite o valor de cada mercadoria: ");
        float valor = scanner.nextFloat();

        float total = mercadorias * valor;

        System.out.println("\nValor total: R$" + total);
        System.out.println("Média do valor das mercadorias: R$" + total / mercadorias);

        scanner.close();
    }
}
