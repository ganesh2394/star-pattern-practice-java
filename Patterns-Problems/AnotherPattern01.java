public class AnotherPattern01{
     /*
                 *
                **
               ***
              ****
             *****
      */
      public static void main(String[] args){
         pattern();
      }

      public static void pattern(){
            
            for(int i = 1; i <= 5; i++){

                // space
                for(int j = 1; j <= 5 - i; j++){
                     System.out.print(" ");
                }

                // stars
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }
                // new line
                System.out.println();
            }
      }
}