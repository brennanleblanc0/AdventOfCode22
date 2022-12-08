import java.io.*;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) throws IOException {
        Elf currentElf = new Elf();
        Scanner fileScanner = new Scanner(new File("input.txt"));

        int iteration = 1;
        int[] currentHighest = {0, 0, 0};

        while(fileScanner.hasNext()) {
            try {
                currentElf.addCalories(Integer.parseInt(fileScanner.nextLine()));
            } catch (NumberFormatException e) {
                if (currentElf.getCalories() > currentHighest[0]) {
                    currentHighest[2] = currentHighest[1];
                    currentHighest[1] = currentHighest[0];
                    currentHighest[0] = currentElf.getCalories();
                } else if (currentElf.getCalories() > currentHighest[1]) {
                    currentHighest[2] = currentHighest[1];
                    currentHighest[1] = currentElf.getCalories();
                } else if (currentElf.getCalories() > currentHighest[2]) {
                    currentHighest[2] = currentElf.getCalories();
                }
                currentElf.resetCalories();
                iteration++;
            }
        }

        System.out.println("Amount of highest: " + currentHighest[0]);

        System.out.println("Amount all 3: " + (currentHighest[0] + currentHighest[1] + currentHighest[2]));
 
        
    }
}