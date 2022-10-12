import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {

        System.out.println("Co Panu podać? ");
        Scanner scanner = new Scanner(System.in);
        String danie = scanner.nextLine();


        switch (danie) {
            case "Pizza":
                System.out.println("cena to 22 zł");
                break;
            case "Losos":
                System.out.println("Cen to 30 zł");
                break;
            case "Ffrytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Brak dań w karcie");
        }

    }
}
