public class HomeWork3 {
    public static void main(String[] args) {
        /*for (int i=1; i<100; i++) {
            if (i%3==0) {
                System.out.println("Liczba " + i + " jest podzielna przez 3");

        }
        }
         */

        int[] nums = new int[] {1,3,5,7,0};
        int[] convert = new int[nums.length];

        for (int i=0; i< nums.length; i++)
            System.out.print(nums[i] + " ");


        for(int i = 0; i < nums.length; i++)
            convert[i] = nums[nums.length - 1 - i];
        System.out.println();

       // for (int i=4; i<nums.length;i--)
         //   System.out.println(nums[i]);




    }
}
