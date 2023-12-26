package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable itemA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                }
            }
        };

        Runnable itemB = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                }
            }
        };

        Thread threadA = new Thread(itemA);
        Thread threadB = new Thread(itemB);
        threadA.start();
        threadB.start();
    }


}
