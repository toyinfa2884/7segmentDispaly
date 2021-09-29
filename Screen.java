package sevenSegmentDisplay;

import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        SevenSegmentDisplay segment = new SevenSegmentDisplay();
        System.out.println("Enter eight digit binary numbers:");
        String UserInput = input.nextLine();
        segment.segmentScreen(UserInput);
        segment.displayScreen();



    }
}
