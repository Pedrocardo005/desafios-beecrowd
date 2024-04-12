import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int positivos = 0;
        Scanner sc = new Scanner(System.in);
        double[] numeros = {0,0,0,0,0,0};
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();

            if (numeros[i] > 0) {
                positivos++;
                media += numeros[i];
            }
        }
        
        media /= positivos;

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}
