
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
       n = Integer.parseInt(JOptionPane.showInputDialog("digite un valor "));

        Fibonacci(n, 0, 1);
    }

    public static void Fibonacci(int n, int nA, int nS) {
        if (nA <= n) {
            System.out.print(nA + " ");
            Fibonacci(n, nS, nA + nS);
        }
    }
    }


