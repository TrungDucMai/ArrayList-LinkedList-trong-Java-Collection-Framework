import com.company.Product;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManger {
    List<Product> productManger = new ArrayList<>();
    public String managerName;

    public ProductManger() {
    }

    public ProductManger(List<Product> productManger, String managerName) {
        this.productManger = productManger;
        this.managerName = managerName;
    }

    public List<Product> getProductManger() {
        return productManger;
    }

    public void setProductManger(List<Product> productManger) {
        this.productManger = productManger;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void showAll() {
        for (int i = 0; i < productManger.size(); i++) {
            System.out.println(productManger.get(i));
        }
    }

    public void addProduct(Product product) {
        productManger.add(product);
    }

    public void removeProduct(Product product) {
        productManger.remove(product);
    }

    public void editProduct(Product product, int index) {
        productManger.set(index, product);
    }

    public void searchingByName(String productName) {
        for (int i = 0; i < productManger.size(); i++) {
            if (((Product) productManger).getName().equals(productName)) {
                System.out.println("Found it !");
            } else {
                System.out.println("Sowwy");
            }
        }
    }

    public void sortProductList (){
        productManger.sort(Comparator.naturalOrder());
    }
}
