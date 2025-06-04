public class AnotherPattern02{
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
             
              // stars
              for(int j = 1; j <= 5 - i + 1; j++){
                  System.out.print("*");
              }

              // space
              for(int k = 1; k <= i - 1; k++){
                 System.out.print(" ");
              }

              // new line 
              System.out.println();
          }
     }
}