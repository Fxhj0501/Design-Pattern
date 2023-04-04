package Strategy;

public class heapSort extends sortStrategy{
     void adjust_heap(int a[], int x, int n)
    {
        int l = x * 2 + 1;
        int r = x * 2 + 2;
        int max = x;

        if(l < n && a[l] > a[max]) max = l;
        if(r < n && a[r] > a[max]) max = r;

        if(max != x)
        {   int temp = a[max];
            a[max] = a[x];
            a[x] = temp;
            adjust_heap(a,max,n);
        }
    }
    @Override
    public  int[] sortImpl(int[] nums) {
        int n = nums.length;
        for(int i = n/2-1; i >= 0; i--)
            adjust_heap(nums, i, n);

        for(int i = n-1; i > 0; i--)
        {
           int temp = nums[0];
           nums[0] = nums[i];
           nums[i] = temp;
            adjust_heap(nums,0,i);
        }
        return nums;
    }

}
