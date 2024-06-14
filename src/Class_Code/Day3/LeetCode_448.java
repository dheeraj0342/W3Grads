package Class_Code.Day3;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int i = 0;
        while (i < nums.length) {
            int check = nums[i] - 1;
            if (nums[i] != nums[check]) {
                int temp = nums[check];
                nums[check] = nums[i];
                nums[i] = temp;
            } else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                ans.add(j + 1);

        }
        System.out.println(ans);
    }
}
