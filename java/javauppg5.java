
public class javauppg5 {

   
    public static void main(String args[]) {
       
    int score = 89; // declare an int variable for the student's score
    
    // use if-else statements to determine the grade based on the score
    if (score >= 90 && score <= 100) {
      System.out.println("Your grade is 5. good work!");
    } else if (score >= 80 && score <= 89) {
      System.out.println("Your grade is 4. Good!");
    } else if (score >= 70 && score <= 79) {
      System.out.println("Your grade is 3. ok!");
    } else if (score >= 60 && score <= 69) {
      System.out.println("Your grade is 2. berly ok!");
    } else if (score >= 25 && score <= 59) {
      System.out.println("Your grade is 1. improv.");
    } else if (score >= 0 && score <= 25) {
      System.out.println("Your grade is 0. work harder.");
    } else {
      System.out.println("Invalid score. Please enter a score between 0 and 100.");
    }
  }
}

