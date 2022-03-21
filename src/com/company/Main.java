package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] java = {-2.3, 6.5, -8.6, 9.3, -8.5, 3.6, -6.2, 1.5, -8.9, 3.6, -96.23, 6.8, -5.99, 2.99, -3.6};
        int onePiece = 0;
        double marsel = 0.0;
        boolean window = false;
        for (double android : java) {
            if (android < 0) {
                window = true;

            }
            else if (window){
                onePiece++;
                marsel += android;
            }
        }
        System.out.println("Среднее арифметичекое число = " + (marsel / onePiece));
    }
}
