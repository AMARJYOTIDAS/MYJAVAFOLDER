public class FindMissingNum {
    public static void main(String[] args) {

        int[] arr = {5, 1, 6, 2, 3};

        int n = 6;

        // Sum of numbers from 1 to n
        int total = n * (n + 1) / 2;

        // Sum of array elements
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        // Find missing number
        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}