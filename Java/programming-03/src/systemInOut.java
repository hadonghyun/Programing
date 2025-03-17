
import java.util.Scanner;

public class systemInOut {
    public static void main(String[] args)
    {
//        int value = 100;
//        System.out.println("Hello World!" + value); //줄바꿈 있음
//        System.out.print("Hello World!"); //줄바꿈 없음
//        System.out.printf("출력 : %d", value);
//
//        System.out.println("이름\t나이\t전공\t\t평점 \"");
//
//        int value1 = 100;
//        int value2 = 200;
//        float value3 = 300.12342432f;
//        System.out.printf("형식 \t %d, %04d, %.4f", value1, value2, value3);
//
//
//        int value1 = 1;
//        int value2 = 2;
//        float value = 300.1234212f;
//        int key = System.in.read();
//        System.out.println(key);
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("이름: ");
//        String name = scanner.nextLine();
//        System.out.print("나이: ");
//        int age = scanner.nextInt();
//        double height = scanner.nextDouble();
//        boolean isS = scanner.nextBoolean();
//
//        scanner.close();
//
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        String name = scanner.nextLine();
        name = scanner.nextLine();

        scanner.close();

    }
}
