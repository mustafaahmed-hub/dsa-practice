/*Q2 : Given a sentence you have to find which word has come the most number of times
        and if there is a tie than print all of them.
        Example -> sentence = "the have the is a cat dog have"
        Ans -> you should print "have" and "the" as output because both of them comes 2 times
        in the sentence.*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String line ;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        String words[] = line.split(" ");
        Map<String,Integer> cnt = new HashMap<>();
        int mx = 0;
        String ans ="";
        for(String word : words ) {
                if(cnt.containsKey(word))
                    cnt.put(word, cnt.get(word)+1);
                else
                    cnt.put(word,1);

                if(mx<cnt.get(word)) {
                    ans = (word);
                    mx = (cnt.get(word));
                }
        }
        System.out.println(ans);

    }
}
