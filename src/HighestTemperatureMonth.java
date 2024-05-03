import java.util.Scanner;
public class HighestTemperatureMonth {

    public static void main(String[] args) {
        double[] temperatures = new double[12];//array declare
        Scanner scanner = new Scanner(System.in); //scanner object create
        for (int month = 0; month < 12; month++) {
            System.out.print("Enter temperature for month " + (month +1)+ ": ");
            temperatures[month] = scanner.nextDouble();
        }

        // let month with the highest temperature is january
        double highestTemp = temperatures[0];
        int highestMonth = 0;
        for (int month = 1; month <12; month++) {
            if (temperatures[month] > highestTemp) {
                highestTemp = temperatures[month];
                highestMonth = month;
            }
        }
        // Array of month names
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Print the month with the highest temperature
        System.out.println("The month with the highest temperature is " + monthNames[highestMonth]);

        scanner.close();
    }
}
