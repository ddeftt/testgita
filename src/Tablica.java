public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Stefan";
        imiona[1] = "Adam";
        imiona[2] = "Bartek";
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNum = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNum[0]);
        System.out.println(lottoNum[1]);
        System.out.println(lottoNum[2]);
        System.out.println(lottoNum[3]);
        System.out.println(lottoNum[4]);
        System.out.println(lottoNum[5]);
        //długośc tablicy

        System.out.println(lottoNum.length);

        for (int i=0; i<lottoNum.length;i++)
            System.out.println(imiona[i]);
    }
}
