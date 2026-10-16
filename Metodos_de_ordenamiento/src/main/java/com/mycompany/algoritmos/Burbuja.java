/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author dorad
 */
public class Burbuja {
    public static void bubbleSort(int[] arr, int n) {
        if (n <= 1) return; // caso base

        for (int j = 0; j < n - 1; j++) { // vecinos
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1); // con un elemento menos
    }

    // Este método es el que va a llamar tu vista, no llames a bubbleSort directo
    public static int[] ordenar(int[] arr) {
        bubbleSort(arr, arr.length);
        return arr;
    }
}
