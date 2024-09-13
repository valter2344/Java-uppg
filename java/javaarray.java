
public class javaarray {

    
    public static void main(String args[]) {
        // Int age array
        int ages[] = {10, 15, 20, 25, 30, 35, 40, 45, 55};
        
        float avg, sum = 0;
        
        int length = ages.length;
        //Loop the ages and sum them up
        for(int age: ages){
            sum += age;
        }
        
        // calculate average
        avg = sum / length;
        
        System.out.println("The average is: " + avg);
    }
}
