public class Application {
    public static void main(String[] args) {
         
        int value = 0;
        boolean pasaDeMi = false;
     
        while(value < 10)
        {
            System.out.println("Hello " + value);
            if (value == 5){
            	pasaDeMi= !pasaDeMi	;
            			
            }
             
            if (pasaDeMi)
            {
            	break;
            }
            value = value + 1;
        }
        
        
    }
}