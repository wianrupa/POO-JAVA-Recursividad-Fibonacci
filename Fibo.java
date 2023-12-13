/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author wilme
 */
public class Fibo {
   
public static void main(String[] args) {
        Fibonacci(72000, 0, 1);
    }

    public static void Fibonacci(int n, int nA, int nS) {
        if (nA <= n) {
            System.out.print(nA + " ");
            Fibonacci(n, nS, nA + nS);
        }
    }
    }


