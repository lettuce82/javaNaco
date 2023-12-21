package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형(Enum)
        //달력: JAN, FEB, MAR, ...
        //옷 사잊 : S, M, L, XL
        //OS 종류: WIN10, WIN11, MACOS, LINUS, ...
        //해상도 : HD, FHD, ...

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD -> System.out.println("에이치디");
            case FHD -> System.out.println("풀에이치디");
        }

        System.out.println("--------------");

        resolution = Resolution.valueOf("HD");
        System.out.println(resolution);

        System.out.println("--------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("--------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1290), FHD(1920);
    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }


}
