import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String nothingWord, firstWord, secondWord;

        nothingWord = sc.nextLine();
        firstWord = sc.nextLine();
        secondWord = sc.nextLine();

        if (firstWord.equals("ave")) {
            if (secondWord.equals("carnivoro")) {
                System.out.println("aguia");
            } else {
                System.out.println("pomba");
            }
        }

        if (firstWord.equals("mamifero")) {
            if (secondWord.equals("onivoro")) {
                System.out.println("homem");
            } else {
                System.out.println("vaca");
            }
        }

        if (firstWord.equals("inseto")) {
            if (secondWord.equals("hematofago")) {
                System.out.println("pulga");
            } else {
                System.out.println("lagarta");
            }
        }

        if (firstWord.equals("anelideo")) {
            if (secondWord.equals("hematofago")) {
                System.out.println("sanguessuga");
            } else {
                System.out.println("minhoca");
            }
        }
    }
}
