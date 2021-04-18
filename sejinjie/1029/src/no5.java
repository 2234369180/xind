public class no5 {
    public static void main(String[] args)  {
       int a=2,b=1;
        suanshu( a,b);

    }

    private static void suanshu(int a,int b) {
        int c= 0;
        try {
            c = a/b;
            c++;
        } catch (Exception e) {
            System.out.println("b不能为0");
        }
            System.out.println("finally");

        System.out.println(c);
    }
}
