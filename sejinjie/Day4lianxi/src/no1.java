import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String txt="你好,世界";
        byte [] bytes=txt.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println("--------------------");
        String s=new String(bytes);
        System.out.println(s);
        System.out.println("-------------------------------------------------------------------------");
        byte[] gbks = txt.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
        String s1=new String(gbks,"GBK");
        System.out.println(s1);
       /* int indexOf(int ch)  返回字符ch在当前字符串中第一次出现的索引值
        int indexOf(String str)   返回字符串str在当前字符串中第一次出现的索引值
        int lastIndexOf(int ch) 返回在指定字符ch在当前字符串中最后一次出现的索引。
        int lastIndexOf(String str) 返回在指定字符串str在当前字符串中最后一次出现的索引。
        String substring(int beginIndex)  返回当前字符串从 beginIndex开始的字符串
        String substring(int beginIndex, int endIndex)  返回当前字符串[beginIndex, endIndex )范围内的字符串*/
        String path = "D:\\course\\03-JavaSE\\Code\\Day1016\\src\\com\\bjpowernode\\string\\Test01.java";
        //需求: 把path路径 中的文件夹, 文件名, 扩展名分别取出来, 需要确定\\最后一次出现的索引值, 确定小点的索引值
       int a1= path.lastIndexOf("\\");
       int a2=path.lastIndexOf(".");
       String lujing=path.substring(0,a1);
       String wenjianming=path.substring(a1+1,a2);
       String kuozhanming=path.substring(a2+1);
        System.out.println(lujing);
        System.out.println(wenjianming);
        System.out.println(kuozhanming);


        int c=100;
        System.out.println("11541215845245485748574");
        System.out.println(String.valueOf(c));
        String f="fujJGHJ".toLowerCase();
        String g="sdjhSHJHJFKHG".toUpperCase();
        System.out.println(f);
        System.out.println(g);
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个电话号码");
        String dianhuahaoma=in.next();
        String zhengze="1[356789]\\d{9}";
        boolean bb=dianhuahaoma.matches(zhengze);
        System.out.println(bb);
        String tihuan="dfjkh65fgh,.54";
        String s2 = tihuan.replaceAll("\\d", "*");
        System.out.println(s2);
        String chaifen="ksdj jdsfh,dsjf ..jkldfg.dsf";
        String[] split = chaifen. split("[ ( .)]");
        for (String s3 : split) {
            System.out.println(s3);
        }
        System.out.println("----------");
        StringBuilder sb=new StringBuilder();
        System.out.print(sb);
        sb.append("12");//1234
        sb.append("34");
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
        sb.insert(2, 1241);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);



    }




}
