package com.hyoretsu.lp1.music_organizer;

import java.util.ArrayList;

public class MusicOrganizer {
 /** An ArrayList for storing music tracks. */
 private ArrayList<Track> tracks;
 /** A player for the music tracks. */
 private MusicPlayer player;
 /** A reader that can read music files and load them as tracks. */
 private TrackReader reader;

 /** Create a MusicOrganizer */
 public MusicOrganizer() {
  tracks = new ArrayList<>();
  player = new MusicPlayer();
  reader = new TrackReader();
  readLibrary("../audio");
  System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
  System.out.println();
 }

 /**
  * Add a track file to the collection.
  *
  * @param filename The file name of the track to be added.
  */
 public void addFile(String filename) {
  tracks.add(new Track(filename));
 }

 /**
  * Add a track to the collection.
  *
  * @param track The track to be added.
  */
 public void addTrack(Track track) {
  tracks.add(track);
 }

 // Exercise 4.14
 public void checkIndex(Integer index) {
  Integer size = tracks.size();

  if (index < 0 || index >= size) {
   System.out.println("The valid range for currently stored musics is: 0" + ((size == 1) ? "" : ("~" + (size - 1))));
  }
 }

 /**
  * Find the index of the first track matching the given search string.
  *
  * @param searchString The string to match.
  * @return The index of the first occurrence, or -1 if no match is found.
  */
 public int findFirst(String searchString) {
  int index = 0;
  // Record that we will be searching until a match is found.
  boolean searching = true;

  // Exercise 4.34
  Integer totalSize = tracks.size();

  while (searching && index < totalSize) {
   String filename = tracks.get(index).getFilename();
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
  * Return the number of tracks in the collection.
  *
  * @return The number of tracks in the collection.
  */
 public int getNumberOfTracks() {
  return tracks.size();
 }

 /** Show a list of all the tracks in the collection. */
 public void listAllTracks() {
  System.out.println("Track listing: ");

  for (Track track : tracks) {
   System.out.println(track.getDetails());
  }
  System.out.println();
 }

 /**
  * List all tracks by the given artist.
  *
  * @param artist The artist's name.
  */
 public void listByArtist(String artist) {
  for (Track track : tracks) {
   if (track.getArtist().contains(artist)) {
    System.out.println(track.getDetails());
   }
  }
 }

 /**
  * List a track from the collection.
  *
  * @param index The index of the track to be listed.
  */
 public void listTrack(int index) {
  if (validIndex(index)) {
   System.out.print("Track " + index + ": ");
   Track track = tracks.get(index);
   System.out.println(track.getDetails());
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

  for (Integer i = 0; i < tracks.size(); i++) {
   String file = tracks.get(i).getFilename();

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
   String filename = tracks.get(index).getFilename();
   player.playSample(filename);
  }
 }

 /** Play the first track in the collection, if there is one. */
 public void playFirst() {
  if (tracks.size() > 0) {
   // Exercise 4.36
   Track track = tracks.get(0);

   player.startPlaying(track.getFilename());
   track.incrementCount();
  }
 }

 // Exercise 4.27
 public void playSamples(String artist) {
  tracks.forEach(track -> {
   if (track.getArtist().contains(artist)) {
    player.playSample(track.getFilename());
   }
  });
 }

 /**
  * Play a track in the collection.
  *
  * @param index The index of the track to be played.
  */
 public void playTrack(int index) {
  if (validIndex(index)) {
   Track track = tracks.get(index);
   player.startPlaying(track.getFilename());
   System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
  }
 }

 private void readLibrary(String folderName) {
  ArrayList<Track> tempTracks = reader.readTracks(folderName, ".mp3");

  // Put all the tracks into the organizer.
  for (Track track : tempTracks) {
   addTrack(track);
  }
 }

 /**
  * Remove a track from the collection.
  *
  * @param index The index of the track to be removed.
  */
 public void removeTrack(int index) {
  if (validIndex(index)) {
   tracks.remove(index);
  }
 }

 /**
  * Start playing a file in the collection. Use stopPlaying() to stop it playing.
  *
  * @param index The index of the file to be played.
  */
 public void startPlaying(int index) {
  if (validIndex(index)) {
   String filename = tracks.get(index).getFilename();
   player.startPlaying(filename);
  }
 }

 /** Stop the player. */
 public void stopPlaying() {
  player.stop();
 }

 // Exercise 4.15
 public Boolean validIndex(Integer index) {
  Integer size = tracks.size();

  if (index < 0 || index >= size) {
   return false;
  }

  return true;
 }
}
