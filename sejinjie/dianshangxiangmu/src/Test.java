import java.util.*;

public class Test {

    public static void main(String[] args) {
        Article[] art = new Article[10];
        List<Article> list=new ArrayList<>();
        list.add(new Article(1001, "Mate 30", 8900, 50000));
        list.add(new Article(1002, "novo ", 4500, 15000));
        list.add(new Article(1003, "vivo", 8700, 36000));
        list.add(new Article(1004, "oppo", 1200, 78000));
        HashMap<String, String> ha = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("===============主界面===============");
        while (true) {
            System.out.println("1浏览所有商品   2注册   3登录   4退出");
            System.out.println("请选择你的操作:");
            int a = input.nextInt();

            if (a == 1) {
                System.out.println("------------------商品信息------------------");
                System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                for (Article article : list) {
                    System.out.println(article);
                }
                System.out.println("选择排序方式:\t\t1根据名称升序   2价格升序   3销量降序");
                a = input.nextInt();

                if (a == 1) {
                   list.sort(new Comparator<Article>() {
                       @Override
                       public int compare(Article o1, Article o2) {
                           return o1.name.compareTo(o2.name);
                       }
                   });
                    System.out.println("===============商品信息===============");

                    System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                    for (Article article : list) {
                        System.out.println(article);
                    }
                } else if (a == 2) {
                    list.sort(new Comparator<Article>() {
                        @Override
                        public int compare(Article o1, Article o2) {
                            return o1.price-o2.price;
                        }
                    });
                    System.out.println("===============商品信息===============");
                    System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                    for (Article article : list) {
                        System.out.println(article);
                    }
                } else if (a == 3) {
                    list.sort(new Comparator<Article>() {
                        @Override
                        public int compare(Article o1, Article o2) {
                            return o2.sales-o1.sales;
                        }
                    });
                    System.out.println("===============商品信息===============");
                    System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                    for (Article article : list) {
                        System.out.println(article);
                    }
                }
//这里结束
            } else if (a == 2) {
                System.out.println("------------用户注册------------");
                while (true) {
                    System.out.println("请输入用户名");
                    String s1 = input.next();
                    if (ha.containsKey(s1)) {
                        System.out.println("该用户名已存在,请重新输入");
                    } else {
                        System.out.println("请输入密码");
                        String s2 = input.next();
                        ha.put(s1, s2);
                        break;
                    }
                }
            } else if (a==3){
                System.out.println("--------用户登录--------");
                while (true) {
                    System.out.println("请输入用户名");
                    String s3 = input.next();
                    if (ha.containsKey(s3)) {
                        System.out.println("请输入密码");
                        String s4 = input.next();
                        if ((ha.get(s3)).equals(s4)) {
                            System.out.println("登陆成功");
                            break;
                        } else {
                            System.out.println("登录失败");
                        }
                    } else {
                        System.out.println("用户名不存在");
                    }
                }

                while (true) {
                    System.out.println("*************产品管理操作界面*************");
                    System.out.println("1显示所有商品");
                    System.out.println("2添加商品");
                    System.out.println("3删除商品");
                    System.out.println("4修改商品");
                    System.out.println("5查找商品");
                    System.out.println("6 退出");
                    System.out.println("请选择你的操作:");
                    int x=input.nextInt();
                    if (x == 1) {
                        System.out.println("------------------商品信息------------------");
                        System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                        for (Article article : list) {
                            System.out.println(article);
                        }
                        System.out.println("选择排序方式:\t\t1根据名称升序   2价格升序   3销量降序");
                        a = input.nextInt();

                        if (a == 1) {
                            list.sort(new Comparator<Article>() {
                                @Override
                                public int compare(Article o1, Article o2) {
                                    return o1.name.compareTo(o2.name);
                                }
                            });
                            System.out.println("===============商品信息===============");

                            System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                            for (Article article : list) {
                                System.out.println(article);
                            }
                        } else if (a == 2) {
                            list.sort(new Comparator<Article>() {
                                @Override
                                public int compare(Article o1, Article o2) {
                                    return o1.price-o2.price;
                                }
                            });
                            System.out.println("===============商品信息===============");
                            System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                            for (Article article : list) {
                                System.out.println(article);
                            }
                        } else if (a == 3) {
                            list.sort(new Comparator<Article>() {
                                @Override
                                public int compare(Article o1, Article o2) {
                                    return o2.sales-o1.sales;
                                }
                            });
                            System.out.println("===============商品信息===============");
                            System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                            for (Article article : list) {
                                System.out.println(article);
                            }
                        }

                    }
                    else if (x==2){
                        System.out.println("请输入商品编号");
                        int y1=input.nextInt();
                        System.out.println("请输入商品编名称");
                        String y2=input.next();
                        System.out.println("请输入商品编价格");
                        int y3=input.nextInt();
                        System.out.println("请输入商品编销量");
                        int y4=input.nextInt();
                        list
                    .add(new Article(y1, y2, y3, y4));

                    }else if (x==3){
                        System.out.println("----------删除商品信息----------");
                        System.out.println("请输入要删除的商品编号");
                        int a1=input.nextInt();boolean b=false;
                        for (Iterator<Article> it = list.iterator(); it.hasNext(); ) {

                            Article next =  it.next();
                            if(next.no==a1){
                                it.remove();
                                b=true;
                            }

                        }
                        if(b==false){
                            System.out.println("没有"+a1+"商品编号");
                        }else{
                            System.out.println("删除成功");
                        }
                    }else if(x==4){
                        System.out.println("----------修改商品信息----------");
                        System.out.println("请输入要修改的商品编号");
                        int a2=input.nextInt();boolean b2=false;
                        for (Iterator<Article> it1 = list.iterator(); it1.hasNext(); ) {
                            Article next =  it1.next();
                            if(a2==next.no){
                                System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                                System.out.println(next);
                                System.out.println("请输入新的商品编号");
                                int a3=input.nextInt();
                                System.out.println("请输入新的商品名称");
                                String s1=input.next();
                                System.out.println("请输入新的商品价格");
                                int a4=input.nextInt();
                                System.out.println("请输入新的商品销量");
                                int a5=input.nextInt();
                                next.no=a3;
                                next.name=s1;
                                next.price=a4;
                                next.sales=a5;
                                b2=true;
                            }
                        }
                        if (b2==false){
                            System.out.println("没有此商品");
                        }
                    }else if(x==5){
                        System.out.println("------------查找商品------------");
                        System.out.println("请输入商品名称");
                        String s2=input.next();boolean b3=false;
                        for (Iterator<Article> it = list.iterator(); it.hasNext(); ) {
                            Article next =  it.next();
                            if (next.name.equals(s2)){
                                System.out.println("商品编号\t商品名称\t\t\t商品价格\t销量");
                                System.out.println(next);
                                b3=true;
                            }
                        }
                        if (b3==false){
                            System.out.println("没有此商品");
                        }
                    }else if (x==6){
                        System.exit(0);
                    }
                }
            }else if(a==4){
                System.exit(0);
            }
        }
    }
}
