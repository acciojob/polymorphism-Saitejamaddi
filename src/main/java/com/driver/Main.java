package com.driver;

class Product{
  public int product(int x, int y){
    return (x*y);
  }
  public double product(double x, double y){
    return (x*y);
  }
  public int product(int x, int y, int z){
    return (x*y*z);
  }
}

public class Main {

  public static void main(String[] args){
    Product p = new Product();
    p.product(4, 5);
    p.product(5, 6, 2);
    p.product(2.3, 5.4);
  
  }
}
