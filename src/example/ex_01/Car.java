package example.ex_01;

public class Car {
    String name;
    int displacement;
    int size;

    public void Car(String name, int displacement, int size) {
        this.name = name;
        this.displacement = displacement;
        this.size = size;
    }

    public void accelerate() {
        System.out.println("속도를 올립니다.");
    }
    public void changeGear() {
        System.out.println("기어를 변경합니다.");
    }

    public void honk() {
        System.out.println("경적을 울립니다.");
    }
}
