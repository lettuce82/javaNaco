package chap_06;

public class _05_Overloading {
    public static void power(int number) { //Parameter, 매개변수
        int result = number * number;
        System.out.println(result);
    }
    public static int getPower(int number) { //Parameter, 매개변수
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent) { //Parameter, 매개변수

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러번 선언
        //1. 전달값의 타입이 다르거나
        //2. 전달값의 갯수가 다르거나
        //cf. 반환타입이 다른 경우에는 오버로딩 불가
        System.out.println(getPower(2));
        System.out.println(getPower("3"));
        System.out.println(getPower(3, 3));

    }
}
