package writingToFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String write = "C:\\Users\\USER\\Downloads\\writingToFiles\\src\\writingToFile\\output.txt ";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(write));
            writer.write("Id \t \t  Name \t     Price \t  Quantity\n");
            writer.append(String.valueOf(addProduct()));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static ArrayList<Product> addProduct() {
            ArrayList<Product> newProduct = new ArrayList<>();
        Product product;
        int stopper = -1;
        int idAssignment = 1;
        while (stopper!=0){
            String productId = "000"+idAssignment;
            idAssignment++;
          String name = input("Enter product name: ");
          int quantity = Integer.parseInt(input("Enter product quantity: "));
          double price = Double.parseDouble(input("Enter Price: "));
          product = new Product(productId,name,quantity,price);
          newProduct.add(product);
          stopper = Integer.parseInt(input("press 0 to stop: "));
        }

        return newProduct;
        }

        public static String input(String statement){
            Scanner input = new Scanner(System.in);
            System.out.print (statement);
            return input.nextLine();
        }

}
