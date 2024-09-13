
public class java6 {

   
    public static void main(String args[]) {
        // Initialize a boolean variable to represent the state of the light
        boolean isOn = false;

        // Simulate the light switch being toggled
        toggleLight(isOn);
        isOn = true;
        toggleLight(isOn);
        isOn = false;
        toggleLight(isOn);
    }

    // Method to toggle the light switch
    public static void toggleLight(boolean isOn) {
        if (isOn) {
            System.out.println("Light is on.");
        } else {
        }            System.out.println("Light is off.");
    }
}
