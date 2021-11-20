import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int qtdAlunosQueVotam = 0;
        int qtdAlunosQueNaoVotam = 0;
        int somaDeAlunosQueNaoVotam = 0;

        for (int i = 0; i < 500; i++) {
            System.out.println("Digite a idade: ");
            int idadeDigitada = scanner.nextInt();

            if (idadeDigitada > 16) {
                qtdAlunosQueVotam++;

            } else {
                somaDeAlunosQueNaoVotam += idadeDigitada;
                qtdAlunosQueNaoVotam++;
            }
        }

        System.out.println("Média de alunos que não podem votar: " + (somaDeAlunosQueNaoVotam / qtdAlunosQueNaoVotam));
        System.out.println("Quantidade de alunos que podem votar: " + qtdAlunosQueVotam);

        scanner.close();
    }
}
