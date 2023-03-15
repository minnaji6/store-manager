import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Store {
    private List<Product> productList;
    private Map<Integer, Product> productMap;
    
    public Store() {
        this.productList = new ArrayList<>();
        this.productMap = new HashMap<>();
    }
    
    public void addProduct(Product product) {
        productList.add(product);
        productMap.put(product.getId(), product);
    }
    
    public void removeProduct(int id) {
        if (productMap.containsKey(id)) {
            Product product = productMap.get(id);
            productList.remove(product);
            productMap.remove(id);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    public void listAllProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    
    public void searchProduct(int id) {
        if (productMap.containsKey(id)) {
            Product product = productMap.get(id);
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }
    }
}
