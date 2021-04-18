import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class no4 {
    public static void main(String[] args) {
        LocalDateTime L=LocalDateTime.now();
        System.out.println(L);

        DateTimeFormatter D=DateTimeFormatter.ofPattern("yyyy年MM-dd HH:mm:ss");
        String format = L.format(D);
        System.out.println(format);

        String a="20201016182125";
        DateTimeFormatter D1=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime L1=LocalDateTime.parse(a,D1);

        System.out.println("-----");
        System.out.println(L1);
    }
}
