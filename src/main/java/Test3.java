import java.util.HashMap;

public class Test3 {
    //使用hashMap
    public int findRepeatNumber1(int[] nums) {
        if(nums.length==0)return 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i]))
                return nums[i];
            map.put(nums[i],i);
        }
        return 0;
    }
    //第二种排序后，查找是否有重复，可能更快。

    //第三种
    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
