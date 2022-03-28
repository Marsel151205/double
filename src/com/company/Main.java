package com.company;

public class Main {

    public static void main(String[] args) {
        double[] java = {-2.3, 6.5, -8.6, 9.3, -8.5, 3.6, -6.2, 1.5, -8.9, 3.6, -96.23, 6.8, -5.99, 2.99, -3.6};
        double sum = 0.0;
        int col = 0;
        boolean isNegative = false;

        for (double value:java) {
            if (value < 0){
                isNegative = true;
            }else if (isNegative){
                sum = sum + value;
                col ++;
            }
        }
        double answer = sum / col;
        System.out.println("Answer: " + answer);
    }
}