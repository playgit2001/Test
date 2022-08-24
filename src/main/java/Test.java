import java.util.HashMap;

public class Test {
    public int findRepeatNumber(int[] nums) {
        if(nums.length==0)return 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i]))
                return nums[i];
            map.put(nums[i],i);
        }
        return 0;
    }
}
