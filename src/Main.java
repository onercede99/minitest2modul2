public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Keo", 2300, 15);
        products[1] = new Product(2, "Banh", 3000, 55);
        products[2] = new Product(3, "Kem", 38000, 14);
        products[3] = new Product(4, "MyTom", 34212, 56);
        products[4] = new Product(5, "Thuocla", 25000, 77);

        System.out.println(products[0]);
        System.out.println(products[1]);
        System.out.println(products[2]);
        System.out.println(products[3]);
        System.out.println(products[4]);

        String search = "Keo";
        System.out.println("\nTìm kiếm sản phẩm " + search + ":");
        boolean found = false;
        for (Product product : products) {
            if (product != null && product.getName().equals(search)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy");
        }

        System.out.println("\nSản phẩm giá > 1.000.000:");
        boolean hasExpensive = false;
        for (Product product : products) {
            if (product != null && product.getPrice() > 1000000) {
                System.out.println(product);
                hasExpensive = true;
            }
        }
        if (!hasExpensive) {
            System.out.println("Không có sản phẩm nào giá > 1.000.000");
        }


        Product maxProduct = getProduct(products);
        if (maxProduct != null) {
            System.out.println(maxProduct);
        }

        System.out.println("\nThống kê:");
        int totalProducts = products.length;
        double totalValue = Product.getTotalInventoryValue(products);
        double avgPrice = totalProducts > 0 ? totalValue / totalProducts : 0;
        System.out.println("Tổng số sản phẩm: " + totalProducts);
        System.out.println("Tổng giá trị tồn kho: " + totalValue);
        System.out.println("Giá trung bình: " + avgPrice);


        Product.setStoreName("Kho miền Nam");
        System.out.println("Tên kho mới: " + Product.getStoreName());
    }

    private static Product getProduct(Product[] products) {
        System.out.println("\nSản phẩm tồn kho lớn nhất:");
        if (products == null || products.length == 0 || products[0] == null) {
            System.out.println("Kho trống");
            return null;
        }
        Product maxProduct = products[0];
        int maxQuantity = products[0].getQuantity();
        for (Product product : products) {
            if (product == null) break;
            if (product.getQuantity() > maxQuantity) {
                maxQuantity = product.getQuantity();
                maxProduct = product;
            }
        }
        return maxProduct;
    }
}