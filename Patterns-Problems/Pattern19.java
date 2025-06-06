<<<<<<< HEAD
class Pattern19{
     /**
           1
           23
           456
           78910      
      */
     public static void main(String... args){
         pattern();
     }

     public static void pattern(){
         int number = 1;
         for(int i = 1; i <= 4; i++){
             for(int j = 1; j <= i; j++){
                 System.out.print(number++);
             }

             // new line
             System.out.println();
         }
     }
=======
public class Pattern19 {
    /*
     * 1
     * 23
     * 456
     * 78910
     */
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int number = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++);
            }
            System.out.println();
        }
    }
>>>>>>> 48a51f78d694609d93f71d9976237596c4068dd9
}