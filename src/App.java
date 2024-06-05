import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] lista = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                lista[i] = 0;
            } else if (i == 1) {
                lista[i] = 1;
            } else {
                lista[i] = lista[i - 1] + lista[i - 2];
            }
        }
        
        for (int i = 0; i < lista.length; i++) {
            if (i < lista.length - 1) {
                System.out.printf("%d ", lista[i]);
            } else {
                System.out.printf("%d%n", lista[i]);
            }
        }
    }
}
