
public class newBreakand {

   
    public static void main(String args[]) {
        // Break loop
        /*
        for(int i = 0; i < 8; i++){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
        */
        //Continue loop
        /*
        for(int i = 0; i < 10; i++){
            if(i == 1){
                continue;
            }
            System.out.println(i);

        } 
        */
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
            if(i == 5){
                break;
            }
        }
    }
}
