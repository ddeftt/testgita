import java.io.PrintStream;
import java.util.Scanner;

public class GetDataScanner {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imie: ");
        Scanner scanner = (new Scanner(System.in));
        String name = scanner.nextLine();
        System.out.println("A teraz prosze podaj dowolną liczbę do obliczeń pola kwadratu: ");
        int num = scanner.nextInt();
        System.out.println("Dziękuje!");
        System.out.println(name + " pole kwadratu to " + num * 4);

    }
}
