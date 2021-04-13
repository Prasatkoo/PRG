package cz.educanet;

import javax.xml.stream.FactoryConfigurationError;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction plus(Fraction other) {
        int pls = MathUtils.findLowestCommonMultiple(denominator, other.getDenominator());
        int a = pls/denominator;
        int b = pls/ other.getDenominator();
        int numa = numerator * a;
        int numb = other.numerator * b;
        int fracfin = numa + numb;
        return new Fraction(fracfin,pls);
    }
    public Fraction minus(Fraction other) {
        int min = MathUtils.findLowestCommonMultiple(denominator, other.getDenominator());
        int a = min/denominator;
        int b = min/ other.getDenominator();
        int numa = numerator * a;
        int numb = other.numerator * b;
        int fracfin = numa - numb;
        return new Fraction(fracfin, min);
    }
    public Fraction times(Fraction other) {
        int num = numerator * other.getNumerator();
        int den = denominator * other.getDenominator();

      return new Fraction(num,den);
    }
    public Fraction dividedBy(Fraction other) {
        int num = numerator * other.getDenominator();
        int den = denominator * other.getNumerator();

        return new Fraction(num,den);
    }
    public Fraction getReciprocal() {
        return new Fraction(getDenominator(),getNumerator());

    }
    public Fraction simplify() {
        int simp = MathUtils.findGreatestCommonDenominator(numerator,denominator);
        int simp2 = numerator/simp;
        int simp3 = denominator / simp;
        return new Fraction(simp2,simp3);
    }
    public float toFloat() {
        return (float)numerator / (float)denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }



}
