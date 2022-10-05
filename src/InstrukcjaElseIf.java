public class InstrukcjaElseIf {
    public static void main(String[] args) {

        int num = 11;
        if (num == 0) {
            System.out.println("liczba jest równa 0");
        } else if (num >= 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (num < -5) {
            System.out.println("Liczba mneijsza od -5");
        } else if (num > 10) {
            System.out.println("Liczba jest wieksza od 10");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
