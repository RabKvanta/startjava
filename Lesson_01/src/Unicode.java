public class Unicode {
    public static void main(String[] args) {

        for (char ch = 33; ch <= 126; ch++) {
            System.out.print(ch+" ");
        }

        System.out.println();

        for (char ch = '\u0021'; ch <= '\u007E'; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println();
/*
          for (char ch=9398; ch <= 10178; ch++) {
              System.out.println(ch);
          }

 */
    }
}
