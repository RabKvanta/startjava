public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number of 1 from 20: " + i);
        }
        System.out.println(" ");

        int k = -6;
        while (k <= 6) {
            System.out.println("k= " + k);
            k = k + 2;
        }
        System.out.println();
        int sumOdd = 0;
        for (int i = 11; i < 20; i += 2) {
            sumOdd += i;
        }

        System.out.println("sum odd values 10..20 = " + sumOdd);
    }
}
