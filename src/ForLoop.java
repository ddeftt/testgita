public class ForLoop {
    public static void main(String[] args) {
        int j;

    for (int i = 0; i<50; i=i+2) {
        System.out.println("Co druga liczba to " + i);

        for(j = 1; j<100; j++) {
            if(j%3==0) {
                System.out.println("Liczba j jest podzielan przez " + j);
            }
        }
    }

    }
}

