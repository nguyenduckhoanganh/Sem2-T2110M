package lap14.lab14b;

import java.util.regex.*;

public class Split {
    public static void main(String[] args) {
        String[] x =
                Pattern.compile("ian").split(
                        "the darwinian devonian explodian chicken");
        for (int i=0; i<x.length; i++) {
            System.out.println(i + " \"" + x[i] + "\"");
        }
    }

}
