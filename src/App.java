import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum, lowerNum, gratterNum;
        int soma = 0;

        firstNum = sc.nextInt();
        secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            lowerNum = secondNum;
            gratterNum = firstNum;
        } else {
            lowerNum = firstNum;
            gratterNum = secondNum;
        }

        for (int i = lowerNum + 1; i < gratterNum ; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
