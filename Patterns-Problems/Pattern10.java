<<<<<<< HEAD
class Pattern10{
     /*
              *
             * *
            *   *
           *******     
      */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){
          
          for(int i = 1; i <= 4; i++){

              // space
              for(int j = 1; j <= 4 - i; j++){
                 System.out.print(" ");
              }
              
              // print start and space
              for(int k = 1; k <= (2 * i - 1); k++){
                    // condition
                    if(i == 4 || k == 1 || k == (2 * i - 1)){
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
public class Pattern10 {
    /* 
              *
             * *
            *   *
           *******
     */
     public static void main(String[] args) {
        pattern();
     }

     public static void pattern(){
         for(int i = 1; i <= 4; i++){
            // space
            for(int j = 1; j <= 4 - i; j++){
                System.out.print(" ");
            }
            // start and space
            for(int k = 1; k <= (2 * i - 1); k++){
                 // First and last row: print all stars
                if (i == 4 || k == 1 || k == (2 * i - 1)) {
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
