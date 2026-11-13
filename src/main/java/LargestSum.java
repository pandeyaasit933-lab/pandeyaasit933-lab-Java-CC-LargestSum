import java.util.List;
import java.util.Collections;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     * 
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {
        if (nums == null || nums.size() < 2) {
            return 0; // Handle edge cases where a pair cannot be formed
        }
        
        // Sort the list so the largest elements are at the end
        Collections.sort(nums);
        
        // Return the sum of the two largest elements
        int n = nums.size();
        return nums.get(n - 1) + nums.get(n - 2);
    }
}