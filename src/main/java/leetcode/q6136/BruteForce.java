package leetcode.q6136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <strong>leetcode 周赛306 临场AC 未优化 废弃</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 * @deprecated 打周赛时候AC的解法，关键问题在于没有利用nums严格递增的特点，
 * 不过实际上就算可以重叠，也不必将对应下标全部存储，只需要缓存count，相乘即为所求。
 **/
@Deprecated
class BruteForce implements Solution {
    @Override
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Set<Integer>> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, new HashSet<>());
        }
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (diff == nums[i] - nums[j])
                    map.get(nums[i]).add(nums[j]);
            }
        }
        AtomicInteger ans = new AtomicInteger();
        map.forEach((key, set) -> set.forEach(integer -> ans.addAndGet(map.get(integer).size())));
        return ans.get();
    }
}