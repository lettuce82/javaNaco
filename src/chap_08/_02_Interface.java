package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.repoter.*;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스

        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDectector = new FireDetector();
        fireDectector.detect();
        Detectable advancedDectector = new AdvancedFireDetector();
        advancedDectector.detect();

        System.out.println("----------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDectector);
        factoryCam.setReporter(nomalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
