public class Pattern03 {
    /*
        ****
         ****
          ****
           ****
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for (int i = 1; i <= 4; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
