/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author dorad
 */
public class Seleccion {

        // Método principal para probar el algoritmo
        public static void main(String[] args) {
        int[] arreglo = {64, 25, 12, 22, 11};

        selectionSort(arreglo, 0, arreglo.length);

        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
        System.out.print(num + " ");
        }
        }

        // Método recursivo para ordenamiento por selección
        public static void selectionSort(int[] arr, int i, int n) {
        // Caso base: si ya llegamos al final del arreglo, terminamos
        if (i + 1 >= n) {
        return;
        }

        // Encontrar el índice del elemento mínimo en el subarreglo [i...n-1]
        int minIndex = encontrarMinimo(arr, i, n);

        // Intercambiar el elemento mínimo encontrado con el elemento en la posición 'i'
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

        // Llamada recursiva para el siguiente índice
        selectionSort(arr, i + 1, n);
        }

        // Método auxiliar recursivo o iterativo para encontrar el índice del menor valor
        private static int encontrarMinimo(int[] arr, int i, int n) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
        minIndex = j;
        }
        }
        return minIndex;
        }

    public static int[] ordenar(int[] arreglo) {
    selectionSort(arreglo, 0, arreglo.length);
    return arreglo;
    }
        }

