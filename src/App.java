import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<String>();
        boolean isRuning = true;

        while (isRuning) {
            int bigger, lower;
            String lineString = sc.nextLine();
            String[] pairString = lineString.split(" ");
            int first = Integer.parseInt(pairString[0]);       
            int second = Integer.parseInt(pairString[1]);

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

            String resultString = String.format("", args);
        }
    }
}
