import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade: ");
        int qtd = scanner.nextInt();

        System.out.println("Digite seu valor: ");
        float valor = scanner.nextFloat();

        if (qtd <= 5) {
            float total = valor * qtd;
            float desconto = total - (float) (total * 0.02);
            System.out.println("\nProduto: " + nome);
            System.out.println("Total: R$ " + total);
            System.out.println("Total com desconto: R$ " + desconto);

        } else if (qtd > 5 && qtd <= 10) {
            float total = valor * qtd;
            float desconto = total - (float) (total * 0.03);
            System.out.println("\nProduto: " + nome);
            System.out.println("Total: R$ " + total);
            System.out.println("Total com desconto: R$ " + desconto);
        } else if (qtd > 10) {
            float total = valor * qtd;
            float desconto = total - (float) (total * 0.05);
            System.out.println("\nProduto: " + nome);
            System.out.println("Total: R$ " + total);
            System.out.println("Total com desconto: R$ " + desconto);
        }

        scanner.close();
    }
}
