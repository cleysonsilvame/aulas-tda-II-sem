import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        float soma = 0;
        ArrayList<Float> valores = new ArrayList<Float>();

        while (true) {
            System.out.println("\n\nDigite um valor:");
            float valor = scanner.nextFloat();

            valores.add(valor);
            soma += valor;

            System.out.println("\n\nDeseja continuar? (s/n)");
            char resposta = scanner.next().toLowerCase().charAt(0);

            if (resposta == 'n') {
                break;
            }
        }
        
        System.out.println("\n\nMédia: " + soma / valores.size());
        System.out.println("\n\nMaior deles: " + Collections.max(valores));
        
        scanner.close();
    }
}
