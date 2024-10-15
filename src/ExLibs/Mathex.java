package ExLibs;

import java.util.Arrays;

public class Mathex
{
    // ExLibs.Mathex random methods
        // Base random
    public static double random()
    {
        return Math.random();
    }
        // Random between 2 with ints
    public static int random(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1) + min);
    }
        // Random between 2 with doubles
    public static double random(double min, double max)
    {
        return (Math.random() * ((max - min) + 1) + min);
    }

    // ExLibs.Mathex min and max methods
        // Min of Integer[] values
    public static int min(Integer[] integerArray)
    {
        int smallestVal = integerArray[0];
        for (int i = 0; i < integerArray.length; i++)
        {
            if (smallestVal > integerArray[i])
            {
                smallestVal = integerArray[i];
            }
        }
        return smallestVal;
    }
        // Min of Double[] values
    public static double min(Double[] doubleArray)
    {
        double smallestVal = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++)
        {
            if (smallestVal > doubleArray[i])
            {
                smallestVal = doubleArray[i];
            }
        }
        return smallestVal;
    }
        // Max of Integer[] values
    public static int max(Integer[] integerArray)
    {
        int smallestVal = integerArray[0];
        for (int i = 0; i < integerArray.length; i++)
        {
            if (smallestVal < integerArray[i])
            {
                smallestVal = integerArray[i];
            }
        }
        return smallestVal;
    }
    // Max of Double[] values
    public static double max(Double[] doubleArray)
    {
        double smallestVal = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++)
        {
            if (smallestVal < doubleArray[i])
            {
                smallestVal = doubleArray[i];
            }
        }
        return smallestVal;
    }

    // ExLibs.Mathex pow methods
        // Pow of Integer[] values with an int base
    public static int pow(int base, Integer[] exponentValues)
    {
        double powersTemp = 1.0;
        for(int i = 0; i < exponentValues.length; i++)
        {
            powersTemp *= exponentValues[i];
        }

        base = (int) Math.pow(base, powersTemp);

        return base;
    }
        // Pow of Double[] values with a double base
    public static double pow(double base, Double[] exponentValues)
    {
        double powersTemp = 1.0;
        for(int i = 0; i < exponentValues.length; i++)
        {
            powersTemp *= exponentValues[i];
        }

        base = Math.pow(base, powersTemp);

        return base;
    }

    // ExLibs.Mathex mmmr methods
        // Mean of Integer[] values
    public static double mean(Integer[] integerArray)
    {
        double total = 0;
        for (int i = 0; i < integerArray.length; i++)
        {
            total += integerArray[i];
        }
        return total/integerArray.length;
    }
        // Mean of Double[] values
    public static double mean(Double[] doubleArray)
    {
        double total = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            total += doubleArray[i];
        }
        return total/doubleArray.length;
    }
        // Median of Integer[] values
    public static double median(Integer[] integerArray)
    {
        Arrays.sort(integerArray);
        int length = integerArray.length;
        if (length % 2 == 1)
        {
            return (double) integerArray[length / 2];
        }
        else
        {
            double median = (integerArray[length / 2 - 1] + integerArray[length / 2]) / 2.0;
            return median;
        }
    }
        // Median of Double[] values
    public static double median(Double[] doubleArray)
    {
        Arrays.sort(doubleArray);
        int length = doubleArray.length;
        if (length % 2 == 1)
        {
            return (double) doubleArray[length / 2];
        }
        else
        {
            double median = (doubleArray[length / 2 - 1] + doubleArray[length / 2]) / 2.0;
            return median;
        }
    }
        // Mode of Integer[] values
    public static int mode(Integer[] integerArray)
    {
        Arrays.sort(integerArray);

        int currentMode = integerArray[0];
        int largestMode = currentMode;

        int currentCount = 1;
        int largestCount = currentCount;

        for(int i = 1; i < integerArray.length; i++)
        {
            if (integerArray[i] == currentMode)
            {
                currentCount++;
            }
            else {currentCount = 1;}
            if (currentCount > largestCount)
            {
                largestMode = currentMode;
                largestCount = currentCount;
            }
            currentMode = integerArray[i];
        }
        return largestMode;
    }
        // Mode of Double[] values
    public static double mode(Double[] doubleArray)
    {
        Arrays.sort(doubleArray);

        double currentMode = doubleArray[0];
        double largestMode = currentMode;

        int currentCount = 1;
        int largestCount = currentCount;

        for(int i = 1; i < doubleArray.length; i++)
        {
            if (doubleArray[i] == currentMode)
            {
                currentCount++;
            }
            else {currentCount = 1;}
            if (currentCount > largestCount)
            {
                largestMode = currentMode;
                largestCount = currentCount;
            }
            currentMode = doubleArray[i];
        }
        return largestMode;
    }
        // Range of Integer[] values
    public static int range(Integer[] integerArray)
    {
        Arrays.sort(integerArray);

        return integerArray[integerArray.length - 1] - integerArray[0];
    }
        // Range of Double[] values
    public static double range(Double[] doubleArray)
    {
        Arrays.sort(doubleArray);

        return doubleArray[doubleArray.length - 1] - doubleArray[0];
    }
}
