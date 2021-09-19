package com.hyoretsu.lp1.zuul;

import java.util.HashMap;
import java.util.Map;

public class Room {
 private String description;
 private Map<String, Room> exits = new HashMap<>();

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
  return exits.get(direction);
 }

 /**
  * Return a description of the room’s exits, for example, "Exits: north west".
  *
  * @return A description of the available exits.
  */
 public String getExitString() {
  String options = "Exits:";

  for (String exit : exits.keySet()) {
   options += " " + exit;
  }

  return options;
 }

 /**
  * Return a long description of this room, of the form: "You are in the kitchen.
  * Exits: north west"
  *
  * @return A description of the room, including exits.
  */
 public String getLongDescription() {
  return "You are " + description + ".\n" + this.getExitString();
 }

 /**
  * Define an exit from this room.
  *
  * @param direction The direction of the exit.
  * @param neighbor  The room in the given direction.
  */
 public void setExit(String direction, Room neighbor) {
  exits.put(direction, neighbor);
 }
}
