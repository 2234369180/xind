import sun.security.util.Password;

import java.io.Serializable;
import java.util.Arrays;

public class Reader implements Serializable {
    String no;
    String Password;
    Book [] book;
    public Reader() {
    }

    public Reader(String no, String password) {
        this.no = no;
        Password = password;
    }

    public Reader(String no, String password, Book[] book) {
        this.no = no;
        Password = password;
        this.book = book;
    }


    @Override
    public String toString() {
        return "Reader{" +
                "no='" + no + '\'' +
                ", Password='" + Password + '\'' +
                ", book=" + Arrays.toString(book) +
                '}';
    }
}
