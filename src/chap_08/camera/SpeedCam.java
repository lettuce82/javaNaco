package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.repoter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reportor;

    @Override
    public void showMAinFeature() {
        System.out.println("속도 측정");
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void detect() {
        detector.detect();
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    public void report() {
        reportor.report();
    }

}
