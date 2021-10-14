import java.util.*;

/*Q2 : Given a sentence you have to find which word has come the most number of times
        and if there is a tie than print all of them.
        Example -> sentence = "the have the is a cat dog have"
        Ans -> you should print "have" and "the" as output because both of them comes 2 times
        in the sentence.*/
public class Q7 {
    static void solve(String line){
        String token[] = line.split(" ");
        Map<String,Integer> map  = new HashMap<>();
        int mx = 1;
        for(String word:token)
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
                if(mx<map.get(word)){
                    mx = map.get(word);
                }
            }
            else
                map.put(word,1);
        ArrayList<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(e.getValue()==mx)
                ans.add(e.getKey());
        }
        System.out.println(ans);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        solve(line);
    }
}
