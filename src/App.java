import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int multiplicacao = 1;
        for(int x = 1; x <= n; x++) {
            multiplicacao *= x;
        }
        System.out.println(multiplicacao);
    }
}
