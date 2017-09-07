package util;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Algorithm extends File {
    public Algorithm(String pathFile) {
        super(pathFile);
    }

    public void Start() {
        Scanner scanner = GetScanner();
        Map wordMap = this.GetWordMap(scanner);
        this.PrintWordMap(wordMap);
    }
    
    private Map GetWordMap(Scanner scanner) {
        Map wordMap = new TreeMap<String, Integer>();

        while (scanner.hasNext()) { 
            String word = scanner.next();
            Integer count = (Integer)wordMap.get(word);
            wordMap.put(word, count == null ? 1 : count + 1);
        }
        return wordMap;
    }
    /*private void SortMap(Map wordMap) {
        List list = new ArrayList(wordMap.entrySet());
        Collections.sort(list, new Comparator() {  
            @Override
            public int compare(Entry e1, Entry e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });
    }*/

    private void PrintWordMap(Map wordMap) {
        for (Object entryObject : wordMap.entrySet()) {
            Entry entry = (Entry)entryObject;  
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }

        /*Iterator itr = wordMap.entrySet().iterator();
        while(itr.hasNext()) {
            Entry entry = (Entry)itr.next();  
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            System.out.println(key + " " + value);
        }*/

    }
}