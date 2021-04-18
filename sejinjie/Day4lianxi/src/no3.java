import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class no3 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        long a=System.currentTimeMillis();
        System.out.println(a);
        long b=date.getTime();
        System.out.println(b);
        Date date2=new Date(b+1000*60*10);
        System.out.println(date2);
        System.out.println("-------");
        date2=new Date(2000);
        System.out.println(date2);
        date2=new Date(-124185418574654L);
        System.out.println(date2);
        SimpleDateFormat S=new SimpleDateFormat("y-m-d H:m:s");
        String format = S.format(date);
        System.out.println(format);
        String day="2020年10月16号";
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年mm月dd号");
        Date parse = s1.parse(day);
        System.out.println("----------");
        System.out.println(parse);


    }
}
