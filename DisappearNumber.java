import java.util.ArrayList;
import java.util.List;
public class DisappearNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        DisappearNumber dn = new DisappearNumber();
        List<Integer> result = dn.findDisappearedNumbers(nums);
        System.out.println(result); // Output: [5, 6]
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1; // since elements are from 1 to n
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // just find missing numbers 
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1) {
                ans.add(index + 1); // since elements are from 1 to n
            }
        }
        return ans; 
    }
    
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
