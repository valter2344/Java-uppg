
public class javaU2 {

   
    public static void main(String args[]) {
        // Int numbers Array
        int[] array1 = {5, 10, 25, 75, 125};
        
        int[] array2 = {50, 100, 250, 750, 25};
        
        int sum = 0;
        int i; 

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < array1.length; i++) {
        sum += array1[i];
}

        System.out.println("The sum is: " + sum);
        
        int sum1 = 0;
        int I; 

        // Loop through the array elements and store the sum in the sum variable
        for (I = 0; I < array2.length; I++) {
        sum1 += array2[I];
}

        System.out.println("The sum is: " + sum1);
        
        double division = (double) sum / sum1;
        System.out.println("Division av sum och sum1: " + division);

        
        
    }
}
    

