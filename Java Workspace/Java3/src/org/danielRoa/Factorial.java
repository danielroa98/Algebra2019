package org.danielRoa;

public class Factorial {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  for (int n = 1; n <= 20; n++) {

   long fact = 1;

   for (int cont = 2; cont <= n; cont++) {

    fact *= (long)cont;

   }

   System.out.println("The factorial of " + n + " is: " + fact);
  }

 }

}