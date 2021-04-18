import java.io.FileWriter;
import java.io.IOException;

public class no7 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("C:\\Users\\20452\\Desktop\\JAVA.b.txt");
        f.write('f');
        char[] c = "你好,队内赛电弧焊接".toCharArray();
        f.write(c);
        f.write("dsgsdghjklh等级考试");
        f.close();
    }
}
