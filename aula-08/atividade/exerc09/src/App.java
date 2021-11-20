import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        int positivos = 0;
        ArrayList<Integer> valoresNegativos = new ArrayList<Integer>();

        while (true) {

            System.out.print("\n\nDigite um número: ");
            int n = scanner.nextInt();

            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                valoresNegativos.add(n);
            }

            System.out.print("\nDeseja continuar? (S/N) ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (resposta == 'N') {
                break;
            }
        }

        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + valoresNegativos.size());
        System.out.println("Menor valor: " + Collections.min(valoresNegativos));

        scanner.close();
    }
}
