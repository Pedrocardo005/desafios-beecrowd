import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<String>();
        boolean isRuning = true;

        while (isRuning) {
            int bigger, lower, soma = 0;
            String lineString = sc.nextLine();
            String[] pairString = lineString.split(" ");
            int first = Integer.parseInt(pairString[0]);       
            int second = Integer.parseInt(pairString[1]);
            String resultString = "";

            if (first <= 0 || second <= 0) {
                break;
            }

            if (first > second) {
                bigger = first;
                lower = second;
            } else {
                lower = first;
                bigger = second;
            }

            for (int index = lower; index <= bigger; index++) {
                resultString = resultString.concat(index + " ");
                soma += index;
            }

            resultString = resultString.concat("Sum=" + soma);
            results.add(resultString);
        }

        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }
}
