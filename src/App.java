import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<Integer>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int first, second, biger, lower, som = 0;
            String line = sc.nextLine();
            String[] lineStrings = line.split(" ");

            first = Integer.parseInt(lineStrings[0]);
            second = Integer.parseInt(lineStrings[1]);

            if (first > second) {
                biger = first;
                lower = second;
            } else {
                biger = second;
                lower = first;
            }

            for (int j = lower + 1; j < biger; j++) {
                if (j % 2 != 0) {
                    som += j;
                }
            }

            results.add(som);
        }

        for (int index = 0; index < results.size(); index++) {
            System.out.println(results.get(index));
        }
    }
}
