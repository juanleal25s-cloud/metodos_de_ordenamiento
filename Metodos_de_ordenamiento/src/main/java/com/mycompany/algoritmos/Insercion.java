/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author dorad
 */
public class Insercion {
    
        public static void insertionSortRec(int[]
        a, int n) {
        if (n <= 1) return;
        insertionSortRec(a, n - 1);
        int key = a[n - 1];
        int j = n - 2;
        while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
        }
        a[j + 1] = key;
        }
        public static int[] ordenar(int[] a) {
        insertionSortRec(a, a.length);
        return a;
        }
}
