package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.detector.Detectable;
import chap_08.repoter.Reportable;
import chap_08.repoter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReportor(new VideoReporter());
        speedCam.detect();
        speedCam.report();

        };

    }
}
