<<<<<<< HEAD
class Pattern11{
     /*
           *******
            *****
             ***
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
                  System.out.print("*");
              }

              // new line
              System.out.println();
          }
     }
}
=======
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
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
