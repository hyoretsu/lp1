package com.hyoretsu.lp1.music_organizer;

import java.util.ArrayList;

public class MusicOrganizer {
 /** An ArrayList for storing the file names of music files. */
 private ArrayList<String> files;
 /** A player for the music files. */
 private MusicPlayer player;

 /** Create a MusicOrganizer */
 public MusicOrganizer() {
  files = new ArrayList<>();
  player = new MusicPlayer();
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
  * Find the index of the first file matching the given search string.
  *
  * @param searchString The string to match.
  * @return The index of the first occurrence, or -1 if no match is found.
  */
 public int findFirst(String searchString) {
  int index = 0;
  // Record that we will be searching until a match is found.
  boolean searching = true;

  // Exercise 4.34
  Integer totalSize = files.size();

  while (searching && index < totalSize) {
   String filename = files.get(index);
   if (filename.contains(searchString)) {
    // A match. We can stop searching.
    searching = false;
   } else {
    // Move on.
    index++;
   }
  }
  if (searching) {
   // We didn't find it.
   return -1;
  } else {
   // Return where it was found.
   return index;
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

 // Exercise 4.18
 public void listAllFiles() {
  // Exercise 4.24
  for (Integer i = 0; i < files.size(); i++) {
   System.out.println(i + ": " + files.get(i));
  }
 }

 /**
  * List a file from the collection.
  *
  * @param index The index of the file to be listed.
  */
 public void listFile(int index) {
  if (validIndex(index)) {
   String filename = files.get(index);
   System.out.println(filename);
  }
 }

 /**
  * List the names of files matching the given search string.
  *
  * @param query The string to match.
  */
 public void listMatching(String query) {
  // Exercise 4.26
  Boolean found = false;

  for (Integer i = 0; i < files.size(); i++) {
   String file = files.get(i);

   if (file.contains(query)) {
    System.out.println(file);

    // Exercise 4.26
    if (!found) {
     found = true;
    }
   }
  }

  // Exercise 4.26
  if (!found) {
   System.out.println("No files were found");
  }
 }

 /**
  * Play a file in the collection. Only return once playing has finished.
  *
  * @param index The index of the file to be played.
  */
 public void playAndWait(int index) {
  if (validIndex(index)) {
   String filename = files.get(index);
   player.playSample(filename);
  }
 }

 // Exercise 4.27
 public void playSamples(String artist) {
  files.forEach(file -> {
   if (file.contains(artist)) {
    player.playSample(file);
   }
  });
 }

 /**
  * Remove a file from the collection.
  *
  * @param index The index of the file to be removed.
  */
 public void removeFile(int index) {
  if (validIndex(index)) {
   files.remove(index);
  }
 }

 /**
  * Start playing a file in the collection. Use stopPlaying() to stop it playing.
  *
  * @param index The index of the file to be played.
  */
 public void startPlaying(int index) {
  if (validIndex(index)) {
   String filename = files.get(index);
   player.startPlaying(filename);
  }
 }

 /** Stop the player. */
 public void stopPlaying() {
  player.stop();
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
