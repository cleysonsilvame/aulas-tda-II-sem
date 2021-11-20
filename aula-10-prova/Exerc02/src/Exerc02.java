import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int classificacao01 = 0;
        int classificacao02 = 0;
        int classificacao03 = 0;
        int classificacao04 = 0;
        int classificacao05 = 0;
        int classificacao06 = 0;

        while (true) {
            System.out.print("\nDigite o código do produto (CP): ");
            int codigoProduto = scanner.nextInt();

            System.out.print("\nClassificação: ");
            switch (codigoProduto) {
            case 1:
                System.out.println("Inflamável");
                System.out.println("Número de consultas: " + (++classificacao01));
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Limpeza e Utensílios Domésticos");
                System.out.println("Número de consultas: " + (++classificacao02));
                break;
            case 5:
            case 6:
                System.out.println("Higiene Pessoal");
                System.out.println("Número de consultas: " + (++classificacao03));
                break;
            case 7:
                System.out.println("Alimento não perecível");
                System.out.println("Número de consultas: " + (++classificacao04));
                break;
            case 8:
            case 9:
                System.out.println("Alimento perecível");
                System.out.println("Número de consultas: " + (++classificacao05));
                break;
            case 10:
            case 11:
                System.out.println("Vestuário");
                System.out.println("Número de consultas: " + (++classificacao06));
                break;
            default:
                System.out.println("Inválido");
                break;
            }

            System.out.println("\n\nVocê deseja continuar (S/N)?");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (resposta == 'N') {
                break;
            }
        }
        scanner.close();
    }
}
