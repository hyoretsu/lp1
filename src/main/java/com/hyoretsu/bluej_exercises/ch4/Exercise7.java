package com.hyoretsu.bluej_exercises.ch4;

import com.hyoretsu.lp1.Book;
import com.hyoretsu.lp1.lab_classes.Student;
import java.util.ArrayList;

final class MusicTrack {
}

public class Exercise7 {
 private ArrayList<Student> cs101;
 private ArrayList<Book> library;
 private ArrayList<MusicTrack> tracks;

 public Exercise7() {
  // cs101 = new ArrayList();
  // cs101.add(new Student("Jane Doe", "testId"));
  // library = new ArrayList();
  // library.add(new Book("Jane Doe", "The World of Testing", 10, false));
  // tracks = new ArrayList();
  // tracks.add(new MusicTrack());

  cs101 = new ArrayList<Student>();
  library = new ArrayList<Book>();
  tracks = new ArrayList<MusicTrack>();
 }
}
