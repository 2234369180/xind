package lianxi;

import java.util.Arrays;
import java.util.Comparator;

public class no4 {
    public static void main(String[] args) {
        person[] people = new person[20];
        int jishu=0;
        people[jishu++] = new person("gh", 16);
        people[jishu++] = new person("hkhg", 18);
        people[jishu++] = new person("ab", 118);
        people[jishu++] = new person("wh", 19);
        people[jishu++] = new person("qg", 24);
        people[jishu++] = new person("bl", 28);
 /*       Arrays.sort(people, 0, jishu, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o2.age-o1.age;
            }
        });
        for (person person : people) {
            System.out.println(person);
        }*/
        System.out.println("-----------------------------------------");
        Arrays.sort(people,0,jishu);
        for (int i = 0; i <jishu ; i++) {
            System.out.println(people[i]);
        }

        }

    }

