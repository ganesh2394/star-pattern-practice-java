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