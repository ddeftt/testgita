public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));


        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByte);
        System.out.println("Byte max value = " + myMaxByte);


        Short myMinShort = Short.MIN_VALUE;
        Short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShort);
        System.out.println("Short max value = " + myMaxShort);

        Long myLongValue = 100L;

        Long myMinLong = Long.MIN_VALUE;
        Long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLong);
        System.out.println("Long max value = " + myMaxLong);
        long BigLong = 2_147_483_647_234L;
        System.out.println(BigLong);

        short bigShortLiteralValue = 32767;



    }
}
