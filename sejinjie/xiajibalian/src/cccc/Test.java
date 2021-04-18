package cccc;

public class Test {
    public static void main(String[] args) {
        Bbb b=new Bbb();
        Ccc c=new Ccc();

        Bbb b1=new Bbb();
        b1.setName("小明");
        b=b1;
        b1.setName("小刚");
        System.out.println(b);
        b.setName("小红");
        System.out.println(b1);





    }



}
