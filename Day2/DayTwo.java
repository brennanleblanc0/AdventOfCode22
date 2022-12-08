import java.io.*;
import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("input.txt"));
        char oppMove, myMove;
        int score = 0;

        /* Part 1
        while(fileScanner.hasNext()) {
            oppMove = fileScanner.next().charAt(0);
            myMove = fileScanner.next().charAt(0);
            if (oppMove == 'A' && myMove == 'X') {
                score += 4;
            } else if (oppMove == 'A' && myMove == 'Y') {
                score += 8;
            } else if (oppMove == 'A' && myMove == 'Z') {
                score += 3;
            } else if (oppMove == 'B' && myMove == 'X') {
                score += 1;
            } else if (oppMove == 'B' && myMove == 'Y') {
                score += 5;
            } else if (oppMove == 'B' && myMove == 'Z') {
                score += 9;
            } else if (oppMove == 'C' && myMove == 'X') {
                score += 7;
            } else if (oppMove == 'C' && myMove == 'Y') {
                score += 2;
            } else {
                score += 6;
            }
        }
        */

        // Part 2
        while(fileScanner.hasNext()) {
            oppMove = fileScanner.next().charAt(0);
            myMove = fileScanner.next().charAt(0);
            if (oppMove == 'A' && myMove == 'X') {
                score += 3;
            } else if (oppMove == 'A' && myMove == 'Y') {
                score += 4;
            } else if (oppMove == 'A' && myMove == 'Z') {
                score += 8;
            } else if (oppMove == 'B' && myMove == 'X') {
                score += 1;
            } else if (oppMove == 'B' && myMove == 'Y') {
                score += 5;
            } else if (oppMove == 'B' && myMove == 'Z') {
                score += 9;
            } else if (oppMove == 'C' && myMove == 'X') {
                score += 2;
            } else if (oppMove == 'C' && myMove == 'Y') {
                score += 6;
            } else {
                score += 7;
            }
        }

        fileScanner.close();

        System.out.println("Final Score: " + score);
    }
}
