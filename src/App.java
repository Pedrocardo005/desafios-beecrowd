import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String texto = scanner.nextLine();
            String[] numerosStrings = texto.split(" ");
            int first, second;

            first = Integer.parseInt(numerosStrings[0]);
            second = Integer.parseInt(numerosStrings[1]);

            if (first == 0 || second == 0) {
                break;
            }

            if (first > 0 && second > 0) {
                System.out.println("primeiro");
            } else if (first < 0 && second > 0) {
                System.out.println("segundo");
            } else if (first < 0 && second < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }
 
    }
}
