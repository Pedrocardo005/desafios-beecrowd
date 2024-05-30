import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        while(numero != 0) {
            String texto = "1";
            for (int x = 2; x <= numero; x++) {
                texto += " " + x;
            }
            System.out.println(texto);
            numero = scan.nextInt();
        }
    }
}
