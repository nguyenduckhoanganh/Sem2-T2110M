package lap11part1;

import java.io.File;
public class Dir {
    static void listPath(File path) {
        File[] files = path.listFiles();
        int length = files.length;
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].toString());
        }
    }
    public static void main(String args[]) {
        listPath(new File("C:\\WINDOWS"));
    }
}
