package Colectii.Pb2;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Double> numbers;


    public static List<Double> power2(List<Double> numbers){
        List<Double> number2 = new ArrayList<>();
        for(Double number: numbers){
            number2.add(Math.pow(number,2));
        }
        return number2;
    }
}
