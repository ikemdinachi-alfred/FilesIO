package ClassWorkWriteToFile;

public class Product {
        private String id;
        private String name;
        private int quantity;
        private double amount;

    public Product(String id, String name, int quantity, double amount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

        public String getId() {
        return id;
    }

        public void setId(String id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public int getQuantity() {
        return quantity;
    }

        public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

        public double getAmount() {
        return amount;
    }

        public void setAmount(double amount) {
        this.amount = amount;
    }

        public String toString(){
        return id+"\t\t"+name+"\t\t"+amount+"\t\t"+quantity+"\n";
    }
}
