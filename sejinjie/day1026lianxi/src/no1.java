import java.io.File;

public class no1 {
    public static void main(String[] args) {
        xianshi("D:\\WeSingCache");
    }

    private static void xianshi(String s) {
        File f=new File(s);
        File[] file= f.listFiles();
        for (File fi : file) {
            System.out.println(fi);
            if(!(fi.isFile())){
               xianshi( fi.getAbsolutePath());
            }
        }
    }
}
