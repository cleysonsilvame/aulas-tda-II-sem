public class App {
    public static void main(String[] args) throws Exception {

        int qtdAnosBissextos = 0;

        for (int ano = 1901; ano <= 2020; ano++) {
            if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
                qtdAnosBissextos++;
            }
        }
        System.out.print("Anos bissexto: " + qtdAnosBissextos);
    }
}
