import java.util.Locale;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double[] js = {1, 2, 3};
        double i;

        for (i = 0; i <= 20; i += 2) {
            double ii = i / 10.0;
            for (int j = 0; j < js.length; j++) {
                if ((int) ii == ii) {
                    System.out.printf("I=%.0f J=%.0f%n", ii, js[j]);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", ii, js[j]);
                }
                
                js[j] += 0.2;
            }
        }
    }
}
