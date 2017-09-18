package volgatech.javacore;

import java.util.Random;

class PasswordGenerator {

    public PasswordGenerator (String charSet, Integer length) {
        this.length = length;
        this.charSet = charSet;
    }

    public String getPassword() {
        String password = "";
        Integer maxIndex = charSet.length();
        Random rand = new Random();
        for(int i = 0; i < length; ++i) {
            Integer randomIndex = rand.nextInt(maxIndex); // [0, maxIndex)
            password += charSet.charAt(randomIndex);
        }
        return password;
    }

    private Integer length;
    private String charSet;
}