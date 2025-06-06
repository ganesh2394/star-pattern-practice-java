class Pattern15{
     /*
             *
            ***
           *****
          *******
           *****
            ***
             *
             *      
      */

     public static void main(String[] args){
         pattern();
     }

     public static void pattern(){

          // Upper
          for(int i = 1; i <= 4; i++){
                // print space
                for(int j = 1; j <= 4 - i; j++){
                     System.out.print(" ");
                }

                // print star
                for(int k = 1; k <= (2 * i - 1); k++){
                     System.out.print("*");
                }

                // new line
                 System.out.println();
          }

          // Lower

          for(int i = 1; i <= 4 ; i++){
              
              // space
              for(int j = 1; j <= i ; j++){
                 System.out.print(" ");
              }

              // calculate the star 2*(n - i) + 1
              for(int k = 1; k <= (2 * (3 - i) + 1); k++){
                  System.out.print("*");
              }

              // new line
              System.out.println();
          }
     }
}