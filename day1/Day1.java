import java.util.Scanner;
import java.io.File;

public class Day1 {
    
    public static void main(String[] args) {

        int maxCalories = 0;
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
                    // if current calories is greater than max calories
                    if (currentCalories > maxCalories) {
                        // set max calories to current calories
                        maxCalories = currentCalories;
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
        System.out.println(maxCalories);
    }
}