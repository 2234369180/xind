public class no2 {
    public static void main(String[] args) {
        String a=new String("a");
        String b="a";
        System.out.println(a);
        System.out.println(a=="a");
        System.out.println("-------");
        System.out.println(a.equals("a"));
        System.out.println(a==b);
        System.out.println(b=="a");
        car c=new car();
        c.name="a";
        System.out.println(c.name.equals(a));
    }
}
