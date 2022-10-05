import java.util.Scanner;

public class HomeWork2 {
    public static <scanner> void main(String[] args) {
        System.out.println("Powiedz prosze ile masz lat? - ");
        Scanner scanner = (new Scanner(System.in));
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("jeśli masz " + age + " lat to nie moge Ci sprzedać akoholu");
        } else if (age >= 18) {
            System.out.println("Dziękuje za zakupy");
        }
    }
}
