import java.io.File;

public class no2 {
    public static void main(String[] args) {
        shanchu("D:\\et")  ;

    }

    private static void shanchu(String s) {
        File f=new File(s);
        File[] files = f.listFiles();
        for (File fi : files) {

        }
    }
}
