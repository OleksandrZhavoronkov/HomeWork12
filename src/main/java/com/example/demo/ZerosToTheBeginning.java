package com.example.demo;
//todo: Задан массив целых чисел. Поместить все нули в начало массива.
// Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х},
// порядок ненулевых чисел значения не имеет.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZerosToTheBeginning {
    //Possibility for user to enter something and for program to read something
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter how many digits you would like to put into array: ");
        //The size will for array will be an input from user
        int[] ZerosToTheBeginning = new int [Integer.parseInt(READER.readLine())];
        //Filling the array in, with numbers from the user
        for (int i = 0; i < ZerosToTheBeginning.length; i++) {
            System.out.println("input " + i + " element: ");
            ZerosToTheBeginning[i] = Integer.parseInt(READER.readLine());
        }
        //Displaying an initial array
        System.out.println("Initial Array: " + (Arrays.toString(ZerosToTheBeginning)));
        //Sorting an initial array
        Arrays.sort(ZerosToTheBeginning);
        //Displaying sorted array
        System.out.println("Sorted Array: " + (Arrays.toString(ZerosToTheBeginning)));
    }
}
