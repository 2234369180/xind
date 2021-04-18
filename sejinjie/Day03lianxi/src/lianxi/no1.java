package lianxi;

public class no1 {
    public static void main(String[] args) {
        int t;
        int[] a = {1521, 654, 1565, 121, 541};
        for (int b = 0; b < a.length; b++) {
            int x = b; int e=b;
            for (int c = x + 1; c < a.length; c++) {
                if (a[e] > a[c]) {
                    e = c;
                }
            }
            if (e != x) {
                t = a[e];
                a[e] = a[x];
                a[x] = t;
            }

        }
        for (int d = 0; d < a.length; d++) {
            System.out.println(a[d]);

        }
    }
}
