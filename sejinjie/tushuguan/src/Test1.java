import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws IOException {
//登录名 lisi  密码 123

        int i10=0;
        List<Reader> rd=new ArrayList();
        Reader r=new Reader("lisi", "123",new Book[]{});
        rd.add(r);
        Reader r1=new Reader();

        List<Book> list=new ArrayList();
        list.add(new Book("b001", "java入门", "菲菲", 40.0));
        list.add(new Book("b002", "java提高", "老崔", 30.0));
        list.add(new Book("b003", "java Web", "老羊", 20.0));
        ObjectOutputStream ob= null;
        ObjectOutputStream ob1= null;

            ob = new ObjectOutputStream(new FileOutputStream("a.txt"));
        ob1 = new ObjectOutputStream(new FileOutputStream("b.txt"));


        while (true) {
            System.out.println("===========图书管理系统===========");
            System.out.println("1图书查询");
            System.out.println("2读者登录");
            System.out.println("3管理员登录");
            System.out.println("请输入你的操作");
            Scanner input=new Scanner(System.in);
            int i1=input.nextInt();
            if(i1==1){
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                System.out.println("------------图书查询------------");
                System.out.println("1 按图书编号查询   2按图书名称查询");
                i1=input.nextInt();
                if(i1==1){
                    System.out.println("请输入图书编号");
                    String s1=input.next();boolean b1=false;
                    for (Iterator it = list.iterator(); it.hasNext(); ) {
                        Book next = (Book) it.next();
                        if(s1.equals(next.no)){
                            System.out.println(next);
                            b1=true;
                        }

                    }
                    if (b1==false){
                        System.out.println("没有此编号的图书");
                    }

                }else if(i1==2){
                    System.out.println("请输入图书名称");
                    String s2=input.next(); boolean b2=false;
                    for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                        Book next = (Book) iterator.next();
                        if (next.name.contains(s2)){
                            System.out.println(next);
                            b2=true;
                        }

                    }
                    if (b2==false){
                        System.out.println("没有包含此名字的图书");
                    }
                }





            }else if(i1==2){
                int i=0;
                while (true&&i!=100) {
                    System.out.println("请输入读者编号");
                    String s3=input.next();
                    System.out.println("请输入密码");
                    String s4=input.next();boolean b1=false;
                    for (Iterator<Reader> it = rd.iterator(); it.hasNext(); ) {
                        Reader next =  it.next();
                        if(s3.equals(next.no)&&s4.equals(next.Password)){
                            System.out.println("登陆成功");
                            b1=true;
                             i=100;
                             r1=next;
                            break;
                        }

                    }
                    if (b1==false){
                        System.out.println("用户名或密码错误");
                    }





                }
                while (true){
                    System.out.println("1 查看个人信息");
                    System.out.println("2 查看借阅信息");
                    System.out.println("3 修改密码");
                    System.out.println("4 借书");
                    System.out.println("5 还书");
                    System.out.println("6 退出");
                    int i2=input.nextInt();

                    if (i2==1){
                        System.out.println(r1.no);
                    }else if (i2==2){
                        for (Book book : r1.book) {
                            System.out.println(book);
                        }
                    }else if(i2==3){
                        System.out.println("请输入新密码");
                        String s3=input.next();
                        r1.Password=s3;
                    }else if(i2==4){
                        System.out.println("是否需要查询图书,查询按1,直接借阅输入任意整数");
                        int i3=input.nextInt();
                        if (i3==1){
                            while (true&&i10!=200) {
                                System.out.println("------------图书查询------------");
                                System.out.println("1 按图书编号查询   2按图书名称查询");
                                i1=input.nextInt();
                                if(i1==1){
                                    System.out.println("请输入图书编号");
                                    String s1=input.next();boolean b1=false;
                                    for (Iterator it = list.iterator(); it.hasNext(); ) {
                                        Book next = (Book) it.next();
                                        if(s1.equals(next.no)){
                                            System.out.println(next);
                                            b1=true;
                                        }

                                    }
                                    if (b1==false){
                                        System.out.println("没有此编号的图书");
                                    }

                                }else if(i1==2){
                                    System.out.println("请输入图书名称");
                                    String s2=input.next(); boolean b2=false;
                                    for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                                        Book next = (Book) iterator.next();
                                        if (next.name.contains(s2)){
                                            System.out.println(next);
                                            b2=true;
                                        }

                                    }
                                    if (b2==false){
                                        System.out.println("没有包含此名字的图书");
                                    }
                                }
                                System.out.println("按1进入借书环节,输入任意整数再次查询");
                                String s4=input.next();
                                if ("1".equals(s4)){
                                    i10=200;
                                }
                            }


                        }
                        System.out.println("请输入书的编号");
                        String s4=input.next();boolean b1=false;
                        for (Iterator<Book> it = list.iterator(); it.hasNext(); ) {
                            Book next =  it.next();
                            if (s4.equals(next.no)){
                               r1.book=Arrays.copyOf(r1.book,r1.book.length+1);
                               r1.book[r1.book.length-1]=next;
                                it.remove();
                                b1=true;
                            }

                        }
                        if (b1==true){
                            System.out.println("借书成功");
                        }else {
                            System.out.println("借书失败,没有您要的书");
                        }

                    }else if(i2==5){
                        System.out.println("请输入您要还的图书编号");
                        String s11=input.next();boolean b4=false;
                        for (int j = 0; j < r1.book.length; j++) {
                           if (s11.equals(r1.book[j].no)){
                               list.add(r1.book[j]);
                               System.arraycopy(r1.book, j+1, r1.book, j, r1.book.length-j-1);
                               r1.book[r1.book.length-1]=null;

                               b4=true;
                           }
                        }
                        if (b4==false){
                            System.out.println("您没有您要还的书");
                        }else{
                            System.out.println("还书成功");
                        }
                    }else if (i2==6){
                        try {
                            ob.writeObject(list);
                            ob1.writeObject(rd);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.exit(0);
                    }





                }


                }else if(i1==3){
                while (true) {
                    System.out.println("请输入管理员用户名");
                    String s5=input.next();
                    System.out.println("请输入密码");
                    String s6=input.next();
                    if ("lisi".equals(s5)&&"123".equals(s6)){
                        System.out.println("登陆成功");
                        break;
                    }else{
                        System.out.println("用户名或密码错误,请重新登陆");
                    }
                }
                while (true) {
                    System.out.println("-=-=-=-=-管理员操作界面-=-=-=-=-");
                    System.out.println("1添加读者信息");
                    System.out.println("2删除读者信息");
                    System.out.println("3查询读者信息");
                    System.out.println("4添加图书信息");
                    System.out.println("5删除图书信息");
                    System.out.println("6查看图书信息");
                    System.out.println("7退出");
                    int i6=input.nextInt();
                    if (i6==1){
                        System.out.println("请输入读者证编号");
                        String s1=input.next();
                        System.out.println("请输入读者证密码");
                        String s2=input.next();
                        rd.add(new Reader(s1, s2));
                    }else if (i6==2){
                        System.out.println("请输入要删除的读者证编号");
                        String s1=input.next();boolean b6=false;
                        for (Iterator<Reader> iterator = rd.iterator(); iterator.hasNext(); ) {
                            Reader next =  iterator.next();
                            if (s1.equals(next.no)){
                                iterator.remove();
                                b6=true;
                            }
                        }
                        if (b6==false){
                            System.out.println("删除失败,没有这个读者证编号");
                        }else {
                            System.out.println("删除成功");
                        }
                    }else if(i6==3){
                        System.out.println("请输入要查询的读者证");
                        String s=input.next();boolean b8=false;
                        for (Iterator<Reader> iterator = rd.iterator(); iterator.hasNext(); ) {
                            Reader next =  iterator.next();
                            if (s.equals(next.no)){
                                System.out.println("读书证:"+next+"\t"+"密码是:"+next.Password);
                                b8=true;
                            }
                        }
                        if (b8==false){
                        System.out.println("读书证输入有误");}


                    }else if (i6==4){
                        System.out.println("请输入图书编号");
                        String s1=input.next();
                        System.out.println("请输入图书名称");
                        String s2=input.next();
                        System.out.println("请输入图书作者");
                        String s3=input.next();
                        System.out.println("请输入图书价格");
                        double d=input.nextDouble();
                        list.add(new Book(s1, s2, s3, d));
                        System.out.println("添加成功");
                    }else if (i6==5){
                        System.out.println("请输入要删除的图书编号");
                        String s1=input.next();boolean b10=false;
                        for (Iterator<Book> iterator = list.iterator(); iterator.hasNext(); ) {
                            Book next =  iterator.next();
                            if (s1.equals(next.no)){
                                iterator.remove();
                                b10=true;
                            }
                        }
                        if (b10==false){
                            System.out.println("删除失败,没有改图书编号");
                        }else{
                            System.out.println("删除成功");
                        }
                    }else if(i6==6){

                        System.out.println("------------图书查询------------");
                        System.out.println("1 按图书编号查询   2按图书名称查询");
                        i1=input.nextInt();
                        if(i1==1){
                            System.out.println("请输入图书编号");
                            String s1=input.next();boolean b1=false;
                            for (Iterator it = list.iterator(); it.hasNext(); ) {
                                Book next = (Book) it.next();
                                if(s1.equals(next.no)){
                                    System.out.println(next);
                                    b1=true;
                                }

                            }
                            if (b1==false){
                                System.out.println("没有此编号的图书");
                            }

                        }else if(i1==2){
                            System.out.println("请输入图书名称");
                            String s2=input.next(); boolean b2=false;
                            for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                                Book next = (Book) iterator.next();
                                if (next.name.contains(s2)){
                                    System.out.println(next);
                                    b2=true;
                                }

                            }
                            if (b2==false){
                                System.out.println("没有包含此名字的图书");
                            }
                        }

                    }else if (i6==7){
                        try {
                            ob.writeObject(list);
                            ob1.writeObject(rd);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.exit(0);
                    }
            }


            }
        }
        
    }
}

