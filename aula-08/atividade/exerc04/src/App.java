import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite quantos numeros serão calculados: ");
        int quantidade = scanner.nextInt();

        ArrayList<Float> numeros = new ArrayList<Float>();
        float soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nDigite um número: ");
            float numero = scanner.nextFloat();

            numeros.add(numero);
            soma += numero;
        }


        System.out.println("\n\nMaior número digitado é: " + Collections.max(numeros));
        System.out.println("A média é: " + soma / quantidade);
        scanner.close();
    }
}
