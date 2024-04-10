import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] lista = {0,0,0,0,0,0};
        int positivos = 0;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.nextDouble();
            if (lista[i] > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + " valores positivos");
    }
}
