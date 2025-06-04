public class Pattern21 {
    /*
     * 6666
     * 555
     * 44
     * 3
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int number = 6;
        for (int i = 1; i <= 4; i++) {
            // print number
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print(number);
            }
            number--;
            System.out.println();
        }
    }
}
