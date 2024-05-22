import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int first, second, big, low, sum = 0;

        first = scan.nextInt();
        second = scan.nextInt();

        if (first > second) {
            big = first;
            low = second;
        } else {
            big = second;
            low = first;
        }
        
        for (int i = low; i <= big; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
