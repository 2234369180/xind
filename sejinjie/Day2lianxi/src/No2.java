public class No2 {
    public static void main(String[] args) {
        String b=back();
        System.out.println(b);


    }
    public static String back() {
        int[] ints = {11, 22, 33, 44, 55, 66, 77};
        String a = "";
        for (int i = 0; i < ints.length; i++) {
            a = a + ints[i];

        }
        return a;
    }
}
