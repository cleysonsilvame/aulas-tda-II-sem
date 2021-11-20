import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite o valor da aceleração de frenagem: ");
        double aceleracaoFrenagem = scanner.nextDouble();

        double distancia = calculaFrenagem(aceleracaoFrenagem);

        System.out.println(distancia);
        
        imprimeMensagem(distancia);

        scanner.close();
    }

    public static double calculaFrenagem(double aceleracao) {
        return 400 / 2 * aceleracao;
    }

    public static void imprimeMensagem(double distancia) {

        if (distancia >= 100) {
            System.out.println("BATEU");
        } else {
            System.out.println("UFA");
        }

    }

}
