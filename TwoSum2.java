import java.util.Arrays;

class TwoSum2 { 
    public int[] twoSum(int[] n, int target) {
        int i = 0, j = n.length - 1;

        while (i < j) {
            int sum = n[i] + n[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1}; 
            } else if (sum < target) {
                i++; // Increase the left pointer to get a larger sum
            } else {
                j--; // Decrease the right pointer to get a smaller sum
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) { 
        TwoSum2 twoSum = new TwoSum2(); 
        
        int[] n = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum.twoSum(n, target); 
        
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
