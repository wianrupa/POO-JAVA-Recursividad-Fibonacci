
package Recursividad;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author wilmer Ruiz
 */
public class Fibo {
   
public static void main(String[] args) {
       int n;
     do {
            n = Integer.parseInt(JOptionPane.showInputDialog("digite un nùmero entero  "));
        } while (n < 1);
        Fibonacci(n, 0, 1);
    }

    public static void Fibonacci(int n, int nA, int nS) {
        if (nA <= n) {
            System.out.print(nA + " ");
            Fibonacci(n, nS, nA + nS);
        }
    }
    }


