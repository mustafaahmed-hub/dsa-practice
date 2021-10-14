import java.util.Scanner;

/*[1] Given an array [5, 6, 7, 8, 9, …….. n] which has numbers in sequence and incremented order by 1 only.
        Then suppose we replaces any one number in this series with random number.
        Now due to random number it is not in sequence and not in incremented order.
        Find out the index of random number in minimum time complexity.*/
public class Q4 {
    static int solve(int nums[]){
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]!=1){
                if(i==n-1)
                    return i;
                else if(nums[i+1]-nums[i]!=1)
                    return i;
                else
                    return i-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tokens[] = line.split(" ");
        int nums[] = new int[tokens.length];
        for(int i=0;i< tokens.length;i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }
        int res = solve(nums);
        System.out.println(res);

    }
}
