package ClassWorkWriteToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        ArrayList<Product> product = new ArrayList<>();
        Product newProduct = new Product("001","mango",5,5000);
        Product newProduct2 = new Product("002","paw-paw",3,3000);
        Product newProduct3 = new Product("003","Apple",4,9000);
        product.add(newProduct);product.add(newProduct2);product.add(newProduct3);
String write = "C:\\Users\\USER\\Downloads\\writingToFiles\\src\\ClassWorkWriteToFile\\file.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(write));
            writer.write("Id\t\t    Name\t\t Price\t  Quantity\n");
            writer.write("_______________________________________________\n");
            writer.append(String.valueOf(product));
            writer.close();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
