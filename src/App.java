import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num1, num2, bigger, smaller;
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if (num1 > num2) {
            bigger = num1;
            smaller = num2;
        } else {
            bigger = num2;
            smaller = num1;
        }
        
        for(int x = smaller + 1; x < bigger; x++) {
            if(x % 5 == 2 || x % 5 == 3) {
                System.out.println(x);
            }
        }
    }
}
