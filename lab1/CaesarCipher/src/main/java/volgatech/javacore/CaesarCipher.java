package volgatech.javacore;

class CaesarCipher {
    private static final String ENCRYPTION_MODE = "-e";
    private static final String DECRYPTION_MODE = "-d";
    private static final String LOW_CHAR = "abcdefghijklmnopqrstuvwxyz";
    private static final String HIGH_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public CaesarCipher(String mode, Integer key, String str) throws Exception {
        checkString(str);
        this.mode = mode;
        this.key = key;
        this.str = str; 
        this.cipher = "";
        
        if(mode.equals(ENCRYPTION_MODE)) {
            encryption();
        } else if (mode.equals(DECRYPTION_MODE)) {
            decryption();
        } else {
            throw new Exception("Error: INVALID MODE");
        }

    }

    private void checkString(String str) throws Exception {
        if(!str.matches("^[a-zA-Z]+$")) {
            throw new Exception("Error: INVALID SYMBOL");
        }
    }

    private void encryption() {
        Integer n = LOW_CHAR.length();
        for (int i = 0; i < this.str.length(); i++)
        {
            char replaceVal = this.str.charAt(i);
            String alphabet = (LOW_CHAR.indexOf(replaceVal) >= 0) ? LOW_CHAR : HIGH_CHAR;
            Integer charPosition = alphabet.indexOf(replaceVal);
            Integer keyValue = (n + charPosition - this.key) % n;
            cipher += alphabet.charAt(keyValue);
        }
    }

    private void decryption() {
        Integer n = LOW_CHAR.length();
        for (int i = 0; i < this.str.length(); i++)
        {
            char replaceVal = this.str.charAt(i);
            String alphabet = (LOW_CHAR.indexOf(replaceVal) >= 0) ? LOW_CHAR : HIGH_CHAR;
            Integer charPosition = alphabet.indexOf(replaceVal);
            Integer keyValue = (charPosition + this.key) % n;
            cipher += alphabet.charAt(keyValue);
        }
    }

    public String getCipher() {
        return this.cipher;
    }

    private String mode;
    private Integer key;
    private String str;
    private String cipher;
}