/**
 * This program calculates the amount of logs a truck can carry given the length of logs.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-02-12
 */
 
import java.util.Scanner;

public class LogTruck {
  static double lengthOfLogs;
  static double weight;
  static int numberOfLogs;
  
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Are the logs 0.25, 0.5, or 1 metre?");
    System.out.print("Please enter 0.25, 0.5, or 1: ");
    lengthOfLogs = userInput.nextDouble();
    weight =  lengthOfLogs * 20;
    numberOfLogs =  1100 / (int) weight;
    System.out.println("The truck can carry " + numberOfLogs + " logs that are " 
        + lengthOfLogs + "m long.");
  }
}