package platform_search;

public class Main {
 public static void main(String[] args) {
     Product[] products = {
         new Product(104, "Keyboard", "Electronics"),
         new Product(101, "Laptop", "Electronics"),
         new Product(105, "Shoes", "Footwear"),
         new Product(102, "Mouse", "Electronics"),
         new Product(103, "T-Shirt", "Apparel")
     };

     System.out.println("Linear Search:");
     Product foundLinear = ProductSearch.linearSearch(products, 105);
     System.out.println(foundLinear != null ? foundLinear : "Product not found");

     ProductSearch.sortProductsById(products);

     System.out.println("\nBinary Search:");
     Product foundBinary = ProductSearch.binarySearch(products, 105);
     System.out.println(foundBinary != null ? foundBinary : "Product not found");
 }
}
