public class typeCasting {
    public static void main(String[] args) {
//        long big = 132435465L;
//        int small = (int)big;
//
//        float precise = 13243.135423436f;
//        System.out.println(precise);
//
//        byte byteValue = 10;
//        int intValue = byteValue;
//        long longValue = intValue;
//        float floatValue = longValue;
//
//        char charValue = 'A';
//        intValue = charValue; //intValue 안에는 65로 저장됨
//
//        int code = 65;
//        char character = (char)code;
//        System.out.println(character);
//
//        char lower = 'a';
//        char upper = (char)(lower - 32);
//        System.out.println(upper);
//--------------------------------------------------------
//        int small = 100;
//        byte smallByte = (byte)small;
//        System.out.println(smallByte);
//
//        int big = 1000;
//        byte bigByte = (byte)big;
//        System.out.println(bigByte);
//
//        double height = 175.5;
//        int heightInt = (int)height;
//        System.out.println(heightInt);
//---------------------------------------------------------
        int balance = Integer.MAX_VALUE;
        System.out.println(balance);
        balance = balance + 100;
        System.out.println("잔고:" + balance + '원');

        byte byteVal = 10;
        short shortVal = (short)(byteVal * 2);
        System.out.println(shortVal);
        int intVal = shortVal + 10;
        long longVal = intVal * 100L;

    }
}
