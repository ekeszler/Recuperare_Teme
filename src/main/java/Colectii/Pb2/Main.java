package Colectii.Pb2;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    2. Scrie o metoda care:
//    primeste ca si parametru o lista de numere si returneaza o alta lista de numere formata din numerele din lista primita ca parametru, ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
//    Exemplu:
//    Input: {2,3,4,5}
//    Output: {4,9,16,25}

    public static void main(String[] args) {
        Lista lista = new Lista();
        List<Double> numbers = new ArrayList<>();
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        System.out.println(lista.power2(numbers));


    }


}
