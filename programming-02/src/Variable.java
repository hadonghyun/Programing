public class Variable {
    public static void main(String[] args){
        int number;
//        System.out.print(number); 작동 안되는 이유 : 초기화를 해줘야함
        number = 90;
        char grade;
        grade = 'A';
        System.out.print(grade);

        int count = 10;
        count = 1;
        int calculus = count;
        System.out.println(count);
        System.out.println(calculus);

        boolean answer = true;
        System.out.println(answer);

        char ch1 = 68;
        System.out.println(ch1);
    }
}
