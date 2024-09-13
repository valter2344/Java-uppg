
public class java7 {

    
    public static void main(String args[]) {
       
        
        // Initialize an array with the values 10, 20, 30, 40, and 50
        int[] array = {10, 20, 30, 40, 50};

        // Print the entire array
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Print the first and last elements of the array
        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[array.length - 1]);

        // Calculate and print the sum of the array elements
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);

        // Calculate and print the average of the array elements
        double average = (double) sum / array.length; // Note: divide by array length, not 2
        System.out.println("Average: " + average);
    }
}
    

    

