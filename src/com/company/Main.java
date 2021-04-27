package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printHelloWorld();
    getNumbersFrom1To100();
    getNumbersFrom100To1();
    evenNumbersFrom1to100();
        returnTemperatureInFarenhite();
        int[] numbers = {6, 5, 1, 12, 7};
        multicipation(5, -5);
        silnia(5);
        potegowanie(5,2);
        maxAndMin(numbers);
        HowManyTimes(numbers,5);
        howManyElements(numbers);
      reverseTable(numbers);
        sort(numbers);
        srednia(numbers);
        //zadania

    }

    // wypisz hello world
    private static void printHelloWorld() {
        System.out.println("Hello world");
    }

    //petla 1-100
    private static void getNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //petla 100-1
    private static void getNumbersFrom100To1() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    //parzyste liczby 1-100
    public static void evenNumbersFrom1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //do while + scanner
    //wypisz 5 imion i wskaż najkrótszy element i najdluzszy
    //wypisz liczby parzyste

    //scanner zwroc temperature w farenhita
    public static void returnTemperatureInFarenhite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę (w stopniach Celsjusza):");
        double temperatura = scanner.nextInt();
        double stopnieFarenheita = (temperatura * 1.8) + 32.0;
        System.out.println("Temperatura Farenheita to: " + stopnieFarenheita);
    }

    //sortowanie
    private static void sort(int[] numbers) {
//        int [] numbers = {6,5,1,12,7};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("sort:" + Arrays.toString(numbers));
    }

    //odwrcanie tablicy
    private static void reverseTable(int[] numbers) {
        int temporary = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            temporary = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temporary;
        }
        System.out.println("reverseTable:" + Arrays.toString(numbers));
    }

    // ile jest elementow
    private static void howManyElements(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter = numbers.length;
        }
        //lub po prostu numbers.length
        System.out.println("liczba elementow w tablicy to :" + counter);
    }

    // ile razy wystepuje w tablicy
    private static void HowManyTimes(int[] numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                counter++;
            }
        }
        System.out.println(number + " wystapuje w tablicy " + counter + " razy");
    }

    //max i min
    private static void maxAndMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max to : " + max + "Min to " + min);
    }

    //potegowanie
    private static void potegowanie(int liczba, int wykladnik) {
        int score = 1;
        for (int i = 1; i <= wykladnik; i++) {
            score *= liczba;
        }
        System.out.println(liczba + " do potęgi " + wykladnik + " to " + score);
    }

    //silnia
    private static void silnia(int number) {
        int score = 1;
        for (int i = 1; i <= number; i++) {
            score *= i;
        }
        System.out.println("silnia: " + score);
    }

    //mnozenie
    public static void multicipation(int numbA, int numbB) {

        int score = 0;
        if (numbB < 0) {
            for (int i = 0; i > numbB; i--) {
                score -= numbA;
            }
            System.out.println(numbA + " razy " + numbB + " to " + score);
        } else if (numbB > 0) {
            for (int i = 0; i < numbB; i++) {
                score += numbA;
            }
            System.out.println(numbA + " razy " + numbB + " to " + score);
        }

    }

    private static double srednia(int[] tablica) {
        double srednia = 0;
        for (int i = 0; i < tablica.length; i++) {
            srednia += tablica.length;
        }
        srednia /= tablica.length;
        System.out.println("Srednia arytmetyczna tablicy to" + srednia);
        return srednia;
    }

}
