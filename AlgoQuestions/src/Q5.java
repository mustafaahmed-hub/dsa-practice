/*
 Find out the max length word which is common in two string.
        Example1 :
        S1 = “I am java developer”
        S2= “hello java”
        Ans : 4	// because “java” word is common and length is 4.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    static String solve(String line1,String line2){
        String word1[] = line1.split(" ");
        String word2[] = line2.split(" ");
        String res = "";
        Map<String,Integer>map1 = new HashMap<>();
        for(String w:word2){
            if(map1.containsKey(w))
                map1.put(w,map1.get(w)+1);
            else
                map1.put(w,1);
        }
        for(String w1:word1){
            if(res.length()<w1.length())
                if(map1.containsKey(w1)){
                    res = w1;
                }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String ans = solve(line1,line2);
        System.out.println(ans);
        System.out.println(ans.length());

    }
}
