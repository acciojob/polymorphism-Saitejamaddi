package com.driver;

public class Main {

    public class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Product p = obj.new Product();
        p.product(4, 5);
        p.product(5, 6, 2);
        p.product(2.3, 5.4);
    }
}
