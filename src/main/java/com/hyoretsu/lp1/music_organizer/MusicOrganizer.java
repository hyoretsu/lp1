package com.hyoretsu.lp1.music_organizer;

import java.util.ArrayList;

public class MusicOrganizer {
 /** An ArrayList for storing the file names of music files. */
 private ArrayList<String> files;

 /** Create a MusicOrganizer */
 public MusicOrganizer() {
  files = new ArrayList<>();
 }

 /**
  * Add a file to the collection.
  *
  * @param filename The file to be added.
  */
 public void addFile(String filename) {
  files.add(filename);
 }

 // Exercise 4.14
 public void checkIndex(Integer index) {
  Integer size = files.size();

  if (index < 0 || index >= size) {
   System.out.println("The valid range for currently stored musics is: 0" + ((size == 1) ? "" : ("~" + (size - 1))));
  }
 }

 /**
  * Return the number of files in the collection.
  *
  * @return The number of files in the collection.
  */
 public int getNumberOfFiles() {
  return files.size();
 }

 /**
  * List a file from the collection.
  *
  * @param index The index of the file to be listed.
  */
 public void listFile(int index) {
  if (index >= 0 && index < files.size()) {
   String filename = files.get(index);
   System.out.println(filename);
  }
 }

 /**
  * Remove a file from the collection.
  *
  * @param index The index of the file to be removed.
  */
 public void removeFile(int index) {
  if (index >= 0 && index < files.size()) {
   files.remove(index);
  }
 }

 // Exercise 4.15
 public Boolean validIndex(Integer index) {
  Integer size = files.size();

  if (index < 0 || index >= size) {
   return false;
  }

  return true;
 }
}
