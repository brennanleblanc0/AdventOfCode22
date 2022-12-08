import java.io.*;
import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("input.txt"));
        int sum = 0;

        /* Part 1
        while(fileScanner.hasNext()) {
            String input = fileScanner.nextLine();
            int half = input.length() / 2;
            char commonChar = '\0';
            for (int i = 0; i < half; i++) {
                for (int j = 0; j < half; j++) {
                    if (input.charAt(i) == input.charAt(j + half)) {
                        commonChar = input.charAt(i);
                        break;
                    }
                }
                if (commonChar != '\0') {
                    if (Character.isUpperCase(commonChar))
                        sum += (int) commonChar - 38;
                    else
                        sum += (int) commonChar - 96;
                    break;
                }
            }
        }
        */
        int iteration = 0;
        String[] group = new String[3];

        while(fileScanner.hasNext()) {
            group[iteration] = fileScanner.nextLine();
            
            if (iteration == 2) {
                char commonChar = '\0';
                for (int i = 0; i < group[0].length(); i++) {
                    for (int j = 0; j < group[1].length(); j++) {
                        for (int k = 0; k < group[2].length(); k++) {
                            if (group[0].charAt(i) == group[1].charAt(j) && group[0].charAt(i) == group[2].charAt(k) && group[1].charAt(j) == group[2].charAt(k)) {
                                commonChar = group[0].charAt(i);
                                break;
                            }
                        }
                        if (commonChar != '\0')
                            break;
                    }
                    if (commonChar != '\0') {
                        if (Character.isUpperCase(commonChar))
                            sum += (int) commonChar - 38;
                        else
                            sum += (int) commonChar - 96;
                        break;
                    }
                }
                iteration = 0;
            } else
                iteration++;
        }

        fileScanner.close();

        System.out.println("Sum: " + sum);
    }
}
