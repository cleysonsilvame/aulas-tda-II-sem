import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.print("Digite o salario: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o valor de vendas: ");
        float vendas = scanner.nextFloat();

        float comissao = (float) (0.04 * vendas);
        float salarioFinal = salario + comissao;

        System.out.println("Valor da coissão: R$" + comissao);
        System.out.println("Salario com a comissão: R$" + salarioFinal);

        scanner.close();
    }
}
