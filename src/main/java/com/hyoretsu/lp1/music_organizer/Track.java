package com.hyoretsu.lp1.music_organizer;

public class Track {
 /** The artist. */
 private String artist;
 // Exercise 4.37
 public String genre;
 /** The track's title. */
 private String title;
 // Exercise 4.35
 private Integer playCount = 0;
 /** Where the track is stored. */
 private String filename;

 /**
  * Constructor for objects of class Track.
  *
  * @param artist   The track's artist.
  * @param title    The track's title.
  * @param genre    The track's genre.
  * @param filename The track file.
  */
 public Track(String artist, String title, String genre, String filename) {
  // Exercise 4.37
  setDetails(artist, title, genre, filename);
 }

 /**
  * Constructor for objects of class Track. It is assumed that the file name
  * cannot be decoded to extract any other details.
  *
  * @param filename The track file.
  */
 public Track(String filename) {
  setDetails("unknown", "unknown", "unknown", filename);
 }

 /**
  * Return the artist.
  *
  * @return The artist.
  */
 public String getArtist() {
  return artist;
 }

 /**
  * Return details of the track: artist, title and file name.
  *
  * @return The track's details.
  */
 public String getDetails() {
  return artist + ": " + title + "  (file: " + filename + ")";
 }

 /**
  * Return the file name.
  *
  * @return The file name.
  */
 public String getFilename() {
  return filename;
 }

 // Exercise 4.37
 public String getGenre() {
  return this.genre;
 }

 /**
  * Return the title.
  *
  * @return The title.
  */
 public String getTitle() {
  return title;
 }

 // Exercise 4.35
 public void incrementCount() {
  this.playCount += 1;
 }

 // Exercise 4.35
 public void resetCount() {
  this.playCount = 0;
 }

 /**
  * Set details of the track.
  *
  * @param artist   The track's artist.
  * @param title    The track's title.
  * @param genre    The track's genre.
  * @param filename The track file.
  */
 private void setDetails(String artist, String title, String genre, String filename) {
  this.artist = artist;
  this.title = title;
  // Exercise 4.37
  this.genre = genre;
  this.filename = filename;
 }

  // Exercise 4.37
 public void setGenre(String genre) {
  this.genre = genre;
 }
}


 