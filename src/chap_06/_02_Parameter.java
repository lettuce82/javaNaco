package chap_06;

public class _02_Parameter {
    //전달값이 있는 메소드 정의
    public static void power(int number) { //Parameter, 매개변수
        int result = number * number;
        System.out.println(result);
    }

    public static void powerByExp(int number, int exponent) { //Parameter, 매개변수

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        //전달값, Parameter
        System.out.println("메소드 호출 전");
        
        //2 = Argument, 인수
        power(2);
        powerByExp(2,4);
        System.out.println("메소드 호출 후");

    }
}
