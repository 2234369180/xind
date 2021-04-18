public class Article {
    int no;
    String name;
    int price;
    int sales;

    public Article(int no, String name, int price, int sales) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    public Article() {
    }

    @Override
    public String toString() {
        return
                 " "+no +"\t"+
                 name
               +"\t\t\t"+ price +"\t"+
                 sales ;
    }

}
