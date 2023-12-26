package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable readyA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
                if (i >= 5) {
                    System.out.println("-- A 상품 준비 완료 --");
                }
            }
        };
        Runnable readyB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
                if (i >= 5) {
                    System.out.println("-- B 상품 준비 완료 --");
                }
            }
        };
        Thread threadSet = getThread(readyA, readyB);
        threadSet.start();
    }

    private static Thread getThread(Runnable readyA, Runnable readyB) {
        Thread threadA = new Thread(readyA);
        Thread threadB = new Thread(readyB);
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 준비 " + i + "/5");
                if (i >= 5) {
                    System.out.println("== 세트 상품 준비 완료 ==");
                }
            }
        };
        return new Thread(runnableSet);
    }
}

