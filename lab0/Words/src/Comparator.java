package util;

import java.util.Comparator;

public class Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return num1 < num2 ? 1 : -1;
    }
    
}