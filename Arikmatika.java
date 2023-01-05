/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_08122022;

/**
 *
 * @author Nila Enjeli
 */
public class Arikmatika {
     public static void main(String[] args)
     {
         int a,b;
         int sum, difference, product, quotient;

         a = Integer.parseInt(args[0]);
         b = Integer.parseInt(args[1]);

         sum = a + b;
         difference = a - b;
         product = a * b;
         quotient = a / b;

         System.out.println("Sum ="+sum);
         System.out.println("Difference ="+difference);
         System.out.println("Produk ="+product);
         System.out.println("Quotient ="+quotient);
      }
}
