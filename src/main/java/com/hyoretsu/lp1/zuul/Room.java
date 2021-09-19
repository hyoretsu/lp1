package com.hyoretsu.lp1.zuul;

public class Room {
 private String description;
 private Room northExit;
 private Room southExit;
 private Room eastExit;
 private Room westExit;

 /**
  * Create a room described "description". Initially, it has no exits.
  * "description" is something like "a kitchen" or "an open court yard".
  *
  * @param description The room's description.
  */
 public Room(String description) {
  this.description = description;
 }

 /** @return The description of the room. */
 public String getDescription() {
  return description;
 }

 public Room getExit(String direction) {
  switch (direction) {
   case "north":
    return northExit;
   case "east":
    return eastExit;
   case "south":
    return southExit;
   case "west":
    return westExit;
   default:
    return null;
  }
 }

 /**
  * Return a description of the room’s exits, for example, "Exits: north west".
  *
  * @return A description of the available exits.
  */
 public String getExitString() {
  String options = "Exits: ";

  if (this.northExit != null) {
   options += "north ";
  }
  if (this.eastExit != null) {
   options += "east ";
  }
  if (this.southExit != null) {
   options += "south ";
  }
  if (this.westExit != null) {
   options += "west ";
  }

  return options;
 }

 /**
  * Define the exits of this room. Every direction either leads to another room
  * or is null (no exit there).
  *
  * @param north The north exit.
  * @param east  The east east.
  * @param south The south exit.
  * @param west  The west exit.
  */
 public void setExits(Room north, Room east, Room south, Room west) {
  if (north != null) {
   northExit = north;
  }
  if (east != null) {
   eastExit = east;
  }
  if (south != null) {
   southExit = south;
  }
  if (west != null) {
   westExit = west;
  }
 }
}
