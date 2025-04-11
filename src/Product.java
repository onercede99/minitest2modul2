public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public static String storeName = "Kho tong ABC";
    public static int totalProduct;
    public static double totalInventoryvalue;

    public Product (int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void display() {
        System.out.println(id + " " + name + " " + price + " " + quantity);
    }

    public int getId() {
        return id;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static double getTotalInventoryvalue(double price, double quantity) {
        return price * quantity;
    }

    public static void setStoreName(String storeName) {
        Product.storeName = storeName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
