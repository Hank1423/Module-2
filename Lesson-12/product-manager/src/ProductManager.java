import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product p) {
        productList.add(p);
        System.out.println("Thêm sản phẩm thành công!");
    }

    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        Product p = findById(id);
        if (p != null) {
            p.setName(newName);
            p.setPrice(newPrice);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        Product p = findById(id);
        if (p != null) {
            productList.remove(p);
            return true;
        }
        return false;
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào có tên chứa: " + name);
        }
    }

    public void sortPriceAscending() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Đã sắp xếp danh sách tăng dần theo giá.");
    }

    public void sortPriceDescending() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });
        System.out.println("Đã sắp xếp danh sách giảm dần theo giá.");
    }
}