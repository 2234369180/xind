public class fuxi4 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Hello World");
        System.out.println(s);
        //字符串连接
        s.append("12");
        s.append(3);
        System.out.println(s);

        //删除
        s.delete(2, 4);

        //插入
        s.insert(4, "kdjf");

        //逆序
        s.reverse();

    }
}
