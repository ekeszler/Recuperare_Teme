package Colectii.Pb7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> wordList = List.of("ana", "are", "mere", "are");
        wordsCounter(wordList);
    }

    public static void wordsCounter(List<String> wordsList){
        Map<String, Integer> wordCounter = new HashMap<>();

        for(String word: wordsList){
            if(wordCounter.containsKey(word)){
                wordCounter.put(word, wordCounter.get(word) + 1);
            }else{
                wordCounter.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : wordCounter.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
