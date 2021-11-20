import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal
        

        float alturasFeminina = 0;
        float alturasMasculina = 0;

        int qtdFeminina = 0;
        int qtdMasculina = 0;


        while(true){

            System.out.println("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if(sexo == 'M'){
                System.out.println("\nDigite a altura do homem: ");
                float altura = scanner.nextFloat();

                alturasMasculina += altura;
                qtdMasculina++;

            } else if(sexo == 'F'){
                System.out.println("\nDigite a altura da mulher: ");
                float altura = scanner.nextFloat();

                alturasFeminina += altura;
                qtdFeminina++; 

            }

            
            System.out.println("\nDeseja continuar? (S/N)");
            char continuar = scanner.next().toUpperCase().charAt(0);

            if(continuar == 'N'){
                break;
            }
        }

        float mediaFeminina = alturasFeminina / qtdFeminina;
        float mediaMasculina = alturasMasculina / qtdMasculina;


        System.out.println("\nMedia da altura das mulheres: " + mediaFeminina + "m");
        System.out.println("Media da altura dos homens: " + mediaMasculina + "m");

        scanner.close();
    }
}
