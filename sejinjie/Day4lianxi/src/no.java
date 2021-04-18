import java.util.Random;

public class no {
    public static void main(String[] args) {
        Random r=new Random();
        //生成小数
        for(int a=0;a<10;a++){
            System.out.println(r.nextDouble());
        }
        //生成整数
        for (int b = 0; b< 10; b++) {
            System.out.println(r.nextInt());
        }
        //生成指定区间
        System.out.println("--------------");
        for (int c = 0; c < 10; c++) {
            System.out.println(r.nextInt(10));
        }
        //生成种子
        System.out.println("----------------");
        Random r1=new Random(123);
        for (int d = 0; d < 10; d++) {
            System.out.println(r1.nextInt(10));
        }

    }
}
