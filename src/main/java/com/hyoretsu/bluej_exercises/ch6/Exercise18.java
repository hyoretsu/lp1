package com.hyoretsu.bluej_exercises.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exercise18 {
 public static String getResponse() {
  List<String> responses = new ArrayList<>(Arrays.asList("yes", "no", "maybe"));

  return responses.get(new Random().nextInt(responses.size()));
 }
}
