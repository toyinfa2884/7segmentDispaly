package sevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegmentDisplay {

    private int[][] segment = new int[5][4];

    public static void getScreenA() {
    }

    public void segmentScreen(String collector) {
        for (int row = 0; row < collector.length(); row++) {
            switch (row) {
                case 0:
                    int A = Character.getNumericValue(collector.charAt(row));
                    if (A == 1) {
                        screenA();
                    }
                    break;
                case 1:
                    int B = Character.getNumericValue(collector.charAt(row));
                    if (B == 1) {
                        screenB();
                    }
                    break;
                case 2:
                    int C = Character.getNumericValue(collector.charAt(row));
                    if (C == 1) {
                        screenC();
                    }
                    break;
                case 3:
                    int D = Character.getNumericValue(collector.charAt(row));
                    if (D == 1) {
                        screenD();
                    }
                    break;
                case 4:
                    int E = Character.getNumericValue(collector.charAt(row));
                    if (E == 1) {
                        screenE();
                    }
                    break;
                case 5:
                    int F = Character.getNumericValue(collector.charAt(row));
                    if (F == 1) {
                        screenF();
                    }
                    break;
                case 6:
                    int G = Character.getNumericValue(collector.charAt(row));
                    if (G == 1) {
                        screenG();
                    }
                    break;
                case 7:
                    int H = Character.getNumericValue(collector.charAt(row));
                    if (H == 0) {
                        clearScreen();
                    }
                    break;
            }

        }

    }


    private   void screenA() {
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;

    }

    private void screenB() {
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }

    private void screenC() {
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    private void screenD() {
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    private void screenE() {
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;

    }

    private void screenF() {
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    private void screenG() {
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;

    }

    public void clearScreen() {
        int[][] Array = segment;
        for (int row = 0; row < Array.length; row++) {
            for (int column = 0; column < Array[row].length; column++) {
                Array[row][column] = 0;
            }
        }
    }

    public void displayScreen() {
        int[][] arrayToDisplay = segment;
        for (int row = 0; row < arrayToDisplay.length; row++) {
            for (int column = 0; column < arrayToDisplay[row].length; column++) {
                if (arrayToDisplay[row][column] == 1) {
                    System.out.print("| ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(segment);
    }

}













