package util;

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.Map;


public class File {
    private final String m_pathFile;
    
    File(String pathFile) {
        this.m_pathFile = pathFile;
        
    }

    public Scanner GetScanner() {
        Scanner scanner = null;
        try {
            FileReader file = new FileReader(this.m_pathFile);
            scanner = new Scanner(new BufferedReader(file));
        } catch(FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return scanner;
    }
}