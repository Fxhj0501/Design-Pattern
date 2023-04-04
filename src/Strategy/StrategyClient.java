package Strategy;

import java.util.Scanner;

public class StrategyClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input the array length: ");
        int n = sc.nextInt();
        System.out.println("please input the element of array: ");
        int[] nums = new int[n];
        for(int i =0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println("please choose the time complexity of sorting method:");
        System.out.println("1:O(n^2)");
        System.out.println("2:O(nlogn)");
        int method = sc.nextInt();
        Context context = new Context(method);
        int[] res = context.st.sortImpl(nums);
        System.out.println("The sorted array is: ");
        for(int x:res)
            System.out.print(x+"");
    }
}
