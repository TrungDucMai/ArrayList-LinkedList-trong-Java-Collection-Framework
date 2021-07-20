package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Product product1 = new Product("c01", "Milk", 10);
      Product product2 = new Product("c02", "Cookie", 14);
      Product product3 = new Product("c03", "Paper", 5);


        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);


    }
}
