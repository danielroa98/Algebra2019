
package org.danielRoa;

public class PrimeNumbers {

 public static void main(String[] args) {

  for (int n = 2; n <= 100; n++) {

   boolean isPrime = true;

   for (int i = 2; i < n; i++) {

    if (n % i == 0) {

     isPrime = false;

     break;

    } //fin IF

   } //fin FOR

   if (isPrime) {

    System.out.println("\n"+n + " is a prime number");

   } //fin IF

  } //fin FOR

 } //fin Main
}