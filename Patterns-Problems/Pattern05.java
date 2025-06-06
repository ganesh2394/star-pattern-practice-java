<<<<<<< HEAD
class Pattern05{

    /*
            ******
            *    *
            *    *
            ******    
     */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){

         for(int i = 1; i<= 4; i++){
             for(int j = 1; j <= 6; j++){
                
                 if(i == 1 || i == 4 || j == 1 || j == 6){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
             }
             
             // new line
             System.out.println();
         }
     }

}
=======
public class Pattern05 {

    /*
     ******
     *    *
     *    *
     ******
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
