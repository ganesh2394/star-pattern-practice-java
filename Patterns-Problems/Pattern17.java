<<<<<<< HEAD
public class Pattern17{

    /*
           1111
           2222
           3333
           4444
     */

     public static void main(String[] args){
         pattern();
     }

     public static void pattern(){
          outer:
          for(int i = 1; i <= 4; i++){
             inner:
             for(int j = 1; j <= 4; j++){
                 System.out.print(i);
             }
             System.out.println();
          }
     }
}
=======
public class Pattern17 {
    /*
     * 1111
     * 2222
     * 3333
     * 4444
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
