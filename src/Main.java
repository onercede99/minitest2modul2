//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1,"Keo",2300.,15);
        products[1] = new Product(2,"Banh",3000.0,55);
        products[2] = new Product(3,"Kem",38000.0,14);
        products[3] = new Product(4,"MyTom",3421.0,56);
        products[4] = new Product(5,"Thuocla",25000.0,77);

        System.out.println(products[0]);
        System.out.println(products[1]);
        System.out.println(products[2]);
        System.out.println(products[3]);
        System.out.println(products[4]);

        String search = "Keo";
        System.out.println("Tim kiem san pham " + search + ":");
        boolean found = false;
        for (Product product : products) {
            if(product.getName().equals(search)) {
                System.out.println(product);
                found = true;
                break;
            }
            if (!found) {
                System.out.println("khong tim thay");
            }
        }

        System.out.println("\nSản phẩm giá > 1.000.000:");
        for (Product product : products) {
            if (product.getPrice() > 10000) {
                System.out.println(product);
            }
        }

        System.out.println("\n Sản phẩm tồn kho lớn nhất");
        Product maxProduct = products[0];
        int maxQuantity = products[0].getQuantity();
        for (Product product : products) {
            if (product == null) break; // Dừng nếu gặp phần tử null
            if (product.getQuantity() > maxQuantity) {
                maxQuantity = product.getQuantity();
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);

        System.out.println("\n Tổng số sản phẩm");
        int totalProducts = products.length;
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice()*product.getQuantity();
        }

        double avgPrice = totalProducts > 0 ? totalValue / totalProducts : 0;
        System.out.println("Tổng số sản phẩm: " + totalProducts);
        System.out.println("Tổng giá trị tồn kho: " + totalValue);
        System.out.println("Giá trung bình: " + avgPrice);

        String changeName = "Kho chính";
        System.out.println("\nTên kho cũ: " + changeName);
        changeName = "Kho miền Nam";
        System.out.println("Tên kho mới: " + changeName);
    

    }
}