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