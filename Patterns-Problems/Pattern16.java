public class Pattern16 {
    /*
     * 1111
     * 1111
     * 1111
     * 1111
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int number = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
