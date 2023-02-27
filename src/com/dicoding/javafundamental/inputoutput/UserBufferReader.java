package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;

        System.out.print("Masukkan angka pertama : ");
        value = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Masukkan angka kedua : ");
        anotherValue = Integer.parseInt(bufferedReader.readLine());

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah " + result);
    }
}
