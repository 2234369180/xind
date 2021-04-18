package lianxi;

import java.sql.SQLOutput;
import java.util.Objects;

class person implements Comparable<person>{
    String name;
    int age;
    static int aa;


    public static void main(String[] args) {
        System.out.println(aa);
    }

    public person() {
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(person o) {
        return this.name.compareTo(o.name);
    }

}
