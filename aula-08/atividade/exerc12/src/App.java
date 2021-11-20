import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        final int senhaCorreta = 4531;

        System.out.print("Senha: ");
        int senhaUsuario = scanner.nextInt();

        if (senhaUsuario == senhaCorreta) {
            System.out.println("\nAcesso liberado!");
        } else {
            System.out.println("\nAcesso negado!");
        }

        scanner.close();
    }
}
