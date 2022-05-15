package br.com.maven_build.service;

import java.util.List;
import java.util.Scanner;

import br.com.maven_build.model.Product;

public class ProductService {

    public static void list(List<Product> list) {
        double total = 0;
        if (list.size() == 0) {
            System.out.println();
            System.out.println("||=> Nenhum produto disponível");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("-----------------------------------------");
            for (Product p : list) {
                System.out.println(p);
                total += p.getPrice();
            }
            System.out.println("-----------------------------------------");
            System.out.println("||=> TOTAL = " + total);
            System.out.println();

        }
    }
    


    public static void save(List<Product> dbProducts){
        
        int i = 1;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("nome do produto" + i);
            String name = input.next();
            input.nextLine();

            System.out.println("preço do produto" + i);
            Double price = input.nextDouble();

    
            dbProducts.add(new Product (name, price));
            i++;
        
        
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
}