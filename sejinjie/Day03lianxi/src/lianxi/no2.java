package lianxi;

import java.security.PublicKey;

public class no2 {
    public static void main(String[] args) {
        int [] a={11,22,33,44,55,66,77,88,99};
        int aa=zhaoshu(a,34);
        System.out.println(aa>0? aa:"没数");

        }


    private static int zhaoshu(int[] as,int ab) {
        int form = 0;
        int to = as.length - 1;
        int mid = (form + to) / 2;
        for (; ; ) {
            if (as[mid] == ab) {
                return mid;
            }
            if (as[mid] > ab) {
                to = mid - 1;
                mid = (form + to) / 2;
            } else {
                form = mid + 1;
                mid = (form + to) / 2;
            }

        }
    }


}
