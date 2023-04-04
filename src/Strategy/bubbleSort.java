package Strategy;

public class bubbleSort extends sortStrategy{
    @Override
    public  int[] sortImpl(int[] nums) {
        int n = nums.length;
        for(int i = n - 1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
