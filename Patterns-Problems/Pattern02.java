class Pattern02{

    /*
            ****
            *  *
            *  *
            ****    
     */

     public static void main(String... args){
         pattern();
     }

     public static void pattern(){

         for(int i = 1; i<= 4; i++){
             for(int j = 1; j <= 4; j++){
                
                 if(i == 1 || i == 4 || j == 1 || j == 4){
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