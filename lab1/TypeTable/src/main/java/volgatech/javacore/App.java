package volgatech.javacore;

class App {
    public static void main(String[] args) {
        PrintType();
    }

    public static void PrintType() {
        System.out.printf("%-10s%-25s%-25s%-2s%n","Type","Min","Max","Size");
        System.out.printf("%-10s%-25d%-25d%-2d%n", "Long", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE / 8);
        System.out.printf("%-10s%-25d%-25d%-2d%n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE / 8);
        System.out.printf("%-10s%-25d%-25d%-2d%n", "Short", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE / 8);
        System.out.printf("%-10s%-25d%-25d%-2d%n", "Byte", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE / 8);
        System.out.printf("%-10s%-25d%-25d%-2d%n", "Char", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE, Character.SIZE / 8);
        System.out.printf("%-10s%-25s%-25s%-2d%n", "Float", Float.MIN_VALUE, Float.MAX_VALUE, Float.SIZE / 8);
        System.out.printf("%-10s%-25s%-25s%-2d%n", "Double", Double.MIN_VALUE, Double.MAX_VALUE, Double.SIZE / 8);
    }
}