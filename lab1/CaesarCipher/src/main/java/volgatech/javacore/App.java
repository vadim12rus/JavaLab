package volgatech.javacore;

class App {
    public static void main(String[] args) {
        try {
            if(args.length != 3) {
                throw new Exception("Error: INVALID NUMBER OF PARAMETERS");
            }
            CaesarCipher caesarCipher = new CaesarCipher(args[0], Integer.parseInt(args[1]), args[2]);
            System.out.println(caesarCipher.getCipher());

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}