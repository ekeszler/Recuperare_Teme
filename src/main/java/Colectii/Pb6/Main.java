package Colectii.Pb6;

import java.util.HashSet;
import java.util.Set;

public class Main {

        public static void main(String[] args) {
            Set<String> set = new HashSet<>();
            set.add("A");
            set.add("B");
            set.add("C");

            afiseazaSet(set);
        }

        public static void afiseazaSet(Set<String> set) {
            for (String element : set) {
                System.out.print(element + " ");
            }
        }

}
