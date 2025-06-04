public class Pattern09 {
    /*
              *
             ***
            *****
           *******
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}
