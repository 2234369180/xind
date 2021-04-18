import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class fuxi2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
              判断当前字符串是否包含s字符串
              判断当前字符串是否以suffix结尾
              判断字符串是否以prefix开始
              重写了equals()方法,比较两个 字符串中的字符是否完全一样
              忽略大小写后再比较是否一样
            String toString()  重写了toString()
         */
        String s1="Hell1o侬好 World";
        System.out.println(s1.contains("ld"));
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("d"));

         /*1)
                byte[] getBytes()  返回当前字符串在默认编码下对应的字节数组
                byte[] getBytes(String charsetName) 返回当前字符串在指定的charsetName编码中对应的字节数组, 该方法有受检异常需要预处理
         */
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
         /*2)
                int indexOf(int ch)  返回字符ch在当前字符串中第一次出现的索引值
                int indexOf(String str)   返回字符串str在当前字符串中第一次出现的索引值
                int lastIndexOf(int ch) 返回在指定字符ch在当前字符串中最后一次出现的索引。
                int lastIndexOf(String str) 返回在指定字符串str在当前字符串中最后一次出现的索引。
                String substring(int beginIndex)  返回当前字符串从 beginIndex开始的字符串
                String substring(int beginIndex, int endIndex)  返回当前字符串[beginIndex, endIndex )范围内的字符串
                注意:
                    调用indexOf(int)/lastIndexOf(int)这两个方法时, 如果传递的不是char字符,传递的是int类型的整数时, 系统只把 int 整数这四个字节中的最后两个字节作为实参进行传递
         */
        //定义变量保存文件的绝对路径(从根目录开始的路径), 在Windows操作系统中文件分隔符默认使用反斜杠\, 在String字符串中遇到
        //反斜杠就认为 转义字符的开始, 所以文件路径 中的反斜杠分隔符需要使用两个 \\ 转义



    }
}
