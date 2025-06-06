<<<<<<< HEAD
class Pattern12{
     /*
           *******
            *   *
             * *
              *    
      */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){
          for(int i = 1; i <= 4; i++){
              
              // space
              for(int j = 1; j <= i - 1; j++){
                 System.out.print(" ");
              }

              // calculate the star 2*(n - i) + 1
              for(int k = 1; k <= (2 * (4 - i) + 1); k++){
                   // conditoin
                   if(i == 1 || k == 1 || k == (2 *(4 - i) + 1)){
                     System.out.print("*");
                   }else{
                     System.out.print(" ");
                   }
              }

              // new line
              System.out.println();
          }
     }
}
=======
public class Pattern12 {
    /*
           *******
            *   *
             * *
              *
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int n = 4;  // height of the pyramid

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }

            // 2. Print stars and internal spaces
            int starsInRow = 2 * (n - i) + 1;
            for (int j = 1; j <= starsInRow; j++) {
                if (i == 1 || j == 1 || j == starsInRow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
