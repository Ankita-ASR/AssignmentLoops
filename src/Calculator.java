import java.util.Scanner;
class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;
    // Constructor to initialize the DataSet
    public DataSet() {
        sum = 0.0;
        smallest = Double.POSITIVE_INFINITY;
        largest = Double.NEGATIVE_INFINITY;
        count = 0;
    }
    // Method to add a value to the DataSet
    public void add(double value) {
        sum += value;
        if (value < smallest) {
            smallest = value;
        }
        if (value > largest) {
            largest = value;
        }
        count++;
    }
    // Method to calculate the average of the values
    public double getAverage() {
        if (count == 0) {
            return 0.0; // Return 0 if no values have been added
        }
        return sum / count;
    }
    // Method to get the smallest value
    public double getSmallest() {
        return smallest;
    }
    // Method to get the largest value
    public double getLargest() {
        return largest;
    }
    // Method to calculate the range (difference between largest and smallest)
    public double getRange() {
        return largest - smallest;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();
        System.out.println("Enter a set of floating-point values (enter a non-numeric value to finish):");

        // Read values until a non-numeric value is entered
        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            dataSet.add(value);
        }
        // Output
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());

        scanner.close();
    }
}
