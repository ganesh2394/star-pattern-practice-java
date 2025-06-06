public class Pattern08{
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
            
              // print star 
              for(int j = 1; j <= i; j++){
                 System.out.print("*");
              }

              // new line
              System.out.println();
          }
     }
}