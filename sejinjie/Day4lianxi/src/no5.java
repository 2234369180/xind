import java.text.DecimalFormat;

public class no5 {
    //按格式输出数
    public static void main(String[] args) {
        DecimalFormat d=new DecimalFormat("######.000");
        double d1=1541215.1541;
        String s=d.format(d1);
        System.out.println(s);
    }
}
