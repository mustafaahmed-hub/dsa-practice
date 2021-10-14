import java.util.ArrayList;
import java.util.Scanner;

/*
1 : To find the second largest element in an array
        arr = {1, 5, 8, 9, 3, 2};
        Ans - 8
        arr = {5, 5, 5, 5};
*/
public class Q1 {
    static int solve(int[] nums){
        int max2 = -1;
        int mx = -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(mx<nums[i]){
                max2 = mx;
                mx = nums[i];

            }
            else if(max2<nums[i]&& nums[i]!=mx )
                max2 = nums[i];
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line  = scanner.nextLine();
        String [] tokens = line.split(" ");
        int nums[] = new int[tokens.length];
        for(int i=0;i< tokens.length;i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }
        int res = solve(nums);
        if(res==-1){
            System.out.println("no second largest present");
        }
        else
            System.out.println(res);
    }
}
