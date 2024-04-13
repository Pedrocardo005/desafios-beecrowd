import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int[] numeros = {0,0,0,0,0};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("%d valores pares%n", pares);
    }
}
