import java.io.Serializable;

public class person implements Serializable {
    private static final long serialVersionUID = 4502431594069057376L;
    int age;

    public person() {
    }

    public person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                '}';
    }
}
