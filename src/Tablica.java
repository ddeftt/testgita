public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];

        imiona[0] = "Bartek";
        imiona[1] = "Marcin";
        imiona[2] = "Piotrek";

        /*System.out.println(imiona[0]);

        int[] lottoNum = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNum[0]);
        System.out.println(lottoNum[1]);
        System.out.println(lottoNum[2]);
        System.out.println(lottoNum[3]);
        System.out.println(lottoNum[4]);
        System.out.println(lottoNum[5]);

        System.out.println(lottoNum.length);
           */


        for (int i=0; i<imiona.length;i++) {
            System.out.println(imiona[i]);
        }



    }
}
