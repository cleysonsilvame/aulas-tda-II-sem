import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nDigite o último número da placa: ");
        int finalDaPlaca = scanner.nextInt();

        if (finalDaPlaca == 1 || finalDaPlaca == 2) {
            System.out.println("Rodízio na segunda-feira");
        } else if (finalDaPlaca == 3 || finalDaPlaca == 4) {
            System.out.println("Rodízio na terça-feira");
        } else if (finalDaPlaca == 5 || finalDaPlaca == 6) {
            System.out.println("Rodízio na quarta-feira");
        } else if (finalDaPlaca == 7 || finalDaPlaca == 8) {
            System.out.println("Rodízio na quinta-feira");
        } else if (finalDaPlaca == 9 || finalDaPlaca == 0) {
            System.out.println("Rodízio na sexta-feira");
        }
        scanner.close();
    }
}
