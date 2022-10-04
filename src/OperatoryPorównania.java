import java.util.Scanner;

public class OperatoryPorównania {
    public static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in));
        System.out.println("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        System.out.println("Wyniki operatorów porównania: ");
        boolean result = num1 > num2;

        System.out.println(result);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 != num2);
        System.out.println(num1 == num2);
    }
}
