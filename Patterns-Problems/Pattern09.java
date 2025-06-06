class Pattern09{
     /*
              *
             ***
            *****
           *******     
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
                for(int k = 1; k <= (2 * i - 1); k++){
                     System.out.print("*");
                }

                // new line
                 System.out.println();
          }
     }
}