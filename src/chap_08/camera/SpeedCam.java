package chap_08.camera;

public class SpeedCam extends Camera {


    @Override
    public void showMAinFeature() {
        System.out.println("속도 측정");
    }
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }
}
