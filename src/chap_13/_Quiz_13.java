package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("saying.txt"));) {
            bufferedWriter.write("세 살 __ 여든까지 간다");
            bufferedWriter.newLine();
            bufferedWriter.write("버릇");
            bufferedWriter.newLine();
            bufferedWriter.write("소 읽고 ___ 고친다");
            bufferedWriter.newLine();
            bufferedWriter.write("외양간");
            bufferedWriter.newLine();
            bufferedWriter.write("천 리 길도 한 __부터");
            bufferedWriter.newLine();
            bufferedWriter.write("걸음");
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("saying.txt"));){
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("--------------------------------------------");

            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    System.out.println("--------------------------------------------");
                    System.out.println("모든 퀴즈가 완료되었습니다.");
                    System.out.println("수고하셨습니다. ^^");
                    break;
                }
                System.out.println("(문제) " + line);
                System.out.print("정답 입력 =>  ");

                String anwser = scanner.nextLine();

                if (anwser.equals(line = bufferedReader.readLine())) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + line + "입니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
