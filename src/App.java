import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int entrada, numero = 1;
        entrada = 0;
        entrada = scan.nextInt();
        
        for(int x = 0; x < entrada; x++) {
            for(int y = 0; y < 4; y++) {
                if (y != 3) {
                    System.out.printf("%d ", numero);
                } else {
                    System.out.printf("PUM%n");
                }
                numero++;
            }
        }
    }
}
