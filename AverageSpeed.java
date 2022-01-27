/*CS 1105 - Assingment 01
Olumayowa Oluwasanmi - B00785929
Tour de France program: In this program, I calculate the average speed of a rider
 (given the total distance and finish time) and convert this result to miles per hour.
 */

//Importing the scanner
import java.util.Scanner;

//Declaring a public class
public class AverageSpeed {
    public static void main(String[] agrs){

        //Declare Scanner
        Scanner kb = new Scanner(System.in);

        //Input Distance and Time
        double totalDistance = kb.nextDouble();
        double riderTime = kb.nextDouble();

        //Calculate average speed
        double averageSpeed = totalDistance/riderTime;
        System.out.println("Average speed (km/h):" + averageSpeed);

        //Convert to km/h from mph
        double convertAverageSpeed = averageSpeed * 0.621371;

        //Output the results in miles per hour
        System.out.println("Average speed (m/ph) :" + convertAverageSpeed);



    }
}