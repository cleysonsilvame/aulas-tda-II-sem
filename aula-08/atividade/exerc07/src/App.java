import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        ArrayList<Integer> valores = new ArrayList<Integer>();
        
        
        for (int i = 0; i < 100; i++) {

            System.out.println("Digite um valor: ");
            valores.add(scanner.nextInt());

        }

        System.out.println("\nO maior: " + Collections.max(valores));
        System.out.println("O menor: " + Collections.min(valores));

        scanner.close();
    }
}
