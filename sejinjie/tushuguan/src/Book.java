import java.io.Serializable;

public class Book implements Serializable {
    String no;
    String name;
    String author;
   double price;

    public Book() {
    }

    public Book(String no, String name, String author, double price) {
        this.no = no;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "图书信息:图书编号="+no+",\t图书名称="+name+",\tAuthor="+author+",  price="+price;
    }
}
