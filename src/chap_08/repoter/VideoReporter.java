package chap_08.repoter;

public class VideoReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("직전 30초 영상와 함께 신고를 진행합니다.");
    }
}
