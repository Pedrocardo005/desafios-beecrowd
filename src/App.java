import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int z = scan.nextInt();
        int somatorio = 0;
        int qtdSomados = 0;
        scan.nextLine();
        while (z <= x) {
            z = scan.nextInt();
        }

        for (int i = x; somatorio <= z; i++) {
            somatorio += i;
            qtdSomados++;
        }
        System.out.println(qtdSomados);
    }
}
