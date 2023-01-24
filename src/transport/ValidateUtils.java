package transport;

import java.util.regex.Pattern;

public class ValidateUtils {
    public static String validateOfCarParameters (String parameter) {
        if(parameter == null || parameter.trim().isEmpty()) {
            parameter = "Default";
        }
        return parameter;
    }

    public static String validateOfCarColor (String parameter) {
        if(parameter == null || parameter.trim().isEmpty()) {
            parameter = "белый";
        }
        return parameter;
    }

    public static int validateOfCarYear (Integer parameter) {
        if(parameter <= 1769 || parameter == null) {
            parameter = 2000;
        }
        return parameter;
    }

    public static double validateOfCarEngineVolume (Double parameter) {
        if(parameter <= 0 || parameter == null) {
            parameter = 1.5;
        }
        return parameter;
    }

    public static int validateOfCarNumberOfSeats (Integer parameter) {
        if(parameter < 2 || parameter > 7 || parameter == null) {
            parameter = 5;
        }
        return parameter;
    }

    public static String validateRegistrationNumber(String number) {
        if (Pattern.matches("[А-Я][0-9]{3}[А-Я]{2}[0-9]{2,3}", number)) {
            return number;
        }
        return "Некорректный номер";
    }

    public static int validateOfMaximumSpeed (Integer parameter) {
        if(parameter < 80 || parameter > 500 || parameter == null) {
            parameter = 200;
        }
        return parameter;
    }

    public static boolean validateOfParameters (Boolean parameter){
        if(parameter != null) {
            return parameter;
        }
        return parameter;
    }
}
