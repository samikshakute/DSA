package com.samiksha;

// Depreciation refers to the decrease of price of a product/asset over time. As we know every product/asset has its own life span. So, during it’s life span with the pass of time its value reduces due to use, wear and tear.
// formula to calculate depreciation is: V2 = V1[1-r/100] ^ t
// where V1 is the value at a certain time and r% per annum is the rate(the rate cannot be more than 100%) of depreciation per year and T denotes the number of years.
public class DepreciationOfVal {
    public static double deprecation(double v, double r, double t) {
        double d = (v * Math.pow((1 - r / 100), t));
        return d;
    }

    public static void main(String[] args) {
        double v = 200, r = 10, t = 2;
        System.out.println("Depreciation = " + deprecation(v, r, t));
    }
}
