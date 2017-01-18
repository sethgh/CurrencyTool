// Author: Michael S.

package michael.currencytool;

public class CurrencyTool {
    private final String[] currencyNames  = {"USD","JPY","BGN","CZK","DKK","GBP","HUF","PLN","RON","SEK","CHF","NOK","HRK","RUB","TRY","AUD","BRL","CAD","CNY","HKD","IDR","ILS","INR","KRW","MXN","MYR","NZD","PHP","SGD","THB","ZAR", "EUR"};
    private double[] baseValues;
    private double[] finalValues;
    private double ratio;
    private int index;

    public CurrencyTool(String currencyName, String[] currencyArray) {
        index = findIndex(currencyName);
        baseValues = buildArray(currencyArray);
        ratio = calculateRatio();
        conversion();
    }

    private double[] buildArray(String[] cArray) {

        double[] temp = new double[cArray.length];
        for (int i=0;i<cArray.length;i++) {
            temp[i] = Double.parseDouble(cArray[i]);
        }
        return temp;
    }

    private double calculateRatio() {
        return baseValues[baseValues.length-1]/baseValues[index];
    }

    private void conversion() {
        double[] temp = new double[baseValues.length];
        for (int i=0;i<baseValues.length;i++) {
            temp[i] = baseValues[i]*ratio;
        }
        finalValues = temp;
    }

    private int findIndex(String cName) {
        for (int i=0;i<currencyNames.length;i++) {
            if (cName.equalsIgnoreCase(currencyNames[i])) {
                return i;
            }
        }
        return 0;
    }

    public double[] returnFinalArray() {
        return finalValues;
    }
}
