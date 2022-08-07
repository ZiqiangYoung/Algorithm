package leetcode.q6136;

/**
 * <strong>三指针。Nums本身严格递增，所以三指针只增不减，并且顺序固定。</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class ThreePointers implements Solution {
    @Override
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0, length = nums.length;
        for (int i = 0, j = 1, k = 2; i < nums.length - 2; i++) {
            while (nums[j] < nums[i] + diff) if (++j >= length) return ans;
            if (nums[j] == nums[i] + diff) {
                while (nums[k] < nums[j] + diff) if (++k >= length) return ans;
                if (nums[k] == nums[j] + diff) ans++;
            }
        }
        return ans;
    }
}
