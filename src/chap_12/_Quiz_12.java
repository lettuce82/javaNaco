package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        readyItem readyItem = new readyItem();

        Runnable readyA = () -> {
            readyItem.ready("A");
        };
        Runnable readyB = () -> {
            readyItem.ready("B");
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

        Runnable runnableSet = new Runnable() {
            @Override
            public void run() {
                readySet readySet = new readySet();
                readySet.ready();
            }
        };
        return new Thread(runnableSet);
    }
}

class readyItem {
    int step = 1;
    void ready(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " 상품 준비 " + step + "/5");
            if (step >= 5) {
                step = 0;
                System.out.println("-- " + name +  "상품 준비 완료 --");
            }
            step++;
        }
    }
}

class readySet {
    int step = 1;
    void ready() {
        for (int i = 0; i < 5; i++) {
            System.out.println("세트 상품 포장 " + step + "/5");
            if (step >= 5) {
                step = 0;
                System.out.println("== 세트 상품 포장 완료 ==");
            }
            step++;
        }
    }
}


