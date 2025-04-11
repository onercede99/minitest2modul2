public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public static String storeName = "Kho tổng ABC";

    public Product(int id, String name, double price, int quantity) {
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

    public int getId() {
        return id;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String storeName) {
        Product.storeName = storeName;
    }

    public static double getTotalInventoryValue(Product[] products) {
        double total = 0;
        if (products != null) {
            for (Product product : products) {
                if (product != null) {
                    total += product.getPrice() * product.getQuantity();
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Giá: " + price + ", Số lượng: " + quantity;
    }
}