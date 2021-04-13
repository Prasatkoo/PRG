package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    public static int findGreatestCommonDenominator(int a, int b) {
        ArrayList<Integer> array = new ArrayList<>();
        float a2 = (float) a;
        float b2 = (float) b;
        int fin;

        for (int i = 0; i <= a; i++) {
            if (a2 / i == Math.floor(a2 / i)) array.add(i);
        }
        int i = b;
        while (i <= b) {
            if ((b2 / i == Math.floor(b2 / i)) && array.contains(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int findLowestCommonMultiple(int a, int b) {
        ArrayList<Integer> array = new ArrayList<>();
        int a2 = 0;
        int b2 = 0;
        for (int i = 1; i <= b; i++) {
            a2 = a * i;
            array.add(a2);
        }
        int i = 1;
        while (i < a) {
            b2 = b * i;
            if (array.contains(b2)) {
                return b2;
            }
            i++;
        }
        return -1;
    }

}
