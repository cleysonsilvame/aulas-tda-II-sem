import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora de entrada (HE): ");
        int horaEntrada = scanner.nextInt();
        System.out.print("\nDigite o minuto de entrada (ME): ");
        int minutoEntrada = scanner.nextInt();
        System.out.print("\nDigite a hora de entrada (HS): ");
        int horaSaida = scanner.nextInt();
        System.out.print("\nDigite o minuto da saída (MS): ");
        int minutoSaida = scanner.nextInt();

        boolean foraDoHorario = !(horaEntrada >= 6 && horaEntrada <= 18 && horaSaida >= 6 && horaSaida <= 18);
        boolean passouDas18Horas = horaSaida == 18 && minutoSaida > 0;
        boolean entradaMaiorQueSaida = !(horaEntrada < horaSaida
                || (horaEntrada == horaSaida && minutoEntrada < minutoSaida));

        if (foraDoHorario || passouDas18Horas) {
            System.out.println("\n\nEstacionamento está abre às 06:00hs e fecha às 18:00hs!");
        } else if (entradaMaiorQueSaida) {
            System.out.println("\n\nO horário de entrada deve ser menor que o de saída!");
        } else {
            int comMinutos = (minutoSaida - minutoEntrada) > 0 ? 1 : 0;
            int horasTotais = horaSaida - horaEntrada + comMinutos;

            switch (horasTotais) {
            case 1:
                System.out.println(
                        "\n\nO valor do estacionamento ficou: R$ 4,00 para " + horasTotais + " hora de estacionamento.");
                break;
            case 2:
                System.out.println("\n\nO valor do estacionamento ficou: R$ 6,00 para " + horasTotais
                        + " horas de estacionamento.");
                break;
            default:
                int valorTotal = 6 + (horasTotais - 2);

                System.out.println("\n\nO valor do estacionamento ficou: R$ " + valorTotal + ",00 para " + horasTotais
                        + " horas de estacionamento.");
                break;
            }
        }

        scanner.close();
    }
}
