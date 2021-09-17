package com.hyoretsu.bluej_exercises.ch6;

import java.util.Random;

public class Exercise17 {
 public static String getResponse() {
  String responses[] = { "yes", "no", "maybe" };

  return responses[new Random().nextInt(3)];
 }
}
