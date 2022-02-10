import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

@SuppressWarnings("ALL")
public class Two_Sum {

    @Test
    public void test() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] answer = {0, 1};

        assertArrayEquals(twoSum(nums, target), answer);
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numAndIndexMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            if (numAndIndexMap.containsKey(target - num)) {
                int a = numAndIndexMap.get(target - num);
                int b = i;
                return new int[]{a, b};
            }
            numAndIndexMap.put(num, i);
        }

        return new int[]{0, 0};
    }
}
