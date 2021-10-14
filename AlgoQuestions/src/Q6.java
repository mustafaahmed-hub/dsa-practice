/*
[4] Suppose given an array [1, 2, 3, 4, 5]. and shift number n is given. Based on shift number array elements has to shift right to left.
        Exmaple1 :
        Shift number : 1 	// n=1
        Then new array would be : [ 2, 3, 4, 5, 1]
        Example2:
        Shift number: 2		// n=2
        Then new array would be : [ 3, 4, 5, 1, 2]
*/

import java.util.Scanner;


public class Q6 {
    static int gcd(int a , int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    static void solve(int nums[],int k){
            int n = nums.length;
            k = k%n;
            int g = gcd(n,k);
            for(int i=0;i<g;i++){
                int j = i;
                while(true){
                    int upd = (j+k)%n;
                    if(upd==i)
                        break;
                    nums[j] = nums[j]+nums[upd];
                    nums[upd] = nums[j]-nums[upd];
                    nums[j] = nums[j]-nums[upd];
                    j = upd;
                }


            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k = sc.nextInt();
        String token[] = line.split(" ");
        int nums[] = new int[token.length];
        for(int i=0;i< nums.length;i++)
            nums[i] = Integer.parseInt(token[i]);
        solve(nums,k);
        for(int num:nums)
            System.out.print(num+" ");
    }
}
