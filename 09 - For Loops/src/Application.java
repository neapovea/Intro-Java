public class Application {
    public static void main(String[] args) {

        boolean pasaDeMi = false;
        
        for(int i=0; i < 95; i++) {
            System.out.printf("The value of i is    : %d   \n", i);
            if (i == 39){
            	pasaDeMi= !pasaDeMi	;
            			
            }
             
            if (pasaDeMi)
            {
            	break;
            }
            
        }
    }
}