package util;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.*;

public class Algorithm extends File {
    private final Integer m_k;

    public Algorithm(String pathFile, Integer k) {
        super(pathFile);
        this.m_k = k;
    }

    public void Start() {
        Scanner scanner = GetScanner();
        if(scanner != null)
        {
            Map wordMap = this.GetWordMap(scanner);
            Map<String, Integer> sortedMap = SortByValue(wordMap);
            this.PrintWordMap(sortedMap);
        }
    }
    
    private Map GetWordMap(Scanner scanner) {
        Map wordMap = new HashMap<String, Integer>();

        while (scanner.hasNext()) { 
            String word = scanner.next();
            Integer count = (Integer)wordMap.get(word);
            wordMap.put(word, count == null ? 1 : count + 1);
        }
        return wordMap;
    }


    private static Map<String, Integer> SortByValue(Map<String, Integer> wordMap) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(wordMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }


    private void PrintWordMap(Map wordMap) {
        int i = 0;
        for (Object entryObject : wordMap.entrySet()) {
            Entry entry = (Entry)entryObject;  
            System.out.println(entry.getKey() + " " + entry.getValue());
            ++i;
            if(i == m_k) {
                break;
            }
        }
    }
}