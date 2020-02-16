public class Calculator {
    public static int pow(int a, int n) {
        int res = 1;
        for (int i = 0; i<n; i++) {
            res *= a;
        }
        return res;
    }


    public static void main(String[] args) {
            System.out.println(pow(2, 0));
    }
}
