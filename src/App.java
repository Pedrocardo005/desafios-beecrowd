import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int x = 1; x <= numero; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }            
        }
    }
}
