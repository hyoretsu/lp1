package com.hyoretsu.lp1.zuul;

public class CommandWords {
 private static final String[] validCommands = { "go", "quit", "help", "look" };

 /** Constructor - initialise the command words. */
 public CommandWords() {
  // nothing to do at the moment...
 }

 /**
  * Check whether a given String is a valid command word.
  *
  * @return true if a given string is a valid command, false if it isn't.
  */
 public boolean isCommand(String aString) {
  for (int i = 0; i < validCommands.length; i++) {
   if (validCommands[i].equals(aString))
    return true;
  }
  // if we get here, the string was not found in the commands
  return false;
 }
}
