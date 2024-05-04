import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<Double>();
        int n = 0;

        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String lineString = sc.nextLine();

            String[] listaStrings = lineString.split(" ");

            double num1 = Double.parseDouble(listaStrings[0]);
            double num2 = Double.parseDouble(listaStrings[1]);
            double num3 = Double.parseDouble(listaStrings[2]);
            double mediaPonderada = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);
            numeros.add(mediaPonderada);
        }

        for (int index = 0; index < numeros.size(); index++) {
            double numero = numeros.get(index);

            System.out.printf("%.1f%n", numero);
        }
    }
}
