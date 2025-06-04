public class Pattern11 {
    /*
           *******
            *****
             ***
              *
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for (int i = 4; i >= 1; i--) {
            // space
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
