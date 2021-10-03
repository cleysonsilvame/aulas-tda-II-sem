import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    float distancia1Obj, tempo1Obj, distancia2Obj, tempo2Obj, distancia3Obj, tempo3Obj;

    System.out.println("Digite a distancia percorrida do 1º objeto (km): ");
    distancia1Obj = scanner.nextFloat();

    System.out.println("Digite o tempo levado do 1º objeto (horas): ");
    tempo1Obj = scanner.nextFloat();

    System.out.println("\nDigite a distancia percorrida do 2º objeto (km): ");
    distancia2Obj = scanner.nextFloat();

    System.out.println("Digite o tempo levado do 2º objeto (horas): ");
    tempo2Obj = scanner.nextFloat();

    System.out.println("\nDigite a distancia percorrida do 3º objeto (km): ");
    distancia3Obj = scanner.nextFloat();

    System.out.println("Digite o tempo levado do 3º objeto (horas): ");
    tempo3Obj = scanner.nextFloat();


    System.out.println("\n\nA velocidade do 1º objeto foi: " + calculaVelocidade(distancia1Obj, tempo1Obj) + " km/h");
    System.out.println("A velocidade do 2º objeto foi: " + calculaVelocidade(distancia2Obj, tempo2Obj) + " km/h");
    System.out.println("A velocidade do 3º objeto foi: " + calculaVelocidade(distancia3Obj, tempo3Obj) + " km/h");

    scanner.close();
  }

  static float calculaVelocidade(float distancia, float tempo) {
    return distancia / tempo;
  }
}
