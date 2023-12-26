package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format()
        System.out.println("---------- 정수 -----------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);
        System.out.printf("%06d%n", 1234);
        System.out.printf("%6d%n", -1234);
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 1000000000);
        System.out.printf("%-6d%n", 1234);

        System.out.println("---------- 실수 -----------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%6.2f%n", Math.PI);
        System.out.printf("%-6.2f%n", Math.PI);
        System.out.printf("%06.2f%n", Math.PI);
        System.out.printf("%+6.2f%n", Math.PI);

        System.out.println("---------- 문자열 -----------");
        System.out.printf("%s%n", "Java");
        System.out.printf("%6s%n", "Java");
        System.out.printf("%-6s%n", "Java");
        System.out.printf("%6.2s%n", "Java");
        System.out.printf("%-6.2s%n", "Java");

        System.out.println("---------- 응용1 -----------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 90 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " +100 + " " + 100.0);
        System.out.println("채치수 " + 95 + " " +100 + " " + 97.5);

        System.out.println("---------- 응용2 -----------");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 90, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 95, 100, 97.5);

        System.out.println("---------- 참고 -----------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
