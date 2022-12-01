import java.util.Scanner;
import java.io.File;

public class Day1 {
    
    public static void main(String[] args) {

        int maxCalories = 0;
        int secondMaxCalories = 0;
        int thirdMaxCalories = 0;
        int currentCalories = 0;

        // read input from input.txt
        try {
            Scanner in = new Scanner(new File("input.txt"));
            
            // read line by line
            while (in.hasNextLine()) {
                // get next line
                String line = in.nextLine();
                // if next line is blank
                if (line.equals("")) {
                    // update max calories, second max calories, and third max calories
                    if (currentCalories > maxCalories) {
                        thirdMaxCalories = secondMaxCalories;
                        secondMaxCalories = maxCalories;
                        maxCalories = currentCalories;
                    } else if (currentCalories > secondMaxCalories) {
                        thirdMaxCalories = secondMaxCalories;
                        secondMaxCalories = currentCalories;
                    } else if (currentCalories > thirdMaxCalories) {
                        thirdMaxCalories = currentCalories;
                    }
                    // reset current calories
                    currentCalories = 0;
                } else {
                    // add calories to current calories
                    currentCalories += Integer.parseInt(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // print out result
        System.out.println("Max Calories: " + maxCalories);
        System.out.println("Second Max Calories: " + secondMaxCalories);
        System.out.println("Third Max Calories: " + thirdMaxCalories);

        int combinedCalories = maxCalories + secondMaxCalories + thirdMaxCalories;
        System.out.println("Top 3 Combined Calories: " + combinedCalories);

    }
}