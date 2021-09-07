package com.hyoretsu.lp1.auction;

import java.util.ArrayList;

public class Auction {
 /** The list of Lots in this auction. */
 private ArrayList<Lot> lots;
 /** The number that will be given to the next lot entered into this auction. */
 private int nextLotNumber;

 /** Create a new auction. */
 public Auction() {
  lots = new ArrayList<>();
  nextLotNumber = 1;
 }

 // Exercise 4.48
 public void close() {
  for (Lot lot : lots) {
   System.out.println(lot.getDescription());

   Bid lotBid = lot.getHighestBid();
   if (lotBid != null) {
    System.out.println("This lot was purchased by " + lotBid.getBidder() + " for the value of " + lotBid.getValue());
   } else {
    System.out.println("This lot doesn't have any bidders yet");
   }
  }
 }

 /**
  * Enter a new lot into the auction.
  *
  * @param description A description of the lot.
  */
 public void enterLot(String description) {
  lots.add(new Lot(nextLotNumber, description));
  nextLotNumber++;
 }

 /**
  * Return the lot with the given number. Return null if a lot with this number
  * does not exist.
  *
  * @param lotNumber The number of the lot to return.
  */
 public Lot getLot(int lotNumber) {
  // The number seems to be reasonable.
  if ((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
   // Exercise 4.51
   Lot selectedLot = null;

   for (Lot lot : lots) {
    if (lot.getNumber() == lotNumber) {
     selectedLot = lot;
     break;
    }
   }

   // Include a confidence check to be sure we have the
   // right lot.
   if (selectedLot.getNumber() != lotNumber) {
    System.out
      .println("Internal error: Lot number " + selectedLot.getNumber() + " was returned instead of " + lotNumber);
    // Don't return an invalid lot.
    selectedLot = null;
   }
   return selectedLot;
  } else {
   System.out.println("Lot number: " + lotNumber + " does not exist.");
   return null;
  }
 }

 // Exercise 4.49
 public ArrayList<Lot> getUnsold() {
  ArrayList<Lot> unsoldLots = new ArrayList<>();

  lots.forEach(lot -> {
   if (lot.getHighestBid() == null) {
    unsoldLots.add(lot);
   }
  });

  return unsoldLots;
 }

 /**
  * Make a bid for a lot. A message is printed indicating whether the bid is
  * successful or not.
  *
  * @param lotNumber The lot being bid for.
  * @param bidder    The person bidding for the lot.
  * @param value     The value of the bid.
  */
 public void makeABid(int lotNumber, Person bidder, long value) {
  Lot selectedLot = getLot(lotNumber);
  if (selectedLot != null) {
   // Exercise 4.47
   boolean successful = selectedLot.bidFor(new Bid(bidder, value));
   if (successful) {
    System.out.println("The bid for lot number " + lotNumber + " was successful.");
   } else {
    // Report which bid is higher.
    Bid highestBid = selectedLot.getHighestBid();
    System.out.println("Lot number: " + lotNumber + " already has a bid of: " + highestBid.getValue());
   }
  }
 }

 /**
  * Remove the lot with the given lot number.
  *
  * @param number The number of the lot to be removed.
  * @return The Lot with the given number, or null if there is no such lot.
  */
 public Lot removeLot(int number) {
  // Exercise 4.52
  for (Integer i = 0; i < lots.size(); i++) {
   Lot lot = lots.get(i);

   if (lot.getNumber() == number) {
    lots.remove(i);

    return lot;
   }
  }

  return null;
 }

 /** Show the full list of lots in this auction. */
 public void showLots() {
  for (Lot lot : lots) {
   System.out.println(lot.toString());
  }
 }
}
