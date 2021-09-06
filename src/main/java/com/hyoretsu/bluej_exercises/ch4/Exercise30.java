package com.hyoretsu.bluej_exercises.ch4;

public class Exercise30 {
 public void multiplesOfFive() {
  System.out.println("[");

  Integer i = 10;
  while (i <= 95) {
   if (i % 5 == 0) {
    System.out.println(i);
    if (i != 95) {
     System.out.println(", ");
    }
   }

   i += 1;
  }

  System.out.println("]");
 }
}
