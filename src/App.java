public class App {

    public static void main(String[] args) throws Exception {
        int[] js = {7, 6, 5};
        int i;

        for (i = 1; i <= 9; i += 2) {
            for (int j : js) {
                System.out.printf("I=%d J=%d%n", i, j);
            }
        }
    }
}
