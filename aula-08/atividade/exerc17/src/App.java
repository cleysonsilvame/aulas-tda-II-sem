import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("\nDigite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("\nIdade atual: " + (anoAtual - anoNascimento));
        System.out.println("Idade em 2050: " + (2050 - anoNascimento));

        scanner.close();
    }
}
