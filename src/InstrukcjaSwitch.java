public class InstrukcjaSwitch {
    public static void main(String[] args) {

        String danie = "Maciora";

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
