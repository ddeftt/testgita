public class ForLoop {
    public static void main(String[] args) {
    for (int i = 0; i < 50; i=i+2) {
        System.out.println("Liczba " + i + " jest mniejsze od 50");
    }

    for (int i = 0; i < 50; i++) {
        if (i%5==0) {
            System.out.println(i);
        }
    }

    for (int sth = 0; sth< 10; sth++) {
        System.out.println("Nie będe klął");
    }

    }
}
