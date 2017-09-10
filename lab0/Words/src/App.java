package volgatech.javacore2017;

import util.Algorithm;

public class App {
    public static void main(String[] args) {
      if(args.length != 2) {
          System.out.println("Error - Input format: words.exe FilePath K");          
      }
      else {
          Algorithm algorithm = new Algorithm(args[0], Integer.parseInt(args[1])); 
          algorithm.Start();
      }
  }
}