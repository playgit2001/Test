import java.util.Arrays;

//Leetcode4,寻找中位数
//采用方法，合并数组，排序，找出中位数
public class Test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []num=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
            num[i]=nums1[i];
        for (int j=0;j<nums2.length;j++)
            num[nums1.length+j]=nums2[j];
        Arrays.sort(num);
        if(num.length%2==1)
            return num[num.length/2];
        else
            return (num[num.length/2-1]+num[num.length/2])/2.0;
    }
}
