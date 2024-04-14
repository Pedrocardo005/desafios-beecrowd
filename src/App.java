import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int[] numeros = {0,0,0,0,0};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
