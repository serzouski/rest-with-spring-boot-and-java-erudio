package br.com.erudio.restwithspringbootandjavaerudio.converters;

import br.com.erudio.restwithspringbootandjavaerudio.math.MathValidator;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replaceAll(",",".");
        if (MathValidator.isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }


}
