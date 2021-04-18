import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class no6 {
    public static void main(String[] args) {
        float a=12.15415241564152F;
        System.out.println(a);
        BigInteger i1=new BigInteger("41545241541541215415241");
        BigInteger i2=new BigInteger("4445241524157452411111111");
        BigInteger i3=i1.add(i2);
        System.out.println(i3);
        i3=i1.divide(i2);
        System.out.println(i3);
        BigDecimal b1=new BigDecimal("2541.1584541541");
        BigDecimal b2=new BigDecimal("254.158454154545411541");
        BigDecimal b3 = b1.divide(b2, 15, RoundingMode.HALF_UP);
        System.out.println(b3);
    }
}
