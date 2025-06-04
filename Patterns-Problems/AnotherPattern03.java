public class AnotherPattern03{

     /*
            *****
             ****
              ***
               **
                *
      */
     public static void main(String... args){
         pattern();
     }

     public static void pattern(){

        for(int i = 1; i <= 5; i++){

            // space
            for(int j = 1; j <= i -1; j++){
                 System.out.print(" ");
            }

            // star
            for(int k = 1; k <= 5 - i + 1; k++){
                 System.out.print("*");
            }

            System.out.println();
        }
     }
}