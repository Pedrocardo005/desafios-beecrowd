import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int biggest = 0;
        int biggestPosition = 0;
        
        for (int i = 1; i < 101; i++) {
            int currentNumber = sc.nextInt();

            if (currentNumber > biggest) {
                biggest = currentNumber;
                biggestPosition = i;
            }
        }
        System.out.println(biggest);
        System.out.println(biggestPosition);
    }
}
