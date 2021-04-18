public class No4 {
    public static void main(String[] args) {
        sum(2121,54,54,212,2415);
    }

    private static void sum(int...a) {
        int sun=0;
        for(int i=0;i<a.length;i++){
            sun+=a[i];
        }
        System.out.println(sun);
    }
}
