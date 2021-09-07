package com.hyoretsu.lp1.products;

import java.util.ArrayList;

public class StockManager {
 /** A list of the products. */
 private ArrayList<Product> stock;

 /** Initialise the stock manager. */
 public StockManager() {
  stock = new ArrayList<>();
 }

 /**
  * Add a product to the list.
  *
  * @param item The item to be added.
  */
 public void addProduct(Product item) {
  stock.add(item);
 }

 /**
  * Receive a delivery of a particular product. Increase the quantity of the
  * product by the given amount.
  *
  * @param id     The ID of the product.
  * @param amount The amount to increase the quantity by.
  */
 public void delivery(int id, int amount) {
 }

 /**
  * Try to find a product in the stock with the given id.
  *
  * @return The identified product, or null if there is none with a matching ID.
  */
 public Product findProduct(int id) {
  // Exercise 4.57
  for (Product product : stock) {
   if (product.getID() == id) {
    return product;
   }
  }

  return null;
 }

 /**
  * Locate a product with the given ID, and return how many of this item are in
  * stock. If the ID does not match any product, return zero.
  *
  * @param id The ID of the product.
  * @return The quantity of the given product in stock.
  */
 public int numberInStock(int id) {
  // Exercise 4.58
  Product foundProduct = this.findProduct(id);

  if (foundProduct == null) {
   return 0;
  }

  return foundProduct.getQuantity();
 }

 /** Print details of all the products. */
 public void printProductDetails() {
  // Exercise 4.56
  stock.forEach(product -> {
   System.out.println(product.toString());
  });
 }
}
