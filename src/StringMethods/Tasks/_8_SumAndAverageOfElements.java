package StringMethods.Tasks;

//TODO Find the sum and average of elements in the given array
// {1,5,65,4,76,12}
public class _8_SumAndAverageOfElements {
    public static void main(String[] args) {
        double arr[] = {1, 5, 65, 4, 76, 12};

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double average = sum / arr.length;
        System.out.println("Sum= " + sum + "\nAverage = " + average);
    }
}
