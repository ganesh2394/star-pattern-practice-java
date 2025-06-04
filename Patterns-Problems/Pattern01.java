public class Pattern01{

    /*
        ****
        ****
        ****
        ****
     */

     public static void main(String[] args){
         pattern();
     }

     public static void pattern(){
          outer:
          for(int i = 1; i <= 4; i++){
             inner:
             for(int j = 1; j <= 4; j++){
                 System.out.print("*");
             }
             System.out.println();
          }
     }
}