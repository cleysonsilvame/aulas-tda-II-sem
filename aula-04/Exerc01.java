import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float km_inicial, km_final, qtd_litros_gastos, preco_litro;

    System.out.println("Digite kilometragem inicial: ");
    km_inicial = scanner.nextFloat();

    System.out.println("Digite kilometragem final: ");
    km_final = scanner.nextFloat();

    System.out.println("Digite a quantidade de litros gastos: ");
    qtd_litros_gastos = scanner.nextFloat();

    System.out.println("Digite o preço do litro que você pagou: ");
    preco_litro = scanner.nextFloat();

    System.out.println("\n\nA distância percorrida foi: " + distanciaPercorrida(km_inicial, km_final));
    System.out.println("O consumo médio foi: " + consumoMedio(km_inicial, km_final, qtd_litros_gastos));
    System.out
        .println("O total do valor gasto foi: " + valorGasto(km_inicial, km_final, qtd_litros_gastos, preco_litro));

    scanner.close();
  }

  static float distanciaPercorrida(float kmInicial, float kmFinal) {
    float res = kmFinal - kmInicial;
    return res;
  }

  static float consumoMedio(float kmInicial, float kmFinal, float qtdLitros) {
    float res = (distanciaPercorrida(kmInicial, kmFinal)) / qtdLitros;
    return res;
  }

  static float valorGasto(float kmInicial, float kmFinal, float qtdLitros, float preco) {
    float res = (consumoMedio(kmInicial, kmFinal, qtdLitros)) / preco;
    return res;
  }
}
