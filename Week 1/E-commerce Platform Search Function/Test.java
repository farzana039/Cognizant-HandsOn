public class Test {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "T-shirt", "Clothing"),
            new Product(103, "Coffee Mug", "Kitchen"),
            new Product(104, "Smartphone", "Electronics"),
            new Product(105, "Notebook", "Stationery")
        };
        Product result = LinearSearch(products, "Smartphone");
        System.out.println("Linear Search Result: " + result);
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product binResult = BinarySearch(products, "Smartphone");
        System.out.println("Binary Search Result: " + binResult);
    }
}

