package application;

import models.entities.Department;
import models.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 30000.0, obj);
        System.out.println(seller);
    }
}
