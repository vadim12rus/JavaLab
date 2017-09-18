package volgatech.javacore;

class App {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new Exception("Error: INVALID NUMBER OF PARAMETERS");
            }
            PasswordGenerator passwordGenerator = new PasswordGenerator(args[1], Integer.parseInt(args[0]));
            System.out.print(passwordGenerator.getPassword());

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}