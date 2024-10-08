import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println(5/2);
    }

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int totalSum = 0;
        for (int j : totalWasteKgPerCapitaPerYear) {
            totalSum += j;
        }

        return totalSum/totalWasteKgPerCapitaPerYear.length+1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int medianValue = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int middle = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
        if(totalWasteKgPerCapitaPerYear.length%2 == 0){
            int secondValue = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2+1];
            medianValue = (middle + secondValue)/2;
        }
        else{
            medianValue = middle;
        }

        return medianValue;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int indexOfCountry = 0;
        for(int i = 0; i< countries.length; i++){
            if(countries[i].equals(country)){
                indexOfCountry = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[indexOfCountry];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int countryWithMostWasteIndex = 0;
        for(int i = 0; i<totalWasteKgPerCapitaPerYear.length; i++){
            if (totalWasteKgPerCapitaPerYear[i] > totalWasteKgPerCapitaPerYear[i+1]) {
                countryWithMostWasteIndex = i;
            }
        }
        return countries[countryWithMostWasteIndex];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double greatestPercent = getMaxPercent(percentagesShareInPoverty);

        int count = 0;
        for(int i = 0; i<percentagesShareInPoverty.length; i++){
            if(percentagesShareInPoverty[i] == greatestPercent) {
                count++;
            }
        }

        String[] highestCountries = new String[count];
        int currentIndex = 0;
        for(int i = 0; i<percentagesShareInPoverty.length; i++){
            if(percentagesShareInPoverty[i] == greatestPercent) {
                highestCountries[currentIndex] = countries[i];
                currentIndex++;
            }
        }
        return highestCountries;
    }

    public static double getMaxPercent(double[] percentagesShareInPoverty){
        double greatestPercent = percentagesShareInPoverty[0];
        for(double i: percentagesShareInPoverty) if (greatestPercent < i) greatestPercent = i;

        return greatestPercent;
    }


//        double[] sortedPercentages = percentagesShareInPoverty;
//        Arrays.sort(sortedPercentages);
//        double highestPovertyIndex = sortedPercentages[sortedPercentages.length-1];
//
//        int count = 0;
//        for(int i = 0; i<sortedPercentages.length-1; i++){
//            if(percentagesShareInPoverty[i] == highestPovertyIndex){
//                count +=1;
//            }
//        }
//
//        String[] highestCountries = new String[count];
//        for(int i = 0; i<percentagesShareInPoverty.length; i++){
//            if (percentagesShareInPoverty[i] == highestPovertyIndex){
//                for(int j = 0; j<count; j++) {
//                    highestCountries[j] =countries[i];
//                }
//            }
//        }
//        return highestCountries;



    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        String[] countriesWithHigh = new String[countHighs(confidences)];
        int currentIndex = 0;
        for(int i = 0; i<confidences.length; i++){
            if(confidences[i].equals("High Confidence")){
                countriesWithHigh[currentIndex] = countries[i];
                currentIndex++;
            }
        }

        return countriesWithHigh;
    }

    public static int countHighs(String[] confidences){
        int count = 0;
        for(String i: confidences) if (i.equals("High Confidence")) count++;
        return count;
    }
}
