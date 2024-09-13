
public class javaarrays {

    
    public static void main(String args[]) {
        //String array
        String[] names = {"bob", "steve", "jacob"};
        // Int array
        int[] Numbers = {1, 2, 3, 4, 5, 6};
        //Starts from Zero "0"
        System.out.println(names[0]);
        System.out.println(Numbers[0]);
        // Length of an Array
        System.out.println(names.length);
        System.out.println(Numbers.length);
        //Name Loop "print names"
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        // Int Loop "print numbers
        for(int i = 0; i <= Numbers.length; i++){
            System.out.println(Numbers[i]);
        }
        
    }
}
