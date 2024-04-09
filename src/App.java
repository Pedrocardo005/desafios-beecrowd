import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October",
            "November",
            "December"};
        
        System.out.println(meses[mes - 1]);
    }
}
