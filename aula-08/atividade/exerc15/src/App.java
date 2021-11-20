import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int qtdPessoasComSim = 0;
        int qtdMulheres = 0;
        int qtdMulheresComNao = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite sim ou não (S/N): ");
            char opcao = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'F') {
                qtdMulheres++;
                if (opcao == 'N') {
                    qtdMulheresComNao++;
                }
            }

            if (opcao == 'S') {
                qtdPessoasComSim++;
            }
        }

        System.out.println("Quantidade de pessoas que disseram SIM: " + qtdPessoasComSim);
        System.out
                .println("Percentual de mulheres que disseram NÃO: " + (qtdMulheresComNao * 100.0 / qtdMulheres) + "%");

        scanner.close();
    }
}
