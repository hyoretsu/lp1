package com.hyoretsu.bluej_exercises.ch4;

public class Exercise33 {
 public Boolean isPrime(Integer number) {
  Integer i = 2;
  while (i < number) {
   if (number % i == 0) {
    return false;
   }
  }

  return true;
 }
}
