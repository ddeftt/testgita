import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Cześć jak ma na imie?: ");
        Scanner scanner = (new Scanner(System.in));
        String name = scanner.nextLine();
        System.out.println("Miło mi Cię poznać " + name);
        System.out.println(name + " Podaj proszę pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.println("Teraz " + name + " podaj proszę drugą liczbę: ");
        int num2 = scanner.nextInt();

        System.out.println("Wynik dodawania twoich liczb to " + (num1 + num2));
        System.out.println("Wynik odejmowania twoich liczb to " + (num1 - num2));
        System.out.println("Wynik mnożenia twoich liczb to " + (num1 * num2));
        System.out.println("Wynik dzielenia twoich liczb to " + (num1 / num2));
        System.out.println("Wynik modulo twoich liczb to " + (num1 % num2));





    }
}
