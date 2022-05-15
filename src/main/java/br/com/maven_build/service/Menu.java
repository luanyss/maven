package br.com.maven_build.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.maven_build.model.Product;

public class Menu {

     static List <Product> Products = new ArrayList<>();

     public static void start (List<Product> dbProducts) {
         renderMenu();
     

     try (Scanner keyboard = new Scanner(System.in)) {
         
        int option = keyboard.nextInt();

        while (option != 0){
            switch (option){
                case 1:{
                    ProductService.save(dbProducts);
                    break;

                }

                case 2:{
                    ProductService.list(dbProducts);
                    break;
            
                }

                default: {
                    System.out.println("Escolha uma opção");
                }
            }

            renderMenu();

            option = keyboard.nextInt();
        }

        }catch (Exception e){

            System.err.println(e.getMessage());
        }
    

    private static void renderMenu(){

        System.out.println("=========== MENU ===========");
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Listar produtos");
        System.out.println("0 - Sair");
        System.out.println("============================");
    }

}

    private static void renderMenu() {
    }

}




    

