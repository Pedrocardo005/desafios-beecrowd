public class App {

    public static void main(String[] args) throws Exception {
        int i = 1;
        int j;

        for (j = 60; j >= 0; j -= 5) {
            System.out.printf("I=%d J=%d%n", i, j);
            i += 3;
        }
    }
}
