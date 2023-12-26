package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsoluteFile());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsoluteFile());
            }
        }

        if (deleteFoldeer(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsoluteFile());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsoluteFile());
        }
    }

    // deleteFolder(A)
    //      deleterFolder(B)
    //          deleteFolder(C)
    //          C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제
    public static boolean deleteFoldeer(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFoldeer(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsoluteFile());
        return folder.delete();
    }
}
