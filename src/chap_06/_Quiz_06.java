package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int i) {
        StringBuilder result = new StringBuilder(data.substring(0, i));
        result.append("*".repeat(Math.max(0, data.length() - result.length())));
        return result.toString();
    }
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234568";
        String phone = "010-1523-4845";
        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
