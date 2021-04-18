import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class no1 {
    public static void main(String[] args)  {
        c("你好,世界","GBK");
        c("你好,世界","UTF-81");
    }

    private static void c(String s, String gbk)  {
        byte[] bytes = new byte[0];
        try {
            bytes = s.getBytes(gbk);
        } catch (UnsupportedEncodingException r) {
            c("ekjf","GBK");
            System.out.println("hello world");
        }
        System.out.println(Arrays.toString(bytes));
    }
}
