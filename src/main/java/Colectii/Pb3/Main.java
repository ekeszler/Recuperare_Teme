package Colectii.Pb3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");

        String longest = findLongestWord(words);

        System.out.println(longest);
    }

    public static String findLongestWord(List<String> words){
        if(words == null || words.isEmpty()){
            return null;
        }
        String longestWord = words.get(0);
        for(String word: words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }


}
