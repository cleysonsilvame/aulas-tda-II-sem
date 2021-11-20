import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite o código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.println("Ano de nascimento: ");
        int anoDeNascimento = scanner.nextInt();

        System.out.println("Digite o ano que ingressou na empresa: ");
        int entradaEmpresa = scanner.nextInt();

        int idade = LocalDate.now().getYear() - anoDeNascimento;
        int tempoDeTrabalho = LocalDate.now().getYear() - entradaEmpresa;

        System.out.println("Código: " + codigo);
        System.out.println("Idade: " + idade);
        System.out.println("Tempo de trabalho: " + tempoDeTrabalho);

        if ((idade >= 65 || tempoDeTrabalho >= 30) || (idade >= 60 && tempoDeTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");

        }

        scanner.close();
    }
}