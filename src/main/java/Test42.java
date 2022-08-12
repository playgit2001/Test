public class Test42 {
    //leetcode 42接雨水
    //动态规划方法的体会，使用场景。在这个题目中，这个能接的雨水值，跟左右两端的最大高度有关，最大高度之和减去当前高度，就是可接雨水值。
    //而动态规划的使用，是因为在测试计算最大高度时，从左往右，每个柱的左最大高度与上一个最大高度有关。
    //从右往左，算右最大高度也是如此。
    public int trap(int[] height) {
        int length=height.length;
        int sum=0;
        if(length<2)return 0;
        int []dpl=new int[length];
        int []dpr=new int[length];
        dpl[0]=height[0];
        dpr[length-1]=height[length-1];
        for(int i=1;i<length;i++)
            dpl[i]=Math.max(dpl[i-1],height[i]);
        for(int j=length-2;j>=0;j--)
            dpr[j]=Math.max(dpr[j+1],height[j]);
        for(int i=0;i<length;i++)
            sum+=Math.min(dpl[i],dpr[i])-height[i];
        return sum;
    }
}
