/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

/**
 *
 * @author dorad
 */
public class Mezcla {

    public static int[] ordenar(int[] arreglo) {
    if (arreglo == null || arreglo.length <= 1) return arreglo;
    mergeSort(arreglo, 0, arreglo.length - 1);
    return arreglo;
    }

        public static void mergeSort(int[] arreglo, int inicio, int fin) {

            // Caso base
            if (inicio < fin) {

                int mitad = (inicio + fin) / 2;

                // Ordenar primera mitad
                mergeSort(arreglo, inicio, mitad);

                // Ordenar segunda mitad
                mergeSort(arreglo, mitad + 1, fin);

                // Mezclar las dos mitades
                mezclar(arreglo, inicio, mitad, fin);
            }
        }

        public static void mezclar(int[] arreglo, int inicio, int mitad, int fin) {

            int[] auxiliar = new int[fin - inicio + 1];

            int i = inicio;
            int j = mitad + 1;
            int k = 0;

            // Comparar ambas mitades
            while (i <= mitad && j <= fin) {

                if (arreglo[i] <= arreglo[j]) {
                    auxiliar[k] = arreglo[i];
                    i++;
                } else {
                    auxiliar[k] = arreglo[j];
                    j++;
                }

                k++;
            }

            // Agregar elementos restantes de la izquierda
            while (i <= mitad) {
                auxiliar[k] = arreglo[i];
                i++;
                k++;
            }

            // Agregar elementos restantes de la derecha
            while (j <= fin) {
                auxiliar[k] = arreglo[j];
                j++;
                k++;
            }

        // Pasar los números ordenados al arreglo original
        System.arraycopy(auxiliar, 0, arreglo, inicio, auxiliar.length);
        }

        public static void main(String[] args) {

            int[] numeros = {8, 3, 5, 1, 9, 6, 2, 4};

            // Ordenar el arreglo
            mergeSort(numeros, 0, numeros.length - 1);

            // Mostrar resultado
            System.out.println("Arreglo ordenado:");

            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
        }
}

