import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<String>();
        boolean isRuning = true;

        while (isRuning) {
            String lineString = sc.nextLine();
            String[] pairString = lineString.split(" ");
            int first = Integer.parseInt(pairString[0]);       
            int second = Integer.parseInt(pairString[1]);
            
            if (first == second) {
                break;
            }
            
            if (first > second) {
                results.add("Decrescente");
            } else {
                results.add("Crescente");
            }

        }

        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }
}
