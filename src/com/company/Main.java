package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       double[] java = new double[15];
       java[0] = -2.3;
       java[1] = -3.8;
       java[2] = -2.38;
       java[3] = -8.66;
       java[4] = -6.3;
       java[5] = -2.223;
       java[6] = -8.69;
       java[7] = -9.9;
       java[8] = 7.2;
       java[9] = -4.5;
       java[10] = 2.2;
       java[11] = 8.5;
       java[12] = -8.500;
       java[13] = -9.1;
       java[14] = 4.8;
        for (double android: java) {
            if (java[0] < 0){
                System.out.println((java[8] + java[10] + java[11] + java[14]) / 4);
            }

        }


    }
}
