/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author dorad
 */
public class Rapido {
    public static void quickSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int indiceParticion = particion(arr, izq, der);
            quickSort(arr, izq, indiceParticion - 1);
            quickSort(arr, indiceParticion + 1, der);
        }
    }

    public static int particion(int[] arr, int izq, int der) {
        int pivote = arr[der];
        int i = (izq - 1);
        for (int j = izq; j < der; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[der];
        arr[der] = temp;
        return i + 1;
    }

    // ESTE ES EL QUE LLAMA TU BOTON rapidobtn / quicksortbtn
    public static int[] ordenar(int[] arreglo) {
        if (arreglo == null || arreglo.length <= 1) return arreglo;
        quickSort(arreglo, 0, arreglo.length - 1);
        return arreglo;
    }
}
