class Pattern13{
     /*
           *
           **
           ***
           ****
           ***
           **
           *     
      */
     public static void main(String... args){
         pattern();
     }

     public static void pattern(){

          // Upper
          for(int i = 1; i <= 4; i++){
              
              // print star
              for(int j = 1; j <= i; j++){
                 System.out.print("*");
              }
         
              // new line
              System.out.println();
          }

          // Lower
          for(int i = 1; i <= 4 - 1; i++){
             
             // print star
             for(int j = 1; j <= 4 - i; j++){
                 System.out.print("*");
             }

             // new line
             System.out.println();
          }


     }
}