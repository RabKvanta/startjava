public class Unicode {
    public static void main(String[] args) {
        char ch = '\u9398';
        for (int i = 9398; i <= 10178; i++) {
            System.out.println(ch++);
        }
        System.out.println();
        for (ch = '\u0033'; ch <= '\u0126'; ch++) {
            System.out.println(ch);
        }
    }
}
