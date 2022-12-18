package br.com.erudio.restwithspringbootandjavaerudio.math;

public class MathValidator {

    public static boolean isPositive(String strNumber) {
        if(Double.parseDouble(strNumber) * -1 > 0){
            return false;
        }

        return true;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static boolean validateNumeric(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            return false;

        }
        return true;
    }
    public static boolean validatePositive(String number){
        if(!isPositive(number)){
            return false;

        }
        return true;
    }
}
