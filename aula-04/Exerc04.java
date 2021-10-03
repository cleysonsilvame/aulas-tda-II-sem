import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float valorA, valorB, valorC;

    System.out.println("Digite o valor de 'A': ");
    valorA = scanner.nextFloat();

    System.out.println("Digite o valor de 'B': ");
    valorB = scanner.nextFloat();

    System.out.println("Digite o valor de 'C': ");
    valorC = scanner.nextFloat();

    float delta = getDelta(valorA, valorB, valorC);

    System.out.println(delta);

    if (delta < 0) {
      System.out.println("\n\nNão existem raízes negativas");
    } else {
      float x1 = getX1(valorA, valorB, valorC);
      float x2 = getX2(valorA, valorB, valorC);

      System.out.println("\n\nO valor de x1 é: " + x1);
      System.out.println("O valor de x2 é: " + x2);

    }

    scanner.close();
  }

  static float getDelta(float valorA, float valorB, float valorC) {
    return valorB * valorB - 4 * valorA * valorC;
  }

  static float getX1(float valorA, float valorB, float valorC) {
    float delta = getDelta(valorA, valorB, valorC);
    
    return (float) (-valorB + Math.sqrt(delta)) / 2 * valorA;
  }
  
  static float getX2(float valorA, float valorB, float valorC) {
    float delta = getDelta(valorA, valorB, valorC);

    return (float) (-valorB - Math.sqrt(delta)) / 2 * valorA;
  }
}
