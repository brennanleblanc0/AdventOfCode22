import java.io.*;
import java.util.Scanner;

public class DayEight {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("input.txt"));
        int iteration = 1;
        int visible = 0;
        String input = fileScanner.nextLine();
        char[][] trees = new char[input.length()][input.length()];
        for (int i = 0; i < input.length(); i++) {
            trees[0][i] = input.charAt(i);
        }
        while(fileScanner.hasNext()) {
            input = fileScanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                trees[iteration][i] = input.charAt(i);
            }
            iteration++;
        }

        fileScanner.close();

        /* Part 1
        visible = 392;

        for (int i = 1; i < trees.length - 1; i++) {
            for (int k = 1; k < trees.length - 1; k++) {
                boolean isVisible = false;
                if (trees[i][k] > trees[i][k+1] && !isVisible) {
                    isVisible = true;
                    for (int j = k+1; j < trees.length; j++) {
                        if (trees[i][k] <= trees[i][j]) {
                            isVisible = false;
                            break;
                        }
                    }
                }
                if (trees[i][k] > trees[i][k-1] && !isVisible) {
                    isVisible = true;
                    for (int j = 0; j < k; j++) {
                        if (trees[i][k] <= trees[i][j]) {
                            isVisible = false;
                            break;
                        }
                    }
                }
                if (trees[i][k] > trees[i+1][k] && !isVisible) {
                    isVisible = true;
                    for (int j = i+1; j < trees.length; j++) {
                        if (trees[i][k] <= trees[j][k]) {
                            isVisible = false;
                            break;
                        }
                    }
                }
                
                if (trees[i][k] > trees[i-1][k] && !isVisible) {
                    isVisible = true;
                    for (int j = 0; j < i; j++) {
                        if (trees[i][k] <= trees[j][k]) {
                            isVisible = false;
                            break;
                        }
                    }
                }
                visible = (isVisible) ? visible + 1 : visible;
            }
        }
        */

        int highScore = 0;

        for (int i = 0; i < trees.length; i++) {
            for (int k = 0; k < trees.length; k++) {
                int[] score = {0,0,0,0};
                int combined = 0;
                
                for (int j = k+1; j < trees.length; j++) {
                    score[0]++;
                    if (trees[i][k] <= trees[i][j]) {
                        break;
                    }
                }

                for (int j = k-1; j >= 0; j--) {
                    score[1]++;
                    if (trees[i][k] <= trees[i][j]) {
                        break;
                    } 
                }

                for (int j = i+1; j < trees.length; j++) {
                    score[2]++;
                    if (trees[i][k] <= trees[j][k]) {
                        break;
                    }
                }
                
                for (int j = i-1; j >= 0; j--) {
                    score[3]++;
                    if (trees[i][k] <= trees[j][k]) {
                        break;
                    } 
                }

                combined = score[0] * score[1] * score[2] * score[3];

                if (combined > highScore)
                    highScore = combined;
            }
        }

        System.out.println("Best: " + highScore);
    }
}