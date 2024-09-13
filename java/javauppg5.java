
public class javauppg5 {

   
    public static void main(String args[]) {
       
    int score = 89; // declare an int variable for the student's score
    
    // use if-else statements to determine the grade based on the score
    if (score >= 90 && score <= 100) {
      System.out.println("Your grade is 5. Excellent work!");
    } else if (score >= 80 && score <= 89) {
      System.out.println("Your grade is 4. Good job!");
    } else if (score >= 70 && score <= 79) {
      System.out.println("Your grade is 3. You're on the right track!");
    } else if (score >= 60 && score <= 69) {
      System.out.println("Your grade is 2. Keep it up!");
    } else if (score >= 25 && score <= 59) {
      System.out.println("Your grade is 1. You need to improve.");
    } else if (score >= 0 && score <= 25) {
      System.out.println("Your grade is 0. You need to try harder.");
    } else {
      System.out.println("Invalid score. Please enter a score between 0 and 100.");
    }
  }
}

