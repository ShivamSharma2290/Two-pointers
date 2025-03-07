import java.util.Arrays;

public class TripletSum {
    public static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;
        boolean found = false;

        // Step 2: Iterate through each element
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates

            int left = i + 1, right = n - 1;

            // Step 3: Two-pointer approach
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    
                    // Skip duplicate elements
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }

        if (!found) {
            System.out.println("triplet not found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,7,11,15,15,20};
        int target = 20;
        findTriplets(arr, target);
    }
}

