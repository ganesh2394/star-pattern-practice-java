class Pattern18{
     /*
           333
           313
           323
           333    
      */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){
          
          for (int i = 1; i <= 4; i++) {
            
            for (int j = 1; j <= 3; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("3");
                } else {
                    if (j == 1 || j == 3) {
                        System.out.print("3");
                    } else {
                        System.out.print(i - 1);
                    }
                }
            }
            // new line
            System.out.println();
        }
     }
}