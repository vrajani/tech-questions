package pl.vrajani.solution.string.ngram;


import java.util.HashMap;

/**
 * Write a function that takes a string of characters and an integer n and returns the most frequent n-gram.
 * Example: for ‘abcdabxe’ and 2 returns ‘ab’. If there are more than one with the same frequency, return the
 * first one you encountered.
 */
public class FrequentNgram {

    private String frequentNgram(String str, int n){
        if(str == null || str.length() < n){
            return null;
        }

        if(str.length() == 1) {
            return str;
        }

        if(n == 1){
            return String.valueOf(str.charAt(0));
        }

        HashMap<String, Integer> ngramsByCount = new HashMap<>();
        int max = 0;
        String ngram = "";
        for(int i = 0 ; i < str.length() - n; i++ ) {
            String curr = str.substring(i, i+n);
            int count = 1;
            if(ngramsByCount.containsKey(curr)){
                count = ngramsByCount.get(curr);
                ngramsByCount.put(curr, count+1);
            } else {
                ngramsByCount.put(curr, count);
            }
            if(count > max){
                max = count;
                ngram = curr;
            }
        }

        return ngram;
    }

    public static void main(String[] args) {
        System.out.println(new FrequentNgram().frequentNgram("abcdabxe", 2));
    }
}
