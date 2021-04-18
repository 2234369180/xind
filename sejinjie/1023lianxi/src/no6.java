import java.io.FileInputStream;
import java.io.IOException;

public class no6 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        try ( FileInputStream f=new FileInputStream("C:/Users/20452/Desktop/JAVA/2-08/aaa.txt");){

            byte [] b=new byte[5];
            int r = f.read(b);
            while (r!=-1){
                String s=new String(b,0,r);
                System.out.print(s);
                r=f.read(b);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
