package net.address;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;  

enum ErrorType {
    INVALID_NUMBER_OF_PARAMETERS,
    INVALID_IP,
}

class Constants {
    public static final Map<ErrorType, String> ERROR_MAP = createMap();
    
    private static Map<ErrorType, String> createMap(){
         Map<ErrorType, String> errorMap = new HashMap<ErrorType, String>();
         errorMap.put(ErrorType.INVALID_NUMBER_OF_PARAMETERS, "Error: INVALID NUMBER OF PARAMETERS");
         errorMap.put(ErrorType.INVALID_IP, "Error: INVALID IP ADDRESS");
         return errorMap;
    }
    public static final String IP_ADDRESS_REGEX
    = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
    + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}