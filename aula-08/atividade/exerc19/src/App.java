import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        while (true) {

            System.out.println("\n\n\n-----------MENU-----------");
            System.out.println("[ 1 ] Somar dois números");
            System.out.println("[ 2 ] Subtrair dois números");
            System.out.println("[ 3 ] Multiplicar dois números");
            System.out.println("[ 4 ] Sair");

            System.out.print("\nEscolha um opção: ");
            char resposta = scanner.next().charAt(0);
            if (resposta == '4') {
                System.out.println("\n\nPrograma finalizado!");

                break;
            }

            System.out.print("\nDigite o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            switch (resposta) {
            case '1':
                System.out.println("\n\nA soma de " + n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case '2':

                System.out.println("\n\nA subtração de " + n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case '3':

                System.out.println("\n\nA multiplicação de " + n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            }

        }

        scanner.close();
    }
}
