package net.address;

import java.util.regex.Pattern;

class Parser {
    public static Integer[] ipParser(String strAddress) throws Exception  {
        Pattern pattern = Pattern.compile(Constants.IP_ADDRESS_REGEX);
        if(!pattern.matcher(strAddress).matches()) {
            throw new Exception(Constants.ERROR_MAP.get(ErrorType.INVALID_NUMBER_OF_PARAMETERS));
        }

        Integer[] result = new Integer[4];
        String[] strIntegers = strAddress.split("\\.");
        for(int i = 0; i < strIntegers.length; ++i) {
            result[i] = Integer.parseInt(strIntegers[i]);
        }
        
        return result;
    }
}