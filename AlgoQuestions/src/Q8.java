import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//13. Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class Q8 {
    /*static int binary_search(ArrayList<Integer>nums,int target){
        int st = 0;
        int end = nums.size()-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if()
        }
    }*/
    static void solve(ArrayList<Integer> nums, int sum){
        Map<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        for(int x:nums){
           if(map.containsKey(x))
               map.put(x,map.get(x)+1);
           else
               map.put(x,1);
       }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()!=-1){
                if(map.containsKey(sum-e.getKey())){
                    ans+= e.getValue()*map.get(sum-e.getKey());
                    e.setValue(-1);
                    map.put(sum-e.getKey(),-1);
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int sum = sc.nextInt();
        String token[] = line.split(" ");
        ArrayList<Integer>nums = new ArrayList<>();
        for(String x:token)
            nums.add(Integer.parseInt(x));
        solve(nums,sum);
    }
}
