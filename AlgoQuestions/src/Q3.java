/*
Q3 : To find the element which is out of order in an array which contains
        elements in a sequence.
        Example ->  arr = {5, 4, 3, 1, 2};
        Ans -> 1 should be the output
*/

import java.util.Scanner;

public class Q3 {
    static int solve(int nums[]){
        int idx = - 1;
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tokens[] = line.split(" ");
        int nums[] = new int[tokens.length];
        for(int i=0;i< tokens.length;i++)
            nums[i] = Integer.parseInt(tokens[i]);
        solve(nums);
    }
}
