<<<<<<< HEAD
class Pattern07{
     /*
           ****
          ****
         ****
        ****     
      */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){
         
          for(int i = 1; i <= 4; i++){
              
              // print space 
              for(int j = 1; j <= 4 - i; j++){
                 System.out.print(" ");
              }

              // print star
              for(int k = 1; k <= 4; k++){
                 System.out.print("*");
              }

              // new line
              System.out.println();
          }
     }
}
=======
public class Pattern07 {
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
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
