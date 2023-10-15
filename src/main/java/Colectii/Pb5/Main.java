package Colectii.Pb5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("nu");
        words.add("are");
        words.add("mere");
        System.out.println(listaInversata(words));
    }

    public static List<String> listaInversata(List<String> words){
        Collections.reverse(words);
        for(String word: words){
            if(word.length()<3){
                words.remove(word);
            }
        }
        return words;
    }
}
