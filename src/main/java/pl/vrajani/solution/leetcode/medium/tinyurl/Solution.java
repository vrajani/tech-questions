package pl.vrajani.solution.leetcode.medium.tinyurl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    private static final String TINY_URL_DOMAIN = "www.tinyurl.com/";
    private static final String ALPHABET= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Map<String, String> urlMap = new HashMap<>();

    Random random = new Random();

    public String getRand() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getRand();
        while(urlMap.containsKey(key)){
            key = getRand();
        }
        urlMap.put(key, longUrl);
        return TINY_URL_DOMAIN + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        return urlMap.get(shortUrl.replace(TINY_URL_DOMAIN, ""));
    }

    public static void main(String[] args) {
        String url = "www.linkedin.com/abcxuyd12nj";

        Solution solution = new Solution();
        String encodedUrl = solution.encode(url);
        System.out.println(encodedUrl);
        System.out.println(solution.decode(encodedUrl));
    }
}
