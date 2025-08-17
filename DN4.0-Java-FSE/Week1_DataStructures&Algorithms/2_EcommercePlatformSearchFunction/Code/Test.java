package ecommercePlatformSearchFunction;

public class Test {

	public static void main(String[] args) {
		
		Product[] unsortedproducts = new Product[5];
		Product[] sortedproducts = new Product[5];
		LinearSearch l = new LinearSearch();
		BinarySearch b = new BinarySearch();
		
		unsortedproducts[0] = new Product(102, "Shoes", "Fashion");
		unsortedproducts[1] = new Product(105, "Watch", "Accessories");
		unsortedproducts[2] = new Product(104, "Headphones", "Electronics");
		unsortedproducts[3] = new Product(101, "Laptop", "Electronics");
		unsortedproducts[4] = new Product(103, "Book", "Stationery");
		l.searchById(unsortedproducts, 104);
		l.searchById(unsortedproducts, 625);
		
		sortedproducts[0] = new Product(101, "Laptop", "Electronics");
		sortedproducts[1] = new Product(102, "Shoes", "Fashion");
		sortedproducts[2] = new Product(103, "Book", "Stationery");
		sortedproducts[3] = new Product(104, "Headphones", "Electronics");
		sortedproducts[4] = new Product(105, "Watch", "Accessories");
		b.searchById(sortedproducts, 101);
		b.searchById(sortedproducts, 999);
		

	}

}
