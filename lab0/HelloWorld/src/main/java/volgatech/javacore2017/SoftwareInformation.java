package volgatech.javacore2017;

public class SoftwareInformation {
    public static void PrintSoftwareInformation() {
        System.out.printf("%s ", System.getProperty("os.name"));
        System.out.printf("%s ",System.getProperty("os.version"));
        System.out.printf("%s ",System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
    }
}