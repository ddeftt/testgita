import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   System.out.println("Podaj nazwe gry: ");
   String game = scanner.nextLine();


   switch (game) {
       case "Diablo":
           System.out.println("Średnia gra");
           break;
       case "Final fantasy":
           System.out.println("Bardzo dobra gra");
           break;
       case "Horizon":
           System.out.println("Równiez bardzo dobra");
           break;
       default:
           System.out.println("Brak danych o grze");
   }

    }
}
